package com.weihong.password.show;

import com.weihong.password.base.IView;
import com.weihong.password.data.PasswordInfo;

import java.util.List;

/**
 * Created by hongw on 2018/7/22.
 * <p>
 * View接口
 */

interface IShowPasswordView extends IView {
    void show(List<PasswordInfo> passwords);
}
