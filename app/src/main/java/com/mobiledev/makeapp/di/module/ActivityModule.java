package com.mobiledev.makeapp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.mobiledev.makeapp.data.model.ProductModel;
import com.mobiledev.makeapp.di.scope.ActivityContext;
import com.mobiledev.makeapp.di.scope.PerActivity;
import com.mobiledev.makeapp.ui.base.BaseActivity;
import com.mobiledev.makeapp.ui.brand.BrandPresenter;
import com.mobiledev.makeapp.ui.brand.BrandPresenterImpl;
import com.mobiledev.makeapp.ui.brand.BrandView;
import com.mobiledev.makeapp.ui.details.DetailsPresenter;
import com.mobiledev.makeapp.ui.details.DetailsPresenterImpl;
import com.mobiledev.makeapp.ui.details.DetailsView;
import com.mobiledev.makeapp.ui.home.HomePresenter;
import com.mobiledev.makeapp.ui.home.HomePresenterImpl;
import com.mobiledev.makeapp.ui.home.HomeView;
import com.mobiledev.makeapp.ui.landing.LandingPresenter;
import com.mobiledev.makeapp.ui.landing.LandingPresenterImpl;
import com.mobiledev.makeapp.ui.landing.LandingView;
import com.mobiledev.makeapp.ui.product.ProductAdapter;
import com.mobiledev.makeapp.ui.product.ProductPresenter;
import com.mobiledev.makeapp.ui.product.ProductPresenterImpl;
import com.mobiledev.makeapp.ui.product.ProductView;
import com.mobiledev.makeapp.ui.splash.SplashPresenter;
import com.mobiledev.makeapp.ui.splash.SplashPresenterImpl;
import com.mobiledev.makeapp.ui.splash.SplashView;
import com.mobiledev.makeapp.ui.tag.TagListAdapter;
import com.mobiledev.makeapp.ui.tag.TagPresenter;
import com.mobiledev.makeapp.ui.tag.TagPresenterImpl;
import com.mobiledev.makeapp.ui.tag.TagView;
import com.mobiledev.makeapp.ui.tagboard.TagBoardPresenter;
import com.mobiledev.makeapp.ui.tagboard.TagBoardPresenterImpl;
import com.mobiledev.makeapp.ui.tagboard.TagBoardView;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 2/18/2018.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @PerActivity
    SplashPresenter<SplashView> provideSplashPresenter(
            SplashPresenterImpl<SplashView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    HomePresenter<HomeView> provideHomePresenter(
            HomePresenterImpl<HomeView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    DetailsPresenter<DetailsView> provideDetailPresenter(
            DetailsPresenterImpl<DetailsView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    ProductPresenter<ProductView> provideProductPresenter(ProductPresenterImpl<ProductView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LandingPresenter<LandingView> provideLandingtPresenter(LandingPresenterImpl<LandingView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    BrandPresenter<BrandView> provideBrandPresenter(BrandPresenterImpl<BrandView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    TagPresenter<TagView> provideTagPresenter(TagPresenterImpl<TagView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    TagBoardPresenter<TagBoardView> provideTagBoardPresenter(TagBoardPresenterImpl<TagBoardView> presenter) {
        return presenter;
    }

    @Provides
    ProductAdapter provideProductAdapter() {
        return new ProductAdapter((BaseActivity) mActivity);
    }


    @Provides
    TagListAdapter provideTagAdapter() {
        return new TagListAdapter((BaseActivity) mActivity);
    }

    @Provides
    GridLayoutManager provideGridLayoutManager(AppCompatActivity activity) {
        return new GridLayoutManager(activity,2);
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}