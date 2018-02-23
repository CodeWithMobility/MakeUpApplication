package com.mobiledev.makeapp.ui.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseFragment;

/**
 * Created by manu on 2/19/2018.
 */

public class TestFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_products,container,false);
        return view;
    }


    @Override
    protected void setUp(View view) {

    }
}
