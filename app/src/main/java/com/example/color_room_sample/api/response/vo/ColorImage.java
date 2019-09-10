package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorImage {
    @SerializedName("bare")
    @Expose
    private String bare;
    @SerializedName("named")
    @Expose
    private String named;

    public String getBare() {
        return bare;
    }

    public void setBare(String bare) {
        this.bare = bare;
    }

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }
}
