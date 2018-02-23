package com.mobiledev.makeapp.ui.tag;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/22/2018.
 */


@PerActivity
public interface TagPresenter<V extends TagView> extends MvpPresenter<V> {
    void fetchTagListAll();

}