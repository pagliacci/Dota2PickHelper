package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private long id;

    private String name;

    private int cost;

    @JsonProperty("secret_shop")
    private int secretShop;

    @JsonProperty("side_shop")
    private int sideShop;

    private int recipe;

    @JsonProperty("localized_name")
    private String localizedName;

    private String imageUrl;

    //region Getters / Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.imageUrl = "http://cdn.dota2.com/apps/dota2/images/items/<name>_lg.png".replace("<name>", name.replace("item_", ""));
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSecretShop() {
        return secretShop;
    }

    public void setSecretShop(int secretShop) {
        this.secretShop = secretShop;
    }

    public int getSideShop() {
        return sideShop;
    }

    public void setSideShop(int sideShop) {
        this.sideShop = sideShop;
    }

    public int getRecipe() {
        return recipe;
    }

    public void setRecipe(int recipe) {
        this.recipe = recipe;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    //endregion
}
