package com.mobiledev.makeapp.ui.tag;

import android.view.View;
import android.widget.TextView;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by manu on 2/22/2018.
 */

public class TagViewHolder extends BaseViewHolder {

    TagListAdapter.OnTagClickListener onTagClickListener;

    View itemView;

    @BindView(R.id.titleTV)
    TextView titleTV;

    String tagname;

    public TagViewHolder(View itemView, TagListAdapter.OnTagClickListener onTagClickListener) {
        super(itemView);

        this.itemView = itemView;
        this.onTagClickListener = onTagClickListener;
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(Object model) {
        tagname = model.toString();
        titleTV.setText(model.toString());
    }

    @OnClick(R.id.card_view)
    public void onTagClick() {
        if (onTagClickListener != null) {
            onTagClickListener.onTagClick(tagname, itemView);
        }
    }
}
