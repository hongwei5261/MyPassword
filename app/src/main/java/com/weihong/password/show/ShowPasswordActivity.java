package com.weihong.password.show;

import android.content.Intent;
//import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weihong.password.Constants;
import com.weihong.password.PasswordDetailActivity;
import com.weihong.password.R;
import com.weihong.password.data.PasswordInfo;
//import com.weihong.password.databinding.ActivityShowPasswordsBinding;

import java.util.List;

/**
 * Created by hongw on 2018/7/8.
 */

public class ShowPasswordActivity extends AppCompatActivity implements IShowPasswordView {
    ShowPasswordAdapter mAdapter;
//    ActivityShowPasswordsBinding binding;
    ShowPasswordViewModel mShowPasswordViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_show_passwords);
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_show_passwords);
        initView();
        initData();
    }

    private void initView() {
//        mAdapter = new ShowPasswordAdapter();
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//                PasswordInfo item = (PasswordInfo) adapter.getData().get(position);
//                Intent intent = new Intent(ShowPasswordActivity.this, PasswordDetailActivity.class);
//                intent.putExtra(Constants.KEY_PASSWORD_INFO, item);
//                startActivity(intent);
//            }
//        });
    }

    private void initData() {
//        mShowPasswordViewModel = new ShowPasswordViewModel(this);
//        binding.recyclerView.setAdapter(mAdapter);
//        mShowPasswordViewModel.loadPasswords();
    }

    @Override
    public void show(List<PasswordInfo> passwords) {
        mAdapter.replaceData(passwords);
    }
}
