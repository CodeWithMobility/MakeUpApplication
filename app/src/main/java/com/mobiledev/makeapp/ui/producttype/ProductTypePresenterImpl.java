package com.mobiledev.makeapp.ui.producttype;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import com.mobiledev.makeapp.utils.arrayUtils.ArrayUtils;

import java.util.Arrays;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/24/2018.
 */



public class ProductTypePresenterImpl<V extends ProductTypeView> extends BasePresenter<V> implements ProductTypePresenter<V> {

    @Inject
    public ProductTypePresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }



    @Override
    public void fetchTypeListAll() {
        ArrayUtils arrayUtils = new ArrayUtils();
        getMvpView().onGettingTypeList(Arrays.asList(arrayUtils.getTypeList()));
    }
}