package com.mobiledev.makeapp.di.component;

import android.app.Application;
import android.content.Context;

import com.mobiledev.makeapp.data.DataManager;
import com.mobiledev.makeapp.di.module.ApplicationModule;
import com.mobiledev.makeapp.di.scope.ApplicationContext;
import com.mobiledev.makeapp.system.MyApp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by manu on 2/18/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}