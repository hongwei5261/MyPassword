package com.weihong.password.show;

import com.weihong.password.data.DataManager;

/**
 * Created by hongw on 2018/7/22.
 * <p>
 * ViewModel实现接口
 */

class ShowPasswordViewModel {
    IShowPasswordView mView;

    public ShowPasswordViewModel(IShowPasswordView iView) {
        mView = iView;
    }

    public void loadPasswords() {
        mView.show(DataManager.getInstance().queryAll());
    }
}
