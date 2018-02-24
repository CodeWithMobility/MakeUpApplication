package com.mobiledev.makeapp.ui.producttype;

import android.view.View;
import android.widget.TextView;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseViewHolder;
import com.mobiledev.makeapp.ui.tag.TagListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by manu on 2/24/2018.
 */

public class ProductTypeViewHolder extends BaseViewHolder {


    ProductTypeListAdapter.OnTypeClickListener onTypeClickListener;

    View itemView;

    @BindView(R.id.titleTV)
    TextView titleTV;

    String typeName;

    public ProductTypeViewHolder(View itemView, ProductTypeListAdapter.OnTypeClickListener onTypeClickListener) {
        super(itemView);

        this.itemView = itemView;
        this.onTypeClickListener = onTypeClickListener;
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(Object model) {
        typeName = model.toString();
        titleTV.setText(model.toString());
    }

    @OnClick(R.id.card_view)
    public void onTypeClick() {
        if (onTypeClickListener != null) {
            onTypeClickListener.onTypeClick(typeName, itemView);
        }

    }
}