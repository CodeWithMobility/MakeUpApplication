package com.mobiledev.makeapp.di.component;

import com.mobiledev.makeapp.di.module.ActivityModule;
import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.brand.BrandFragment;
import com.mobiledev.makeapp.ui.brandboard.BrandBoardFragment;
import com.mobiledev.makeapp.ui.details.DetailsActivity;
import com.mobiledev.makeapp.ui.home.HomeActivity;
import com.mobiledev.makeapp.ui.landing.LandingFragment;
import com.mobiledev.makeapp.ui.product.ProductFragment;
import com.mobiledev.makeapp.ui.producttype.ProductTypeFragment;
import com.mobiledev.makeapp.ui.producttypeboard.ProductTypeBoardFragment;
import com.mobiledev.makeapp.ui.splash.SplashActivity;
import com.mobiledev.makeapp.ui.tag.TagFragment;
import com.mobiledev.makeapp.ui.tagboard.TagBoardFragment;

import dagger.Component;

/**
 * Created by manu on 2/18/2018.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);
    void inject(HomeActivity activity);
    void inject(ProductFragment fragment);
    void inject(DetailsActivity activity);
    void inject(LandingFragment fragment);
    void inject(BrandFragment fragment);
    void inject(TagFragment fragment);
    void inject(TagBoardFragment fragment);
    void inject(BrandBoardFragment fragment);
    void inject(ProductTypeFragment fragment);
    void inject(ProductTypeBoardFragment fragment);

}
