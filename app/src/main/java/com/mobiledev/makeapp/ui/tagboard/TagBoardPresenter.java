package com.mobiledev.makeapp.ui.tagboard;

import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.MvpPresenter;

/**
 * Created by manu on 2/22/2018.
 */


@PerActivity
public interface TagBoardPresenter<V extends TagBoardView> extends MvpPresenter<V> {


}