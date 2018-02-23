package com.mobiledev.makeapp.ui.details;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.ui.base.BaseActivity;

import java.lang.reflect.Type;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by manu on 2/20/2018.
 */

public class DetailsActivity extends BaseActivity implements DetailsView{

    @Inject
    DetailsPresenter<DetailsView> mPresenter;
    ProductModel productModel;

    @BindView(R.id.titleTV)
    TextView titleTV;

    @BindView(R.id.headerView)
    SimpleDraweeView imageIV;

    @BindView(R.id.brandTV)
    TextView brandTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        Gson gson = new Gson();
        String stringProduct = getIntent().getStringExtra("PRODUCT");
        if(stringProduct != null) {
            Type type = new TypeToken<ProductModel>() {
            }.getType();
            productModel = gson.fromJson(stringProduct, type);
            titleTV.setText(productModel.getName());
            Uri uri = Uri.parse(productModel.getImage_link());
            imageIV.setImageURI(uri);
            brandTV.setText(productModel.getBrand());
        }

    }

    @Override
    protected void setUp() {

    }
}
