package com.mobiledev.makeapp.ui.product;

import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.ui.base.BaseActivity;
import com.mobiledev.makeapp.ui.base.BaseAdapter;
import com.mobiledev.makeapp.ui.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manu on 2/19/2018.
 */

public class ProductAdapter extends BaseAdapter {

    protected ArrayList<ProductModel> productModelArrayList = new ArrayList<>();
    OnProductClickListener onProductClickListener;
    public ProductAdapter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductViewHolder(getInflater().inflate(R.layout.product_row, parent, false),onProductClickListener);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(productModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        if (productModelArrayList == null || productModelArrayList.size() == 0) return 0;
        return productModelArrayList.size();
    }
    public void addItems(List<? extends ProductModel> results) {
        if (results == null || results.size() == 0) return;
        int firstPosition = productModelArrayList.size() == 0 ? 0 : productModelArrayList.size() - 1;
        productModelArrayList.addAll(results);
        notifyItemRangeChanged(firstPosition, results.size());
    }

    public void setOnItemClickListener(OnProductClickListener onProductClickListener) {
        this.onProductClickListener = onProductClickListener;
    }
    interface OnProductClickListener {
       void onProductClick(ProductModel productModel, View v);
    }

}
