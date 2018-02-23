package com.mobiledev.makeapp.ui.home;

import com.mobiledev.makeapp.ui.base.MvpView;

/**
 * Created by manu on 2/18/2018.
 */

public interface HomeView extends MvpView {

    void closeNavigationDrawer();

    void lockDrawer();

    void unlockDrawer();
}