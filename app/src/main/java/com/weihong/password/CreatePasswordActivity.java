package com.weihong.password;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.weihong.password.data.DataManager;
import com.weihong.password.data.PasswordInfo;

/**
 * Created by hongw on 2018/7/8.
 */

public class CreatePasswordActivity extends AppCompatActivity {

    EditText mAccountNameEdit;
    EditText mUserNameEdit;
    EditText mPasswordEdit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);
        initView();
    }

    private void initView() {
        mAccountNameEdit = findViewById(R.id.account_name);
        mUserNameEdit = findViewById(R.id.username);
        mPasswordEdit = findViewById(R.id.password);
    }

    public void onClick(View view) {
        if (checkEmpty()) {
            return;
        }

        long rowId = DataManager.getInstance().insertOrReplace(getPasswordInfo());
        if (rowId >= 0) {
            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private boolean checkEmpty() {
        if (TextUtils.isEmpty(mAccountNameEdit.getText().toString()) ||
                TextUtils.isEmpty(mUserNameEdit.getText().toString()) ||
                TextUtils.isEmpty(mPasswordEdit.getText().toString())) {
            Toast.makeText(this, "账户名，用户名和密码都不能为空", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    private PasswordInfo getPasswordInfo() {
        PasswordInfo info = new PasswordInfo();
        info.setAccountName(mAccountNameEdit.getText().toString());
        info.setUsername(mUserNameEdit.getText().toString());
        info.setPassword(mPasswordEdit.getText().toString());
        return info;
    }
}
