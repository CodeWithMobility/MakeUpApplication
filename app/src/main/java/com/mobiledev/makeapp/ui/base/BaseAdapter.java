package com.mobiledev.makeapp.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

/**
 * Created by manu on 2/19/2018.
 */

public abstract class BaseAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    protected LayoutInflater inflater;

    public BaseAdapter(BaseActivity activity) {
        inflater = LayoutInflater.from(activity);
    }

    public LayoutInflater getInflater() {
        return inflater;
    }
}