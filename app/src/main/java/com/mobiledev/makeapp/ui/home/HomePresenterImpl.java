package com.mobiledev.makeapp.ui.home;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;


import javax.inject.Inject;
import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by manu on 2/18/2018.
 */



public class HomePresenterImpl<V extends HomeView> extends BasePresenter<V>
        implements HomePresenter<V> {

    @Inject
    public HomePresenterImpl(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager,compositeDisposable);
    }

    @Override
    public void onDrawerOptionAboutClick() {
        getMvpView().closeNavigationDrawer();
     //   getMvpView().showAboutFragment();
    }

    @Override
    public void onDrawerOptionTestClick() {
        getMvpView().closeNavigationDrawer();
      //  getMvpView().showTesttFragment();
    }


    @Override
    public void onViewInitialized() {


    }

    @Override
    public void onNavMenuCreated() {
        if (!isViewAttached()) {
            return;
        }
    }


}