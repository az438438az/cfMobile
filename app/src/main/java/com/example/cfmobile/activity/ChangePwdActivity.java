package com.example.cfmobile.activity;

import android.widget.TextView;

import com.example.cfmobile.R;
import com.example.cfmobile.common.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ChangePwdActivity extends BaseActivity {

    @Override
    public int getContentViewId() {
        return R.layout.activity_change_pwd;
    }

    @BindView(R.id.tv_title)
    public TextView tvTitle;

    @Override
    protected void initView() {
        super.initView();
        tvTitle.setText("修改密码");
    }
    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}
