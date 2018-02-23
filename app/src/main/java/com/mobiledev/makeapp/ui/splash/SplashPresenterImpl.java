package com.mobiledev.makeapp.ui.splash;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import com.mobiledev.makeapp.utils.LogUtils.AppLogger;


import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


/**
 * Created by manu on 2/18/2018.
 */

public class SplashPresenterImpl<V extends SplashView> extends BasePresenter<V>
        implements SplashPresenter<V> {



    @Inject
    public SplashPresenterImpl(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
         Observable.timer(3, TimeUnit.SECONDS).subscribe(observer);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    Observer observer = new Observer() {
        @Override
        public void onSubscribe(Disposable d) {

        }

        @Override
        public void onNext(Object o) {
           getMvpView().openMainActivity();
        }

        @Override
        public void onError(Throwable throwable) {
            AppLogger.e(throwable,"Exception While Getting Configuration");
        }

        @Override
        public void onComplete() {

        }
    };
}
