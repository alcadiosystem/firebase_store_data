package com.alcadio.cityguideapp.common.presentation;

import android.app.Application;
import android.content.Context;

public class CityGuideApp extends Application {

    private static CityGuideApp instance;

    public static CityGuideApp getInstance(){return instance;}

    public static Context getContext() { return instance;}

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }
}
