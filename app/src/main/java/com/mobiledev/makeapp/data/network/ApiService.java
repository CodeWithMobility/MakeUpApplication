package com.mobiledev.makeapp.data.network;

import com.mobiledev.makeapp.data.model.ProductModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by manu on 2/18/2018.
 */

public interface ApiService {

    @GET("products.json")
    Observable<List<ProductModel>> getProduct(@Query("product_type") String product_type);

    @GET("products.json")
    Observable<List<ProductModel>> getProductAll();

    @GET("products.json")
    Observable<List<ProductModel>> getProductByTag(@Query("product_tags") String product_tags);

}
