package com.mobiledev.makeapp.system;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.di.component.ApplicationComponent;
import com.mobiledev.makeapp.di.component.DaggerApplicationComponent;
import com.mobiledev.makeapp.di.module.ApplicationModule;
import com.mobiledev.makeapp.utils.LogUtils.AppLogger;

import javax.inject.Inject;

/**
 * Created by manu on 2/18/2018.
 */

public class MyApp extends Application {

    @Inject
    DataManager mDataManager;


    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
        Fresco.initialize(this);
        AppLogger.init();

    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

}
