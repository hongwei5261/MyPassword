package com.weihong.password;

import android.content.ClipboardManager;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.weihong.password.data.PasswordInfo;
import com.weihong.password.databinding.ActivityDetailPasswordBinding;

/**
 * Created by hongw on 2018/7/8.
 */

public class PasswordDetailActivity extends AppCompatActivity {
    ActivityDetailPasswordBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_password);

        // 此处需设置passwordInfo的值，passwordInfo是在布局文件中定义的变量
        binding.setVariable(BR.passwordInfo, getIntent().getParcelableExtra(Constants.KEY_PASSWORD_INFO));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.username_copy:
                copy(binding.username.getText().toString());
                break;
            case R.id.password_copy:
                copy(binding.password.getText().toString());
                break;
            default:
        }
    }

    private void copy(String content) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//        ClipData clipData = ClipData.newPlainText("label", content);
        clipboardManager.setText(content);
    }
}
