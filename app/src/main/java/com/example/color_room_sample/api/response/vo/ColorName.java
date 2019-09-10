package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorName {
    @SerializedName("value")
    @Expose
    public String value;
    @SerializedName("closest_named_hex")
    @Expose
    private String closestNamedHex;
    @SerializedName("exact_match_name")
    @Expose
    private boolean exactMatchName;
    @SerializedName("distance")
    @Expose
    private long distance;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getClosestNamedHex() {
        return closestNamedHex;
    }

    public void setClosestNamedHex(String closestNamedHex) {
        this.closestNamedHex = closestNamedHex;
    }

    public boolean isExactMatchName() {
        return exactMatchName;
    }

    public void setExactMatchName(boolean exactMatchName) {
        this.exactMatchName = exactMatchName;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}
