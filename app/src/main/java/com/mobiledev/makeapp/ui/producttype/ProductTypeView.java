package com.mobiledev.makeapp.ui.producttype;

import com.mobiledev.makeapp.ui.base.MvpView;

import java.util.List;

/**
 * Created by manu on 2/24/2018.
 */

public interface ProductTypeView extends MvpView {
    void onGettingTypeList(List<String> stringList);
}
