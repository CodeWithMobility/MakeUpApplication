package com.mobiledev.makeapp.ui.tagboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.di.component.ActivityComponent;
import com.mobiledev.makeapp.ui.base.BaseFragment;
import javax.inject.Inject;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by manu on 2/22/2018.
 */

public class TagBoardFragment extends BaseFragment implements TagBoardView {

    @Inject
    TagBoardPresenter<TagBoardView> mPresenter;

    private Unbinder bind;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tag_board,container,false);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            mPresenter.onAttach(this);
        }
        bind = ButterKnife.bind(this, rootView);
        return rootView;
    }


    @Override
    protected void setUp(View view) {

    }


    @OnClick({ R.id.allButton, R.id.byCategoryButton, R.id.byTagButton})
    public void OnClickViewEvent(View view) {

        switch(view.getId())
        {
            case R.id.allButton:{
                //homeActivity.addFragment(new ProductFragment());
            }
            break;
            case R.id.byCategoryButton:{

            }
            break;
            case R.id.byTagButton:{
               // homeActivity.addFragment(new BrandFragment());
            }
            break;

        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.onDetach();
        bind.unbind();
    }

}
