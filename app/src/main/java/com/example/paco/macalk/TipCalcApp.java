package com.example.paco.macalk;

import android.app.Application;
/**
 * Created by paco on 11/11/2016.
 */
public class TipCalcApp extends Application{

    private final static String ABOUT_URL = "https://github.com/franciscop1s3";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
