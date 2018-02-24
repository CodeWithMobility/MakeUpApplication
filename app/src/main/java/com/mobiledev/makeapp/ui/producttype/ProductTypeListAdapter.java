package com.mobiledev.makeapp.ui.producttype;

import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.ui.base.BaseActivity;
import com.mobiledev.makeapp.ui.base.BaseAdapter;
import com.mobiledev.makeapp.ui.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manu on 2/24/2018.
 */

public class ProductTypeListAdapter extends BaseAdapter {

    protected ArrayList<String> tagList = new ArrayList<>();
    OnTypeClickListener onTypeClickListener;

    public ProductTypeListAdapter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductTypeViewHolder(getInflater().inflate(R.layout.tag_row,parent, false),onTypeClickListener);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(tagList.get(position));
    }

    @Override
    public int getItemCount() {
        if (tagList == null || tagList.size() == 0) return 0;
        return tagList.size();
    }

    interface OnTypeClickListener {
        void onTypeClick(String s, View v);
    }

    public void addItems(List<? extends String> results) {
        if (results == null || results.size() == 0) return;
        int firstPosition = tagList.size() == 0 ? 0 : tagList.size() - 1;
        tagList.addAll(results);
        //notifyDataSetChanged();
        notifyItemRangeChanged(firstPosition, results.size());
    }
    public void setOnItemClickListener(OnTypeClickListener onTypeClickListener) {
        this.onTypeClickListener = onTypeClickListener;
    }
}
