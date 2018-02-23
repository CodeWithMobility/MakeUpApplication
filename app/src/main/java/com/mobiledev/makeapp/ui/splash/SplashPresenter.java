package com.mobiledev.makeapp.ui.splash;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/18/2018.
 */


@PerActivity
public interface SplashPresenter<V extends SplashView> extends MvpPresenter<V> {
}

