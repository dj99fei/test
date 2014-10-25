package com.vine.vinemars;

import android.app.Application;

import com.vine.vinemars.domain.User;
import com.vine.vinemars.net.MyVolley;

import java.util.Locale;

/**
 * Created by chengfei on 14-10-21.
 */
public class MyApplication extends Application {
    static MyApplication myApp;
    static User user;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
        MyVolley.init(this);
    }

    public static MyApplication get() {
        return myApp;
    }

    public static Locale getLocal() {
        return myApp.getResources().getConfiguration().locale;
    }

    public static void setUser(User user) {
        MyApplication.user = user;
    }

    public static boolean isSignined() {
        return user != null && user.isSigined();
    }
}
