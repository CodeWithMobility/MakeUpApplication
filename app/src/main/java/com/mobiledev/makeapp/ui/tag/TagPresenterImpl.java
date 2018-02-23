package com.mobiledev.makeapp.ui.tag;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import com.mobiledev.makeapp.utils.arrayUtils.ArrayUtils;

import java.util.Arrays;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/22/2018.
 */

public class TagPresenterImpl<V extends TagView> extends BasePresenter<V> implements TagPresenter<V> {

    @Inject
    public TagPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }


    @Override
    public void fetchTagListAll() {
        ArrayUtils arrayUtils = new ArrayUtils();
        getMvpView().onGettingTagList(Arrays.asList(arrayUtils.getTagList()));

    }
}