package com.mobiledev.makeapp.ui.brand;

import com.mobiledev.makeapp.ui.base.MvpView;

import java.util.List;

/**
 * Created by manu on 2/21/2018.
 */

public interface BrandView extends MvpView{

    void onGettingBrandList(List<String> stringList);
}
