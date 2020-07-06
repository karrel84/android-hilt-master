package com.example.android.hilt.di;

import android.content.Context;
import com.example.android.hilt.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(appContextProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideDatabase(Context appContext) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideDatabase(appContext), "Cannot return null from a non-@Nullable @Provides method");
  }
}
