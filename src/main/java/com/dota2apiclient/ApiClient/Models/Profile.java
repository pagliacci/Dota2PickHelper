package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
    @JsonProperty("steamid")
    private long id;

    @JsonProperty("personaname")
    private String personName;

    @JsonProperty("profileurl")
    private String profileUrl;

    private String avatar;

    @JsonProperty("avatarmedium")
    private String avatarMedium;

    @JsonProperty("avatarfull")
    private String avatarFull;

    @JsonProperty("realname")
    private String realName;

    @JsonProperty("primaryclanid")
    private String primaryClanId;

    @JsonProperty("loccountrycode")
    private String locCountryCode;

    //region Getters / Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarMedium() {
        return avatarMedium;
    }

    public void setAvatarMedium(String avatarMedium) {
        this.avatarMedium = avatarMedium;
    }

    public String getAvatarFull() {
        return avatarFull;
    }

    public void setAvatarFull(String avatarFull) {
        this.avatarFull = avatarFull;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPrimaryClanId() {
        return primaryClanId;
    }

    public void setPrimaryClanId(String primaryClanId) {
        this.primaryClanId = primaryClanId;
    }

    public String getLocCountryCode() {
        return locCountryCode;
    }

    public void setLocCountryCode(String locCountryCode) {
        this.locCountryCode = locCountryCode;
    }

    //endregion

//"steamid": "76561197996308418",
//"communityvisibilitystate": 3,
//"profilestate": 1,
//"personaname": "blind_lemon",
//"lastlogoff": 1456522869,
//"profileurl": "http://steamcommunity.com/id/blind_lemon/",
//"avatar": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/0d/0d50f669be8d2cdc1e859c38dc127ab4d7d5a023.jpg",
//"avatarmedium": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/0d/0d50f669be8d2cdc1e859c38dc127ab4d7d5a023_medium.jpg",
//"avatarfull": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/0d/0d50f669be8d2cdc1e859c38dc127ab4d7d5a023_full.jpg",
//"personastate": 1,
//"realname": "Yuri",
//"primaryclanid": "103582791429955528",
//"timecreated": 1201957737,
//"personastateflags": 0,
//"loccountrycode": "RU",
//"locstatecode": "66",
//"loccityid": 42316
}
