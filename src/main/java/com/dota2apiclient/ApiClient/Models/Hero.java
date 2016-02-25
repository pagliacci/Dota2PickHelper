package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hero {
    private String name;

    private int id;

    @JsonProperty("localized_name")
    private String localizedName;

    private String imageSmall;

    private String imageLarge;

    private String imageFQ;

    private String imageFQVertical;

    public String getImageUrl(ImageSizes size) {
        String base = "http://cdn.dota2.com/apps/dota2/images/heroes/<name>_<suffix>";
        String url = base.replace("<name>", name.replace("npc_dota_hero_", ""));
        switch (size) {
            case SMALL_HORIZONTAL:
                url = url.replace("<suffix>", "sb.png");
                break;
            case LARGE_HORIZONTAL:
                url = url.replace("<suffix>", "lg.png");
                break;
            case FULL_QUALITY_HORIZONTAL:
                url = url.replace("<suffix>", "full.png");
                break;
            case FULL_QUALITY_VERTICAL:
                url = url.replace("<suffix>", "vert.jpg");
                break;
            default:
                url = url.replace("<suffix>", "full.png");
        }
        return url;
    }

    //region Getters / Setters
    public String getImageSmall() {
        return imageSmall;
    }

    public String getImageLarge() {
        return imageLarge;
    }

    public String getImageFQ() {
        return imageFQ;
    }

    public String getImageFQVertical() {
        return imageFQVertical;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.imageSmall = getImageUrl(ImageSizes.SMALL_HORIZONTAL);
        this.imageLarge = getImageUrl(ImageSizes.LARGE_HORIZONTAL);
        this.imageFQ = getImageUrl(ImageSizes.FULL_QUALITY_HORIZONTAL);
        this.imageFQVertical = getImageUrl(ImageSizes.FULL_QUALITY_VERTICAL);
        this.localizedName = localizedName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}