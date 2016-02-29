package com.dota2apiclient.Models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="apiSettings")
public class ApiSettings {
    private String baseUrl;

    private String key;

    private String steamCommunityUrl;

    //region Getters / Setters
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSteamCommunityUrl() {
        return steamCommunityUrl;
    }

    public void setSteamCommunityUrl(String usernameSearchBaseUrl) {
        this.steamCommunityUrl = usernameSearchBaseUrl;
    }
    //endregion
}
