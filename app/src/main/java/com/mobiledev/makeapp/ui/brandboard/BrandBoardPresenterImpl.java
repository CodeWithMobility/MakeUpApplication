package com.mobiledev.makeapp.ui.brandboard;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/24/2018.
 */

public class BrandBoardPresenterImpl  <V extends BrandBoardView> extends BasePresenter<V> implements BrandBoardPresenter<V> {

    @Inject
    public BrandBoardPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }
}