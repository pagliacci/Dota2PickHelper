package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

//"account_id": 4294967295,
//        "player_slot": 0,
//        "hero_id": 5,
//        "item_0": 152,
//        "item_1": 79,
//        "item_2": 214,
//        "item_3": 108,
//        "item_4": 21,
//        "item_5": 46,
//        "kills": 5,
//        "deaths": 14,
//        "assists": 19,
//        "leaver_status": 0,
//        "last_hits": 84,
//        "denies": 2,
//        "gold_per_min": 341,
//        "xp_per_min": 500,
//        "level": 22,
//        "gold": 637,
//        "gold_spent": 13310,
//        "hero_damage": 12845,
//        "tower_damage": 43,
//        "hero_healing": 1081,
//        "ability_upgrades": [
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    @JsonProperty("account_id")
    private long accountId;

    @JsonProperty("player_slot")
    private int playerSlot;

    @JsonProperty("item_0")
    private int item0;

    @JsonProperty("item_1")
    private int item1;

    @JsonProperty("item_2")
    private int item2;

    @JsonProperty("item_3")
    private int item3;

    @JsonProperty("item_4")
    private int item4;

    @JsonProperty("item_5")
    private int item5;

    @JsonProperty("item_6")
    private int item6;

    private int kills;

    private int deaths;

    private int assists;

    @JsonProperty("leaver_status")
    private int leaverStatus;

    @JsonProperty("last_hits")
    private int lastHits;

    private int denies;

    @JsonProperty("gold_per_min")
    private int gpm;

    @JsonProperty("xp_per_min")
    private int xpm;

    private int level;

    private int gold;

    @JsonProperty("gold_spent")
    private int goldSpent;

    private int heroDamage;

    private int towerDamage;

    private int heroHealing;

    @JsonProperty("ability_upgrades")
    private List<AbilityUpgrade> abilityUpgrades;

    //region Getters / Setters
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

    public int getItem0() {
        return item0;
    }

    public void setItem0(int item0) {
        this.item0 = item0;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem5() {
        return item5;
    }

    public void setItem5(int item5) {
        this.item5 = item5;
    }

    public int getItem6() {
        return item6;
    }

    public void setItem6(int item6) {
        this.item6 = item6;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getLeaverStatus() {
        return leaverStatus;
    }

    public void setLeaverStatus(int leaverStatus) {
        this.leaverStatus = leaverStatus;
    }

    public int getLastHits() {
        return lastHits;
    }

    public void setLastHits(int lastHits) {
        this.lastHits = lastHits;
    }

    public int getDenies() {
        return denies;
    }

    public void setDenies(int denies) {
        this.denies = denies;
    }

    public int getGpm() {
        return gpm;
    }

    public void setGpm(int gpm) {
        this.gpm = gpm;
    }

    public int getXpm() {
        return xpm;
    }

    public void setXpm(int xpm) {
        this.xpm = xpm;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(int goldSpent) {
        this.goldSpent = goldSpent;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getTowerDamage() {
        return towerDamage;
    }

    public void setTowerDamage(int towerDamage) {
        this.towerDamage = towerDamage;
    }

    public int getHeroHealing() {
        return heroHealing;
    }

    public void setHeroHealing(int heroHealing) {
        this.heroHealing = heroHealing;
    }

    public List<AbilityUpgrade> getAbilityUpgrades() {
        return abilityUpgrades;
    }

    public void setAbilityUpgrades(List<AbilityUpgrade> abilityUpgrades) {
        this.abilityUpgrades = abilityUpgrades;
    }
    //endregion
}
