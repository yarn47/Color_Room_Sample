package com.example.color_room_sample.api.response;

import android.media.Image;

import com.example.color_room_sample.api.response.vo.Cmyk;
import com.example.color_room_sample.api.response.vo.ColorImage;
import com.example.color_room_sample.api.response.vo.ColorLink;
import com.example.color_room_sample.api.response.vo.ColorName;
import com.example.color_room_sample.api.response.vo.Contrast;
import com.example.color_room_sample.api.response.vo.Embedded;
import com.example.color_room_sample.api.response.vo.Hex;
import com.example.color_room_sample.api.response.vo.Hsl;
import com.example.color_room_sample.api.response.vo.Hsv;
import com.example.color_room_sample.api.response.vo.Rgb;
import com.example.color_room_sample.api.response.vo.Xyz;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorInfo {
    @SerializedName("hex")
    @Expose
    private Hex hex;
    @SerializedName("rgb")
    @Expose
    private Rgb rgb;
    @SerializedName("hsl")
    @Expose
    private Hsl hsl;
    @SerializedName("hsv")
    @Expose
    private Hsv hsv;
    @SerializedName("name")
    @Expose
    private ColorName name;
    @SerializedName("cmyk")
    @Expose
    private Cmyk cmyk;
    @SerializedName("XYZ")
    @Expose
    private Xyz xYZ;
    @SerializedName("image")
    @Expose
    private ColorImage image;
    @SerializedName("contrast")
    @Expose
    private Contrast contrast;
    @SerializedName("_links")
    @Expose
    private ColorLink links;
    @SerializedName("_embedded")
    @Expose
    private Embedded embedded;

    public Hex getHex() {
        return hex;
    }

    public void setHex(Hex hex) {
        this.hex = hex;
    }

    public Rgb getRgb() {
        return rgb;
    }

    public void setRgb(Rgb rgb) {
        this.rgb = rgb;
    }

    public Hsl getHsl() {
        return hsl;
    }

    public void setHsl(Hsl hsl) {
        this.hsl = hsl;
    }

    public Hsv getHsv() {
        return hsv;
    }

    public void setHsv(Hsv hsv) {
        this.hsv = hsv;
    }

    public ColorName getName() {
        return name;
    }

    public void setName(ColorName name) {
        this.name = name;
    }

    public Cmyk getCmyk() {
        return cmyk;
    }

    public void setCmyk(Cmyk cmyk) {
        this.cmyk = cmyk;
    }

    public Xyz getxYZ() {
        return xYZ;
    }

    public void setxYZ(Xyz xYZ) {
        this.xYZ = xYZ;
    }

    public ColorImage getImage() {
        return image;
    }

    public void setImage(ColorImage image) {
        this.image = image;
    }

    public Contrast getContrast() {
        return contrast;
    }

    public void setContrast(Contrast contrast) {
        this.contrast = contrast;
    }

    public ColorLink getLinks() {
        return links;
    }

    public void setLinks(ColorLink links) {
        this.links = links;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }
}
