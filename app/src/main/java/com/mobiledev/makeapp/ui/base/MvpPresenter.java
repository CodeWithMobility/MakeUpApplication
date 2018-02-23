package com.mobiledev.makeapp.ui.base;

/**
 * Created by manu on 2/18/2018.
 */


/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 */
public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(String error);


}
