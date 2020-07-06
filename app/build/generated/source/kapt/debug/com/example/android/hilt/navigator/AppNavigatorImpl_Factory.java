package com.example.android.hilt.navigator;

import androidx.fragment.app.FragmentActivity;
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
public final class AppNavigatorImpl_Factory implements Factory<AppNavigatorImpl> {
  private final Provider<FragmentActivity> activityProvider;

  public AppNavigatorImpl_Factory(Provider<FragmentActivity> activityProvider) {
    this.activityProvider = activityProvider;
  }

  @Override
  public AppNavigatorImpl get() {
    return newInstance(activityProvider.get());
  }

  public static AppNavigatorImpl_Factory create(Provider<FragmentActivity> activityProvider) {
    return new AppNavigatorImpl_Factory(activityProvider);
  }

  public static AppNavigatorImpl newInstance(FragmentActivity activity) {
    return new AppNavigatorImpl(activity);
  }
}
