package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rgb {
    @SerializedName("fraction")
    @Expose
    private Fraction fraction;
    @SerializedName("r")
    @Expose
    private long r;
    @SerializedName("g")
    @Expose
    private long g;
    @SerializedName("b")
    @Expose
    private long b;
    @SerializedName("value")
    @Expose
    private String value;

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    public long getR() {
        return r;
    }

    public void setR(long r) {
        this.r = r;
    }

    public long getG() {
        return g;
    }

    public void setG(long g) {
        this.g = g;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public class Fraction {
        @SerializedName("r")
        @Expose
        private float r;
        @SerializedName("g")
        @Expose
        private float g;
        @SerializedName("b")
        @Expose
        private float b;

        public float getR() {
            return r;
        }

        public void setR(float r) {
            this.r = r;
        }

        public float getG() {
            return g;
        }

        public void setG(float g) {
            this.g = g;
        }

        public float getB() {
            return b;
        }

        public void setB(float b) {
            this.b = b;
        }
    }
}
