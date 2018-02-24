package com.mobiledev.makeapp.ui.producttype;

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
import com.mobiledev.makeapp.ui.home.HomeActivity;
import com.mobiledev.makeapp.ui.producttypeboard.ProductTypeBoardFragment;
import com.mobiledev.makeapp.ui.tagboard.TagBoardFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by manu on 2/24/2018.
 */

public class ProductTypeFragment extends BaseFragment  implements ProductTypeView, ProductTypeListAdapter.OnTypeClickListener {


    @Inject
    ProductTypePresenter<ProductTypeView> mPresenter;

    private Unbinder bind;

    @Inject
    ProductTypeListAdapter productTypeListAdapter;

    @Inject
    LinearLayoutManager mLayoutManager;

    @BindView(R.id.recyclerViewTag)
    RecyclerView recyclerViewTypeList;

    HomeActivity homeActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tag,container,false);
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
        productTypeListAdapter.setOnItemClickListener(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewTypeList.setLayoutManager(mLayoutManager);
        recyclerViewTypeList.setItemAnimator(new DefaultItemAnimator());
        recyclerViewTypeList.setAdapter(productTypeListAdapter);
        mPresenter.fetchTypeListAll();
    }

    @Override
    public void onTypeClick(String s, View v) {
        homeActivity.addFragment(new ProductTypeBoardFragment(),-1, s,true);
    }

    @Override
    public void onGettingTypeList(List<String> stringList) {
        productTypeListAdapter.addItems(stringList);

    }
}