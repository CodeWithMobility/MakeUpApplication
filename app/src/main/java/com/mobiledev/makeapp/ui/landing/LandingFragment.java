package com.mobiledev.makeapp.ui.landing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiledev.makeapp.R;
import com.mobiledev.makeapp.di.component.ActivityComponent;
import com.mobiledev.makeapp.ui.base.BaseFragment;
import com.mobiledev.makeapp.ui.brand.BrandFragment;
import com.mobiledev.makeapp.ui.home.HomeActivity;
import com.mobiledev.makeapp.ui.product.ProductFragment;
import com.mobiledev.makeapp.ui.tag.TagFragment;


import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by manu on 2/21/2018.
 */

public class LandingFragment extends BaseFragment implements LandingView {

    @Inject
    LandingPresenter<LandingView> mPresenter;

    private Unbinder bind;

//    @BindView(R.id.allButton)
//    Button allButton;
//
//    @BindView(R.id.productButton)
//    Button productButton;
//
//    @BindView(R.id.brandButton)
//    Button brandButton;
//
//    @BindView(R.id.tagButton)
//    Button tagButton;

    private HomeActivity homeActivity;

    private View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_landing,container,false);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            mPresenter.onAttach(this);
        }
        homeActivity = (HomeActivity)getActivity();
        bind = ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    protected void setUp(View view) {

    }

    @OnClick({ R.id.allButton, R.id.productButton, R.id.brandButton , R.id.tagButton})
    public void OnClickViewEvent(View view) {

        switch(view.getId())
        {
            case R.id.allButton:{
                homeActivity.addFragment(new ProductFragment());
            }
            break;
            case R.id.productButton:{

            }
            break;
            case R.id.brandButton:{
                homeActivity.addFragment(new BrandFragment());
            }
            break;
            case R.id.tagButton:{
                homeActivity.addFragment(new TagFragment());
            }
            break;
        }
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.onDetach();
        bind.unbind();
    }


}
