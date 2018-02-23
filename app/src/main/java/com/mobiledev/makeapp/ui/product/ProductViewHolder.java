package com.mobiledev.makeapp.ui.product;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.ui.base.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by manu on 2/19/2018.
 */

public class ProductViewHolder extends BaseViewHolder {



    ProductAdapter.OnProductClickListener onProductClickListener;

    View itemView;

    @BindView(R.id.my_image_view)
    SimpleDraweeView imageView;

    @BindView(R.id.titleTV)
    TextView titleTV;

    ProductModel productModel;

    public ProductViewHolder(View itemView, ProductAdapter.OnProductClickListener onProductClickListener) {
        super(itemView);
        this.itemView = itemView;
        this.onProductClickListener = onProductClickListener;
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(Object model) {
        productModel = (ProductModel)model;
        Uri uri = Uri.parse(productModel.getImage_link());
        imageView.setImageURI(uri);
        titleTV.setText(productModel.getName());
    }

    @OnClick(R.id.card_view)
    public void onMovieClick() {
        if (onProductClickListener != null) {
            onProductClickListener.onProductClick(productModel, itemView);
        }
    }

}
