package com.example.android.hilt.data;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoggerLocalDataSource_Factory implements Factory<LoggerLocalDataSource> {
  private final Provider<LogDao> logDaoProvider;

  public LoggerLocalDataSource_Factory(Provider<LogDao> logDaoProvider) {
    this.logDaoProvider = logDaoProvider;
  }

  @Override
  public LoggerLocalDataSource get() {
    return newInstance(logDaoProvider.get());
  }

  public static LoggerLocalDataSource_Factory create(Provider<LogDao> logDaoProvider) {
    return new LoggerLocalDataSource_Factory(logDaoProvider);
  }

  public static LoggerLocalDataSource newInstance(LogDao logDao) {
    return new LoggerLocalDataSource(logDao);
  }
}
