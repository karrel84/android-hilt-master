package com.example.android.hilt.ui;

import com.example.android.hilt.data.LoggerLocalDataSource;
import com.example.android.hilt.util.DateFormatter;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class LogsFragment_MembersInjector implements MembersInjector<LogsFragment> {
  private final Provider<LoggerLocalDataSource> loggerProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  public LogsFragment_MembersInjector(Provider<LoggerLocalDataSource> loggerProvider,
      Provider<DateFormatter> dateFormatterProvider) {
    this.loggerProvider = loggerProvider;
    this.dateFormatterProvider = dateFormatterProvider;
  }

  public static MembersInjector<LogsFragment> create(Provider<LoggerLocalDataSource> loggerProvider,
      Provider<DateFormatter> dateFormatterProvider) {
    return new LogsFragment_MembersInjector(loggerProvider, dateFormatterProvider);}

  @Override
  public void injectMembers(LogsFragment instance) {
    injectLogger(instance, loggerProvider.get());
    injectDateFormatter(instance, dateFormatterProvider.get());
  }

  @InjectedFieldSignature("com.example.android.hilt.ui.LogsFragment.logger")
  public static void injectLogger(LogsFragment instance, LoggerLocalDataSource logger) {
    instance.logger = logger;
  }

  @InjectedFieldSignature("com.example.android.hilt.ui.LogsFragment.dateFormatter")
  public static void injectDateFormatter(LogsFragment instance, DateFormatter dateFormatter) {
    instance.dateFormatter = dateFormatter;
  }
}
