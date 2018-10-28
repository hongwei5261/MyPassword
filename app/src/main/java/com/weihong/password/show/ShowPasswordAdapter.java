package com.weihong.password.show;

import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
//import com.weihong.password.BR;
import com.weihong.password.R;
import com.weihong.password.data.PasswordInfo;

/**
 * Created by hongw on 2018/7/22.
 */

class ShowPasswordAdapter extends BaseQuickAdapter<PasswordInfo, ShowPasswordAdapter.PasswordViewHolder> {

    public ShowPasswordAdapter() {
        super(R.layout.activity_show_password_item, null);
    }

    @Override
    protected void convert(PasswordViewHolder helper, PasswordInfo item) {
//        helper.getBinding().setVariable(BR.passwordInfo, item);
    }

    /**
     * 通过这个方法生成一个binding，并作为ItemView的tag
     *
     * @param layoutResId item布局Id
     * @param parent      父View
     * @return 当前View
     */
    @Override
    protected View getItemView(int layoutResId, ViewGroup parent) {
//        ViewDataBinding binding = DataBindingUtil.inflate(mLayoutInflater, layoutResId, parent, false);
//        if (binding == null) {
//            return super.getItemView(layoutResId, parent);
//        }
//        View view = binding.getRoot();
//        view.setTag(R.id.BaseQuickAdapter_databinding_support, binding);
//        return view;
        return null;
    }

    public static class PasswordViewHolder extends BaseViewHolder {
        public PasswordViewHolder(View view) {
            super(view);
        }

//        public ViewDataBinding getBinding() {
//            return (ViewDataBinding) itemView.getTag(R.id.BaseQuickAdapter_databinding_support);
//        }
    }
}