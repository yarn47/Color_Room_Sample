package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorLink {

    @SerializedName("self")
    @Expose
    private Self self;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public class Self{
        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }
}
