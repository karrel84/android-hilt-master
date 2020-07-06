package com.example.android.hilt.navigator;

import java.lang.System;

/**
 * Navigator implementation.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/android/hilt/navigator/AppNavigatorImpl;", "Lcom/example/android/hilt/navigator/AppNavigator;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "navigateTo", "", "screen", "Lcom/example/android/hilt/navigator/Screens;", "app_debug"})
public final class AppNavigatorImpl implements com.example.android.hilt.navigator.AppNavigator {
    private final androidx.fragment.app.FragmentActivity activity = null;
    
    @java.lang.Override()
    public void navigateTo(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.navigator.Screens screen) {
    }
    
    @javax.inject.Inject()
    public AppNavigatorImpl(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        super();
    }
}