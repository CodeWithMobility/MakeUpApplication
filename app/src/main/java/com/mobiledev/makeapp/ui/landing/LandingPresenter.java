package com.mobiledev.makeapp.ui.landing;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/21/2018.
 */



@PerActivity
public interface LandingPresenter<V extends LandingView> extends MvpPresenter<V> {
    void fetchProductAll();

}