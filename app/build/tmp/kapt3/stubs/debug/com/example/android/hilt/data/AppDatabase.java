package com.example.android.hilt.data;

import java.lang.System;

/**
 * SQLite Database for storing the logs.
 */
@androidx.room.Database(entities = {com.example.android.hilt.data.Log.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/hilt/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "logDao", "Lcom/example/android/hilt/data/LogDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.android.hilt.data.LogDao logDao();
    
    public AppDatabase() {
        super();
    }
}