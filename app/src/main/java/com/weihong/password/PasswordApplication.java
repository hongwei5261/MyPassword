package com.weihong.password;

import android.app.Application;
import android.support.multidex.MultiDexApplication;

import com.weihong.password.data.DataManager;

/**
 * Created by hongw on 2018/7/8.
 */

public class PasswordApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        DataManager.getInstance().init(this);
    }
}
