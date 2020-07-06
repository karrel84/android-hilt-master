package com.example.android.hilt.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/android/hilt/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/example/android/hilt/data/AppDatabase;", "appContext", "Landroid/content/Context;", "providedLogDao", "Lcom/example/android/hilt/data/LogDao;", "database", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    public static final com.example.android.hilt.di.DatabaseModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.android.hilt.data.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.android.hilt.data.LogDao providedLogDao(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.data.AppDatabase database) {
        return null;
    }
    
    private DatabaseModule() {
        super();
    }
}