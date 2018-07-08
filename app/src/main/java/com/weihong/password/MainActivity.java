package com.weihong.password;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by hongw on 2018/7/8.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.create_account_password:
                startActivity(new Intent(this, CreatePasswordActivity.class));
                break;
            case R.id.show_all_password:
                startActivity(new Intent(this, ShowPasswordActivity.class));
                break;
            default:
        }
    }
}
