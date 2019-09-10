package com.example.color_room_sample.api;

import com.example.color_room_sample.api.response.ColorInfo;

import io.reactivex.Maybe;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ColorAPIService {

    @GET("id")
    Maybe<Response<ColorInfo>> fetchingColorAsHex(@Query("hex") String query);
}
