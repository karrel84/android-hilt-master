package com.example.android.hilt.data;

import java.lang.System;

/**
 * Data access object to query the database.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J!\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/hilt/data/LogDao;", "", "getAll", "", "Lcom/example/android/hilt/data/Log;", "insertAll", "", "logs", "", "([Lcom/example/android/hilt/data/Log;)V", "nukeTable", "app_debug"})
public abstract interface LogDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM logs ORDER BY id DESC")
    public abstract java.util.List<com.example.android.hilt.data.Log> getAll();
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.example.android.hilt.data.Log... logs);
    
    @androidx.room.Query(value = "DELETE FROM logs")
    public abstract void nukeTable();
}