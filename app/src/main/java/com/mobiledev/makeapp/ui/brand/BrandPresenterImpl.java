package com.mobiledev.makeapp.ui.brand;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import com.mobiledev.makeapp.ui.product.ProductPresenter;
import com.mobiledev.makeapp.ui.product.ProductView;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/21/2018.
 */


public class BrandPresenterImpl<V extends BrandView> extends BasePresenter<V> implements BrandPresenter<V> {

    @Inject
    public BrandPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }
}