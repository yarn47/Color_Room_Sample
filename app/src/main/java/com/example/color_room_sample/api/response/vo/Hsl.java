package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hsl {
    @SerializedName("fraction")
    @Expose
    private Fraction fraction;
    @SerializedName("h")
    @Expose
    private long h;
    @SerializedName("s")
    @Expose
    private long s;
    @SerializedName("l")
    @Expose
    private long l;
    @SerializedName("value")
    @Expose
    private String value;

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
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

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public class Fraction {
        @SerializedName("h")
        @Expose
        private float h;
        @SerializedName("s")
        @Expose
        private float s;
        @SerializedName("l")
        @Expose
        private float l;

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

        public float getL() {
            return l;
        }

        public void setL(float l) {
            this.l = l;
        }
    }
}
