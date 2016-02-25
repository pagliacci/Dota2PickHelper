package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityUpgrade {
    private long ability;

    private long time;

    private int level;

    //region Getters / Setters
    public long getAbility() {
        return ability;
    }

    public void setAbility(long ability) {
        this.ability = ability;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    //endregion
}
//"ability": 5127,
//        "time": 158,
//        "level": 1