package com.weihong.password;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.weihong.password.data.DataManager;
import com.weihong.password.data.PasswordInfo;

/**
 * Created by hongw on 2018/7/8.
 */

public class ShowPasswordActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    PasswordAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_passwords);
        initView();
        initData();
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new PasswordAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.replaceData(DataManager.getInstance().queryAll());

        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                PasswordInfo item = (PasswordInfo) adapter.getData().get(position);
                Intent intent = new Intent(ShowPasswordActivity.this, PasswordDetailActivity.class);
                intent.putExtra(Constants.KEY_ACCOUNT_NAME, item.getAccountName());
                intent.putExtra(Constants.KEY_USERNAME, item.getUsername());
                intent.putExtra(Constants.KEY_PASSWORD, item.getPassword());
                startActivity(intent);
            }
        });
    }

    private class PasswordAdapter extends BaseQuickAdapter<PasswordInfo, BaseViewHolder> {

        public PasswordAdapter() {
            super(android.R.layout.simple_list_item_1, null);
        }

        @Override
        protected void convert(BaseViewHolder helper, PasswordInfo item) {
            helper.setText(android.R.id.text1, item.getAccountName());
        }
    }
}
