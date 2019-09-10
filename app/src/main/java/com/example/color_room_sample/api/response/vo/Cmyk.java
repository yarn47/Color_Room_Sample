package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cmyk {

    @SerializedName("fraction")
    @Expose
    private Fraction fraction;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("c")
    @Expose
    private long c;
    @SerializedName("m")
    @Expose
    private long m;
    @SerializedName("y")
    @Expose
    private long y;
    @SerializedName("k")
    @Expose
    private long k;

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

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getK() {
        return k;
    }

    public void setK(long k) {
        this.k = k;
    }

    public class Fraction {
        @SerializedName("c")
        @Expose
        private float c;
        @SerializedName("m")
        @Expose
        private float m;
        @SerializedName("y")
        @Expose
        private float y;
        @SerializedName("k")
        @Expose
        private float k;

        public float getC() {
            return c;
        }

        public void setC(float c) {
            this.c = c;
        }

        public float getM() {
            return m;
        }

        public void setM(float m) {
            this.m = m;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float getK() {
            return k;
        }

        public void setK(float k) {
            this.k = k;
        }
    }
}
