package com.example.android.hilt.util;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DateFormatter_Factory implements Factory<DateFormatter> {
  @Override
  public DateFormatter get() {
    return newInstance();
  }

  public static DateFormatter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DateFormatter newInstance() {
    return new DateFormatter();
  }

  private static final class InstanceHolder {
    private static final DateFormatter_Factory INSTANCE = new DateFormatter_Factory();
  }
}
