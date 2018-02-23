package com.mobiledev.makeapp.ui.brand;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;
import com.mobiledev.makeapp.ui.product.ProductView;

/**
 * Created by manu on 2/21/2018.
 */


@PerActivity
public interface BrandPresenter<V extends BrandView> extends MvpPresenter<V> {


}