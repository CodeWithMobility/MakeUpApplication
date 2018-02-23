package com.mobiledev.makeapp.ui.tagboard;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/22/2018.
 */



public class TagBoardPresenterImpl<V extends TagBoardView> extends BasePresenter<V> implements TagBoardPresenter<V> {

    @Inject
    public TagBoardPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }
}