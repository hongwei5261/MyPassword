package com.weihong.password;

import android.app.Application;

import com.weihong.password.data.DataManager;

/**
 * Created by hongw on 2018/7/8.
 */

public class PasswordApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataManager.getInstance().init(this);
    }
}
