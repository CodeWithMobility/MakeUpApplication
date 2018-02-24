package com.mobiledev.makeapp.ui.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.di.component.ActivityComponent;
import com.mobiledev.makeapp.ui.base.BaseFragment;
import com.mobiledev.makeapp.ui.details.DetailsActivity;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by manu on 2/18/2018.
 */

public class ProductFragment  extends BaseFragment implements ProductView,ProductAdapter.OnProductClickListener {

    @Inject
    ProductPresenter<ProductView> mPresenter;

    private Unbinder bind;

    private View rootView;

    @BindView(R.id.recyclerViewProduct)
    RecyclerView recyclerView;

    @Inject
    ProductAdapter productAdapter;

    @Inject
    GridLayoutManager mLayoutManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_products,container,false);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            mPresenter.onAttach(this);
        }
        bind = ButterKnife.bind(this, rootView);
        return rootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        productAdapter.setOnItemClickListener(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(productAdapter);
        //Log.e("Product  == > ", ""+productIndex);

        switch (productIndex){
            case 0:{
                mPresenter.fetchProductAll();
            }
            break;
            case 1:{
                mPresenter.fetchProductbyType(object.toString());
            }
            break;

            case 2:{
                mPresenter.fetchProductbyBrand(object.toString());
            }
            break;
            case 3:{
                mPresenter.fetchProductbyTag(object.toString());
            }
            break;
        }

    }

    @Override
    protected void setUp(View view) {
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onGettingProductList(List<ProductModel> productModelList) {
        productAdapter.addItems(productModelList);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.onDetach();
        bind.unbind();
    }

    @Override
    public void onProductClick(ProductModel productModel, View v) {
        Gson gson = new Gson();
        Type type = new TypeToken<ProductModel>() {}.getType();
        String json = gson.toJson(productModel, type);
        Intent intent = new Intent(getActivity(), DetailsActivity.class);
        intent.putExtra("PRODUCT", json);
        startActivity(intent);
    }
}
