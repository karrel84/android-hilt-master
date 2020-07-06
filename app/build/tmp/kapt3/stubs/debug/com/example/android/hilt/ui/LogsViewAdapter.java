package com.example.android.hilt.ui;

import java.lang.System;

/**
 * RecyclerView adapter for the logs list.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/android/hilt/ui/LogsViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/android/hilt/ui/LogsViewAdapter$LogsViewHolder;", "logsDataSet", "", "Lcom/example/android/hilt/data/Log;", "daterFormatter", "Lcom/example/android/hilt/util/DateFormatter;", "(Ljava/util/List;Lcom/example/android/hilt/util/DateFormatter;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LogsViewHolder", "app_debug"})
final class LogsViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.android.hilt.ui.LogsViewAdapter.LogsViewHolder> {
    private final java.util.List<com.example.android.hilt.data.Log> logsDataSet = null;
    private final com.example.android.hilt.util.DateFormatter daterFormatter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.hilt.ui.LogsViewAdapter.LogsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.ui.LogsViewAdapter.LogsViewHolder holder, int position) {
    }
    
    public LogsViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.hilt.data.Log> logsDataSet, @org.jetbrains.annotations.NotNull()
    com.example.android.hilt.util.DateFormatter daterFormatter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/hilt/ui/LogsViewAdapter$LogsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "textView", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "getTextView", "()Landroid/widget/TextView;", "app_debug"})
    public static final class LogsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextView() {
            return null;
        }
        
        public LogsViewHolder(@org.jetbrains.annotations.NotNull()
        android.widget.TextView textView) {
            super(null);
        }
    }
}