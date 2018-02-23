package com.mobiledev.makeapp.data.network;

import com.mobiledev.makeapp.data.model.ProductModel;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by manu on 2/18/2018.
 */

public interface IApiHelper {


    Observable<List<ProductModel>> getProductAll();
    Observable<List<ProductModel>> getProduct(String productType);
    Observable<List<ProductModel>> getProductByTag(String tagname);

}
