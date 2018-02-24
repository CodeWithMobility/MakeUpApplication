package com.mobiledev.makeapp.data.network;

import com.mobiledev.makeapp.data.model.ProductModel;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import retrofit2.Retrofit;

/**
 * Created by manu on 2/18/2018.
 */
@Singleton
public class AppApiHelper implements IApiHelper {


    private ApiService mApiService;

    @Inject
    public AppApiHelper(Retrofit ref) {
        mApiService = ref.create(ApiService.class);
    }


    @Override
    public Observable<List<ProductModel>> getProductByType(String productType) {
        return mApiService.getProductByType( productType);

    }

    @Override
    public Observable<List<ProductModel>> getProductByTag(String tagname) {
        return mApiService.getProductByTag(tagname);
    }


    @Override
    public Observable<List<ProductModel>> getProductByBrand(String brandName) {
        return mApiService.getProductByBrand(brandName);
    }


    @Override
    public Observable<List<ProductModel>> getProductAll() {
        return mApiService.getProductAll();

    }
}