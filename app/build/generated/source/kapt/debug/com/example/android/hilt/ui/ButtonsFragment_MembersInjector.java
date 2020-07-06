package com.example.android.hilt.ui;

import com.example.android.hilt.data.LoggerLocalDataSource;
import com.example.android.hilt.navigator.AppNavigator;
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
public final class ButtonsFragment_MembersInjector implements MembersInjector<ButtonsFragment> {
  private final Provider<LoggerLocalDataSource> loggerProvider;

  private final Provider<AppNavigator> navigatorProvider;

  public ButtonsFragment_MembersInjector(Provider<LoggerLocalDataSource> loggerProvider,
      Provider<AppNavigator> navigatorProvider) {
    this.loggerProvider = loggerProvider;
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<ButtonsFragment> create(
      Provider<LoggerLocalDataSource> loggerProvider, Provider<AppNavigator> navigatorProvider) {
    return new ButtonsFragment_MembersInjector(loggerProvider, navigatorProvider);}

  @Override
  public void injectMembers(ButtonsFragment instance) {
    injectLogger(instance, loggerProvider.get());
    injectNavigator(instance, navigatorProvider.get());
  }

  @InjectedFieldSignature("com.example.android.hilt.ui.ButtonsFragment.logger")
  public static void injectLogger(ButtonsFragment instance, LoggerLocalDataSource logger) {
    instance.logger = logger;
  }

  @InjectedFieldSignature("com.example.android.hilt.ui.ButtonsFragment.navigator")
  public static void injectNavigator(ButtonsFragment instance, AppNavigator navigator) {
    instance.navigator = navigator;
  }
}
