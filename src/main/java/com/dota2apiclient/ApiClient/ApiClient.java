package com.dota2apiclient.ApiClient;

import com.dota2apiclient.ApiClient.Models.*;
import com.dota2apiclient.Models.ApiSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiClient {
    @Autowired
    private ApiSettings apiSettings;

    public MatchHistory GetMatchHistory(String accountId) {
        //https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?key=75B98988B4CA0644AB86E2BFBAFA9DB7&account_id=76561197996308418
        RestTemplate template = new RestTemplate();
        Result<MatchHistory> result = template.exchange(getUrl(ApiConstants.Methods.GetMatchHistory, new String[] {"account_id"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<MatchHistory>>() {}, accountId).getBody();
        return result.getResult();
    }

    public MatchDetails GetMatchDetails(String matchId) {
        RestTemplate template = new RestTemplate();
        Result<MatchDetails> result = template.exchange(getUrl(ApiConstants.Methods.GetMatchDetails, new String[] {"match_id"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<MatchDetails>>() {}, matchId).getBody();
        return result.getResult();
    }

    public Heroes GetHeroes() {
        RestTemplate template = new RestTemplate();
        Result<Heroes> result = template.exchange(getUrl(ApiConstants.Methods.GetHeroes, new String[]{"language"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<Heroes>>() {},
                "language=en").getBody();
        return result.getResult();
    }

    public Items GetItems() {
        RestTemplate template = new RestTemplate();
        Result<Items> result = template.exchange(getUrl(ApiConstants.Methods.GetGameItems, new String[]{"language"}),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<Items>>() {},
                "en").getBody();
        return result.getResult();
    }

    private String getUrl(String method, String[] paramNames) {
        StringBuilder result = new StringBuilder(apiSettings.getBaseUrl() + method + "?key=" + apiSettings.getKey());
        for (String param : paramNames) {
            result.append("&").append(param + "={" + param + "}");
        }
        return result.toString();
    }
}
