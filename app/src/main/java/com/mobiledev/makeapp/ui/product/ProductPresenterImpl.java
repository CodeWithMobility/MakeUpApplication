package com.mobiledev.makeapp.ui.product;


import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.ui.base.BasePresenter;
import com.mobiledev.makeapp.utils.LogUtils.AppLogger;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.Timed;

/**
 * Created by manu on 2/18/2018.
 */

public class ProductPresenterImpl<V extends ProductView> extends BasePresenter<V> implements ProductPresenter<V> {

    @Inject
    public ProductPresenterImpl(DataManager controller, CompositeDisposable compositeDisposable) {
        super(controller, compositeDisposable);
    }

    @Override
    public void fetchProductAll() {

        getMvpView().showLoading();
//
//        getCompositeDisposable().add(getDataManager()
//                .getProduct("blush")
//                .timeInterval()
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribeWith(new DisposableObserver<Timed<List<ProductModel>>>() {
//                    @Override
//                    public void onComplete() {
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//                        getMvpView().hideLoading();
//                        AppLogger.e(throwable,"Get Product");
//                    }
//
//                    @Override
//                    public void onNext(Timed<List<ProductModel>> productModels) {
//                        getMvpView().hideLoading();
//                        getMvpView().onGettingProductList(productModels.value());
//                    }
//                }));



        getCompositeDisposable().add(getDataManager()
                .getProductAll()
                .timeInterval()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Timed<List<ProductModel>>>() {
                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(Throwable error) {
                        getMvpView().hideLoading();
                    }

                    @Override
                    public void onNext(Timed<List<ProductModel>> productModels) {
                        getMvpView().hideLoading();
                        getMvpView().onGettingProductList(productModels.value());
                    }
                }));



    }

    @Override
    public void fetchProductbyTag(String tagName) {
        getCompositeDisposable().add(getDataManager()
                .getProductByTag(tagName)
                .timeInterval()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Timed<List<ProductModel>>>() {
                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(Throwable error) {
                        getMvpView().hideLoading();
                    }

                    @Override
                    public void onNext(Timed<List<ProductModel>> productModels) {
                        getMvpView().hideLoading();
                        getMvpView().onGettingProductList(productModels.value());
                    }
                }));

    }


}
