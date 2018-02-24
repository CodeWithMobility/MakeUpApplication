package com.mobiledev.makeapp.ui.producttype;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/24/2018.
 */

@PerActivity
public interface ProductTypePresenter<V extends ProductTypeView> extends MvpPresenter<V> {
    void fetchTypeListAll();

}