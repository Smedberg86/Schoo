package com.example.sgrn.schoo;

import android.app.Application;
import android.content.Context;

/**
 * Created by sgrn on 2015-03-19.
 */
public class MyApplication extends Application {
    private static MyApplication sInstance;
    @Override
    public void onCreate(){
        super.onCreate();
        sInstance=this;
    }

    public static MyApplication getInstance(){
        return sInstance;
    }
    public static Context getAppContext(){
        return sInstance.getApplicationContext();
    }
}
