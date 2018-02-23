package com.mobiledev.makeapp.ui.details;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/20/2018.
 */

public class DetailsPresenterImpl<V extends DetailsView> extends BasePresenter<V>
            implements DetailsPresenter<V> {
    @Inject
    public DetailsPresenterImpl(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }
}
