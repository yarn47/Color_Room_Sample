package com.example.color_room_sample.ui;

import com.example.color_room_sample.api.ColorAPIService;
import com.example.color_room_sample.api.response.ColorInfo;

import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class ColorRepository {

    private ColorAPIService colorAPIService;
    private CompositeDisposable disposable = new CompositeDisposable();

    @Inject
    ColorRepository(ColorAPIService colorAPIService) {
        this.colorAPIService = colorAPIService;
    }

    public void fetchingColorInfo(String hexColor, ColorViewModel.ColorCallback colorCallback) {
        Maybe<Response<ColorInfo>> responseMaybe = colorAPIService.fetchingColorAsHex(hexColor);
        disposable.add(responseMaybe.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new DisposableMaybeObserver<Response<ColorInfo>>() {
            @Override
            public void onSuccess(Response<ColorInfo> colorInfoResponse) {
                if(colorInfoResponse.body() != null) {
                    colorCallback.onCallback(colorInfoResponse.body());
                }
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {

            }
        }));

    }
}
