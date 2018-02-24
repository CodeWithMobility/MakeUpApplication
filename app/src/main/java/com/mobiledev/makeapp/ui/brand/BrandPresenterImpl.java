package com.mobiledev.makeapp.ui.brand;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import com.mobiledev.makeapp.utils.arrayUtils.ArrayUtils;

import java.util.Arrays;

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

    @Override
    public void fetchBrandListAll() {
        ArrayUtils arrayUtils = new ArrayUtils();
        getMvpView().onGettingBrandList(Arrays.asList(arrayUtils.getBrandList()));
    }
}