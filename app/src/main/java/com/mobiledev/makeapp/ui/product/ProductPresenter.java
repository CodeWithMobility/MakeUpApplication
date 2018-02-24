package com.mobiledev.makeapp.ui.product;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/18/2018.
 */



@PerActivity
public interface ProductPresenter<V extends ProductView> extends MvpPresenter<V> {
    void fetchProductAll();

    void fetchProductbyTag(String tagName);

    void fetchProductbyBrand(String brandName);

    void fetchProductbyType(String typeName);
   }