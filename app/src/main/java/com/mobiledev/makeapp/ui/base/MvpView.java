package com.mobiledev.makeapp.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by manu on 2/18/2018.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();

}
