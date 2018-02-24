package com.mobiledev.makeapp.ui.brand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.di.component.ActivityComponent;
import com.mobiledev.makeapp.ui.base.BaseFragment;
import com.mobiledev.makeapp.ui.brandboard.BrandBoardFragment;
import com.mobiledev.makeapp.ui.home.HomeActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by manu on 2/21/2018.
 */

public class BrandFragment extends BaseFragment implements BrandView,BrandListAdapter.OnBrandClickListener {

    @Inject
    BrandPresenter<BrandView> mPresenter;

    private Unbinder bind;

    @Inject
    BrandListAdapter brandListAdapter;

    @Inject
    LinearLayoutManager mLayoutManager;

    @BindView(R.id.recyclerViewBrand)
    RecyclerView recyclerViewBrandList;

    HomeActivity homeActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_brand,container,false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            mPresenter.onAttach(this);
        }
        bind = ButterKnife.bind(this, rootView);
        homeActivity = (HomeActivity)getActivity();
        return rootView;
    }

    @Override
    protected void setUp(View view) {
        brandListAdapter.setOnItemClickListener(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewBrandList.setLayoutManager(mLayoutManager);
        recyclerViewBrandList.setItemAnimator(new DefaultItemAnimator());
        recyclerViewBrandList.setAdapter(brandListAdapter);
        mPresenter.fetchBrandListAll();
    }

    @Override
    public void onGettingBrandList(List<String> stringList) {
        brandListAdapter.addItems(stringList);
    }

    @Override
    public void onBrandClick(String s, View v) {
        homeActivity.addFragment(new BrandBoardFragment(),-1, s,true);
    }
}
