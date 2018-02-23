package com.mobiledev.makeapp.ui.home;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/18/2018.
 */




@PerActivity
public interface HomePresenter<V extends HomeView> extends MvpPresenter<V> {

    void onDrawerOptionAboutClick();

    void onDrawerOptionTestClick();

    void onViewInitialized();

    void onNavMenuCreated();
}