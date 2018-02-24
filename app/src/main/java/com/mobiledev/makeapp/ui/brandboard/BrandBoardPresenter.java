package com.mobiledev.makeapp.ui.brandboard;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/24/2018.
 */


@PerActivity
public interface BrandBoardPresenter<V extends BrandBoardView> extends MvpPresenter<V> {


}