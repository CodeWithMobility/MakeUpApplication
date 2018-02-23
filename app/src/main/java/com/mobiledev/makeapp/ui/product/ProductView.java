package com.mobiledev.makeapp.ui.product;

import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.ui.base.MvpView;

import java.util.List;

/**
 * Created by manu on 2/18/2018.
 */

public interface ProductView extends MvpView {

   void onGettingProductList(List<ProductModel> productModelList);
}
