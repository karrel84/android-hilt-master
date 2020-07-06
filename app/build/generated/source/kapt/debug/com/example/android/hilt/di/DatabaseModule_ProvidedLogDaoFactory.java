package com.example.android.hilt.di;

import com.example.android.hilt.data.AppDatabase;
import com.example.android.hilt.data.LogDao;
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
public final class DatabaseModule_ProvidedLogDaoFactory implements Factory<LogDao> {
  private final Provider<AppDatabase> databaseProvider;

  public DatabaseModule_ProvidedLogDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public LogDao get() {
    return providedLogDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvidedLogDaoFactory create(
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvidedLogDaoFactory(databaseProvider);
  }

  public static LogDao providedLogDao(AppDatabase database) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.providedLogDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
