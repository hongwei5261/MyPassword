package com.weihong.password.data;

import android.content.Context;

import com.weihong.password.Constants;

import java.util.List;

/**
 * Created by hongw on 2018/7/8.
 */

public class DataManager {

    private static DataManager sInstance;
    private DaoSession mDaoSession;

    private DataManager() {
    }

    public static DataManager getInstance() {
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }

    public void init(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, Constants.DB_NAME);
        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());
        mDaoSession = daoMaster.newSession();
    }

    public long insertOrReplace(PasswordInfo info) {
        return mDaoSession.getPasswordInfoDao().insertOrReplace(info);
    }

    public List<PasswordInfo> queryAll() {
        return mDaoSession.getPasswordInfoDao().loadAll();
    }
}
