package com.mobiledev.makeapp.ui.landing;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/21/2018.
 */



public class LandingPresenterImpl<V extends LandingView> extends BasePresenter<V> implements LandingPresenter<V> {

    @Inject
    public LandingPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }

    @Override
    public void fetchProductAll() {

    }
}