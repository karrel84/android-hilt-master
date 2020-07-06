package com.example.android.hilt.ui;

import java.lang.System;

/**
 * Fragment that displays the database logs.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/android/hilt/ui/LogsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dateFormatter", "Lcom/example/android/hilt/util/DateFormatter;", "getDateFormatter", "()Lcom/example/android/hilt/util/DateFormatter;", "setDateFormatter", "(Lcom/example/android/hilt/util/DateFormatter;)V", "logger", "Lcom/example/android/hilt/data/LoggerLocalDataSource;", "getLogger", "()Lcom/example/android/hilt/data/LoggerLocalDataSource;", "setLogger", "(Lcom/example/android/hilt/data/LoggerLocalDataSource;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LogsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.android.hilt.data.LoggerLocalDataSource logger;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.android.hilt.util.DateFormatter dateFormatter;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.hilt.data.LoggerLocalDataSource getLogger() {
        return null;
    }
    
    public final void setLogger(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.data.LoggerLocalDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.hilt.util.DateFormatter getDateFormatter() {
        return null;
    }
    
    public final void setDateFormatter(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.util.DateFormatter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public LogsFragment() {
        super();
    }
}