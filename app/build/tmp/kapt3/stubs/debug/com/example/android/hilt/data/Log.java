package com.example.android.hilt.data;

import java.lang.System;

/**
 * Data class that represent the a table in the database.
 */
@androidx.room.Entity(tableName = "logs")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/example/android/hilt/data/Log;", "", "msg", "", "timestamp", "", "(Ljava/lang/String;J)V", "id", "getId", "()J", "setId", "(J)V", "getMsg", "()Ljava/lang/String;", "getTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Log {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String msg = null;
    private final long timestamp = 0L;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public Log(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, long timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    /**
     * Data class that represent the a table in the database.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.hilt.data.Log copy(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, long timestamp) {
        return null;
    }
    
    /**
     * Data class that represent the a table in the database.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Data class that represent the a table in the database.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Data class that represent the a table in the database.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}