package com.dota2apiclient.Models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 21.02.2016.
 */
@Component
@ConfigurationProperties(prefix="apiSettings")
public class ApiSettings {
    private String baseUrl;

    private String key;

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
}
