package com.mobiledev.makeapp.ui.details;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/20/2018.
 */
@PerActivity
public interface DetailsPresenter<V extends DetailsView> extends MvpPresenter<V> {

}
