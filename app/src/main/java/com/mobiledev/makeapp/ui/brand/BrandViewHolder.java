package com.mobiledev.makeapp.ui.brand;

import android.view.View;
import android.widget.TextView;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by manu on 2/24/2018.
 */

public class BrandViewHolder extends BaseViewHolder {

    BrandListAdapter.OnBrandClickListener onBrandClickListener;

    View itemView;

    @BindView(R.id.titleTV)
    TextView titleTV;

    String brandName;

    public BrandViewHolder(View itemView, BrandListAdapter.OnBrandClickListener onBrandClickListener) {
        super(itemView);

        this.itemView = itemView;
        this.onBrandClickListener = onBrandClickListener;
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(Object model) {
        brandName = model.toString();
        titleTV.setText(model.toString());
    }

    @OnClick(R.id.card_view)
    public void onBrandClick() {
        if (onBrandClickListener != null) {
            onBrandClickListener.onBrandClick(brandName, itemView);
        }

    }
}