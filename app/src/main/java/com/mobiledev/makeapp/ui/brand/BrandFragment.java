package com.mobiledev.makeapp.ui.brand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseFragment;

import javax.inject.Inject;

import butterknife.Unbinder;

/**
 * Created by manu on 2/21/2018.
 */

public class BrandFragment extends BaseFragment {

    @Inject
    BrandPresenter<BrandView> mPresenter;

    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_brand,container,false);


        return rootView;
    }

    @Override
    protected void setUp(View view) {

    }
}
