package com.mobiledev.makeapp.data;

import android.content.Context;

import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.data.network.IApiHelper;
import com.mobiledev.makeapp.di.scope.ApplicationContext;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by manu on 2/18/2018.
 */
@Singleton
public class AppDataManager implements DataManager {

    /**
     * Application context
     */
    private final Context mContext;

    /**
     * API Helper for network calls
     */
    private final IApiHelper mApiHelper;


    @Inject
    public AppDataManager(@ApplicationContext Context context, IApiHelper apiHelper) {
        mContext = context;
        mApiHelper = apiHelper;
    }

    @Override
    public Observable<List<ProductModel>> getProductAll() {
        return mApiHelper.getProductAll().map(productModel -> productModel);
    }


    @Override
    public Observable<List<ProductModel>> getProduct(String productType) {
        return mApiHelper.getProduct(productType).map(productModel -> productModel);
    }

    @Override
    public Observable<List<ProductModel>> getProductByTag(String tagName) {
        return mApiHelper.getProductByTag(tagName).map(productModel -> productModel);
    }


    //    @Override
//    public Observable<List<ProductModel>> getProductAll() {
//        return mApiHelper.getProductAll().map(new Function<List<ProductModel>, List<ProductModel>>() {
//            @Override
//            public List<ProductModel> apply(List<ProductModel> productModel) throws Exception {
//
//                return productModel;
//            }
//        });
    //   }


}
