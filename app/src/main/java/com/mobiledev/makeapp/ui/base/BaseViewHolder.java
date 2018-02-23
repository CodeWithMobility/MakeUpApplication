package com.mobiledev.makeapp.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mobiledev.makeapp.data.model.ProductModel;

/**
 * Created by manu on 2/19/2018.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(Object model);

}