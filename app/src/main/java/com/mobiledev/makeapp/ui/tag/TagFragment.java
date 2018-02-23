package com.mobiledev.makeapp.ui.tag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.di.component.ActivityComponent;
import com.mobiledev.makeapp.ui.base.BaseFragment;
import com.mobiledev.makeapp.ui.home.HomeActivity;
import com.mobiledev.makeapp.ui.tagboard.TagBoardFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by manu on 2/21/2018.
 */

public class TagFragment extends BaseFragment implements TagView, TagListAdapter.OnTagClickListener {


    @Inject
    TagPresenter<TagView> mPresenter;

    private Unbinder bind;

    @Inject
    TagListAdapter tagListAdapter;

    @Inject
    LinearLayoutManager mLayoutManager;

    @BindView(R.id.recyclerViewTag)
    RecyclerView recyclerViewTagList;

    HomeActivity homeActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tag,container,false);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            mPresenter.onAttach(this);
        }
        bind = ButterKnife.bind(this, rootView);
        homeActivity = (HomeActivity)getActivity();
        return rootView;
    }

    @Override
    protected void setUp(View view) {
        tagListAdapter.setOnItemClickListener(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewTagList.setLayoutManager(mLayoutManager);
        recyclerViewTagList.setItemAnimator(new DefaultItemAnimator());
        recyclerViewTagList.setAdapter(tagListAdapter);
        mPresenter.fetchTagListAll();
    }

    @Override
    public void onTagClick(String s, View v) {
        homeActivity.addFragment(new TagBoardFragment());
    }

    @Override
    public void onGettingTagList(List<String> stringList) {
        tagListAdapter.addItems(stringList);

    }
}