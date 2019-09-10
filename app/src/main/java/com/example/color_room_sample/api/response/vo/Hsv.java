package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hsv {

    @SerializedName("fraction")
    @Expose
    private Fraction fraction;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("h")
    @Expose
    private long h;
    @SerializedName("s")
    @Expose
    private long s;
    @SerializedName("v")
    @Expose
    private long v;

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getH() {
        return h;
    }

    public void setH(long h) {
        this.h = h;
    }

    public long getS() {
        return s;
    }

    public void setS(long s) {
        this.s = s;
    }

    public long getV() {
        return v;
    }

    public void setV(long v) {
        this.v = v;
    }

    public class Fraction {
        @SerializedName("h")
        @Expose
        private float h;
        @SerializedName("s")
        @Expose
        private float s;
        @SerializedName("v")
        @Expose
        private float v;

        public float getH() {
            return h;
        }

        public void setH(float h) {
            this.h = h;
        }

        public float getS() {
            return s;
        }

        public void setS(float s) {
            this.s = s;
        }

        public float getV() {
            return v;
        }

        public void setV(float v) {
            this.v = v;
        }
    }
}
