package com.example.android.hilt.ui;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<AppNavigator> navigatorProvider;

  public MainActivity_MembersInjector(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<AppNavigator> navigatorProvider) {
    return new MainActivity_MembersInjector(navigatorProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    injectNavigator(instance, navigatorProvider.get());
  }

  @InjectedFieldSignature("com.example.android.hilt.ui.MainActivity.navigator")
  public static void injectNavigator(MainActivity instance, AppNavigator navigator) {
    instance.navigator = navigator;
  }
}
