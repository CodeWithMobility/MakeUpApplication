package com.mobiledev.makeapp.ui.producttypeboard;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/24/2018.
 */


public class ProductTypeBoardPresenterImpl<V extends ProductTypeBoardView> extends BasePresenter<V> implements ProductTypeBoardPresenter<V> {

    @Inject
    public ProductTypeBoardPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }
}