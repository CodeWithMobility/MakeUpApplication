package com.mobiledev.makeapp.ui.splash;


import android.content.Intent;
import android.os.Bundle;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseActivity;
import com.mobiledev.makeapp.ui.home.HomeActivity;
import com.mobiledev.makeapp.utils.LogUtils.AppLogger;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashView {

    @Inject
    SplashPresenter<SplashView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(SplashActivity.this);


    }

    @Override
    public void openMainActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }
}