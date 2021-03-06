package com.application.restaurantreservation.components;

import android.content.Context;

import com.application.restaurantreservation.TableGridActivity;
import com.application.restaurantreservation.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface TableComponent {
    void inject(TableGridActivity activity);

    @NetworkModule.ApplicationContext
    Context getContext();
}