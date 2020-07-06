package com.example.android.hilt.data;

import java.lang.System;

/**
 * Data manager class that handles data manipulation between the database and the UI.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u000e0\u0013J\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/android/hilt/data/LoggerLocalDataSource;", "", "logDao", "Lcom/example/android/hilt/data/LogDao;", "(Lcom/example/android/hilt/data/LogDao;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "mainThreadHandler", "Landroid/os/Handler;", "getMainThreadHandler", "()Landroid/os/Handler;", "mainThreadHandler$delegate", "Lkotlin/Lazy;", "addLog", "", "msg", "", "getAllLogs", "callback", "Lkotlin/Function1;", "", "Lcom/example/android/hilt/data/Log;", "removeLogs", "app_debug"})
@javax.inject.Singleton()
public final class LoggerLocalDataSource {
    private final java.util.concurrent.ExecutorService executorService = null;
    private final kotlin.Lazy mainThreadHandler$delegate = null;
    private final com.example.android.hilt.data.LogDao logDao = null;
    
    private final android.os.Handler getMainThreadHandler() {
        return null;
    }
    
    public final void addLog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void getAllLogs(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.android.hilt.data.Log>, kotlin.Unit> callback) {
    }
    
    public final void removeLogs() {
    }
    
    @javax.inject.Inject()
    public LoggerLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.data.LogDao logDao) {
        super();
    }
}