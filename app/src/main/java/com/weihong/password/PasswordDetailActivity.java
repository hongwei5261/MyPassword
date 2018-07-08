package com.weihong.password;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hongw on 2018/7/8.
 */

public class PasswordDetailActivity extends AppCompatActivity {
    TextView mTxtAccountName, mTxtUserName, mTxtPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_password);
        mTxtAccountName = findViewById(R.id.account_name);
        mTxtUserName = findViewById(R.id.username);
        mTxtPassword = findViewById(R.id.password);
        mTxtAccountName.setText(getIntent().getStringExtra(Constants.KEY_ACCOUNT_NAME));
        mTxtUserName.setText(getIntent().getStringExtra(Constants.KEY_USERNAME));
        mTxtPassword.setText(getIntent().getStringExtra(Constants.KEY_PASSWORD));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.username_copy:
                copy(mTxtUserName.getText().toString());
                break;
            case R.id.password_copy:
                copy(mTxtPassword.getText().toString());
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
