package com.dota2apiclient.ApiClient;

import com.dota2apiclient.ApiClient.Models.*;
import com.dota2apiclient.Models.ApiSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class ApiClient {
    @Autowired
    private ApiSettings apiSettings;

    private List<String> cookies;

    public MatchHistory GetMatchHistory(long accountId) {
        //https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?key=75B98988B4CA0644AB86E2BFBAFA9DB7&account_id=76561197996308418
        RestTemplate template = new RestTemplate();
        Result<MatchHistory> result = template.exchange(
                getUrl(ApiConstants.Methods.GetMatchHistory, new String[] {"account_id={account_id}"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<MatchHistory>>() {},
                accountId).getBody();
        return result.getResult();
    }

    public MatchDetails GetMatchDetails(String matchId) {
        RestTemplate template = new RestTemplate();
        Result<MatchDetails> result = template.exchange(
                getUrl(ApiConstants.Methods.GetMatchDetails, new String[] {"match_id={match_id}"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<MatchDetails>>() {},
                matchId).getBody();
        return result.getResult();
    }

    public Heroes GetHeroes() {
        RestTemplate template = new RestTemplate();
        Result<Heroes> result = template.exchange(
                getUrl(ApiConstants.Methods.GetHeroes, new String[]{"language={language}"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<Heroes>>() {},
                "en").getBody();
        return result.getResult();
    }

    public Items GetItems() {
        RestTemplate template = new RestTemplate();
        Result<Items> result = template.exchange(
                getUrl(ApiConstants.Methods.GetGameItems, new String[]{"language={language}"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<Items>>() {},
                "en").getBody();
        return result.getResult();
    }

    public List<Profile> GetProfilesByNickname(String nickname) {
        String sessionId = GetSessionId();

        RestTemplate template = new RestTemplate();

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Cookie", cookies.get(0).split("; ")[0]);
        requestHeaders.add("Cookie", cookies.get(1).split("; ")[0]);
        HttpEntity requestEntity = new HttpEntity(null, requestHeaders);

        UsersResponse response = template.exchange(
                getCommunityUrl(ApiConstants.Methods.GetIdsByUsernameAjax, new String[] {"?filter=users", "text={text}", "sessionid={sessionid}"}),
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<UsersResponse>() {},
                nickname,
                sessionId
        ).getBody();

        String htmlResult = response.getHtml();

        Pattern idPattern = Pattern.compile("<a class=\".*\" href=\"https://steamcommunity.com/profiles/(.*)\">");
        Matcher idMatcher = idPattern.matcher(htmlResult);

        List<Long> ids = new ArrayList<>();
        while (idMatcher.find()) {
            ids.add(Long.parseLong(idMatcher.group(1)));
        }

        Pattern vanityNamePattern = Pattern.compile("<a class=\".*\" href=\"https://steamcommunity.com/id/(.*)\">");
        Matcher vanityNameMatcher = vanityNamePattern.matcher(htmlResult);

        //List<String> vanityNames = new ArrayList<>();
        while(vanityNameMatcher.find()) {
            //vanityNames.add(vanityNameMatcher.group(1));
            ids.add(ResolveVanityName(vanityNameMatcher.group(1)));
        }

        return GetProfileData(ids);
    }

    public List<Profile> GetProfileData(List<Long> steamIds) {
        RestTemplate template = new RestTemplate();
        //http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=75B98988B4CA0644AB86E2BFBAFA9DB7&steamids=76561197996308418

        String ids = Long.toString(steamIds.get(0));
        for (long id : steamIds) {
            ids += "," + id;
        }

        Response<Profiles> result = template.exchange(
                getUrl(ApiConstants.Methods.GetPlayerSummaries, new String[]{"steamids={steamids}"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Response<Profiles>>() {},
                ids
        ).getBody();

        return result.getResponse().getProfiles();
    }

    private long ResolveVanityName(String vanityName) {
        RestTemplate template = new RestTemplate();

        Response<ResolvedVanityName> response = template.exchange(
                getUrl(ApiConstants.Methods.ResolveVanityUrl, new String[]{"vanityurl={vanityurl}"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Response<ResolvedVanityName>>() {},
                vanityName
        ).getBody();

        return response.getResponse().getId();
    }

    private String GetSessionId() {
        RestTemplate template = new RestTemplate();

        ResponseEntity<String> response = template.exchange(
                getCommunityUrl(ApiConstants.Methods.GetIdsByUsername, new String[] {"text=1"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {});

        String htmlResult = response.getBody();
        HttpHeaders headers = response.getHeaders();
        cookies = headers.get("Set-Cookie");

        Pattern pattern = Pattern.compile("g_sessionID = \"(.*)\"");
        Matcher matcher = pattern.matcher(htmlResult);
        matcher.find();
        return matcher.group(1);
    }

    private String getUrl(String method, String[] paramNames) {
        StringBuilder result = new StringBuilder(apiSettings.getBaseUrl() + method + "?key=" + apiSettings.getKey());
        for (String param : paramNames) {
            result.append("&").append(param);
        }
        return result.toString();
    }

    private String getCommunityUrl(String method, String[] params) {
        StringBuilder result = new StringBuilder(apiSettings.getSteamCommunityUrl() + method);
        boolean isFirst = true;
        for (String param : params) {
            if(isFirst) {
                //result.append("?").append(param);
                result.append(param);
                isFirst = false;
                continue;
            }
            result.append("&").append(param);
        }
        return result.toString();
    }
}
