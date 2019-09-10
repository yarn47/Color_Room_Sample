package com.example.color_room_sample.api.response.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Xyz {
    @SerializedName("fraction")
    @Expose
    private Fraction fraction;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("X")
    @Expose
    private long x;
    @SerializedName("Y")
    @Expose
    private long y;
    @SerializedName("Z")
    @Expose
    private long z;

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

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getZ() {
        return z;
    }

    public void setZ(long z) {
        this.z = z;
    }

    public class Fraction {
        @SerializedName("X")
        @Expose
        private float x;
        @SerializedName("Y")
        @Expose
        private float y;
        @SerializedName("Z")
        @Expose
        private float z;

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }
    }
}
