package com.example.android.hilt;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.example.android.hilt.data.AppDatabase;
import com.example.android.hilt.data.LogDao;
import com.example.android.hilt.data.LoggerLocalDataSource;
import com.example.android.hilt.di.DatabaseModule;
import com.example.android.hilt.di.DatabaseModule_ProvideDatabaseFactory;
import com.example.android.hilt.di.DatabaseModule_ProvidedLogDaoFactory;
import com.example.android.hilt.navigator.AppNavigatorImpl;
import com.example.android.hilt.ui.ButtonsFragment;
import com.example.android.hilt.ui.ButtonsFragment_MembersInjector;
import com.example.android.hilt.ui.LogsFragment;
import com.example.android.hilt.ui.LogsFragment_MembersInjector;
import com.example.android.hilt.ui.MainActivity;
import com.example.android.hilt.ui.MainActivity_MembersInjector;
import com.example.android.hilt.util.DateFormatter;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ActivityModule_ProvideFragmentActivityFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerLogApplication_HiltComponents_ApplicationC extends LogApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object appDatabase = new MemoizedSentinel();

  private volatile Object loggerLocalDataSource = new MemoizedSentinel();

  private DaggerLogApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private AppDatabase getAppDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private LogDao getLogDao() {
    return DatabaseModule_ProvidedLogDaoFactory.providedLogDao(getAppDatabase());}

  private LoggerLocalDataSource getLoggerLocalDataSource() {
    Object local = loggerLocalDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = loggerLocalDataSource;
        if (local instanceof MemoizedSentinel) {
          local = new LoggerLocalDataSource(getLogDao());
          loggerLocalDataSource = DoubleCheck.reentrantCheck(loggerLocalDataSource, local);
        }
      }
    }
    return (LoggerLocalDataSource) local;
  }

  @Override
  public void injectLogApplication(LogApplication logApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public LogApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerLogApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements LogApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public LogApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends LogApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements LogApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public LogApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends LogApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile FragmentActivity fragmentActivity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private FragmentActivity getFragmentActivity() {
        Object local = fragmentActivity;
        if (local == null) {
          local = ActivityModule_ProvideFragmentActivityFactory.provideFragmentActivity(activity);
          fragmentActivity = (FragmentActivity) local;
        }
        return (FragmentActivity) local;
      }

      private AppNavigatorImpl getAppNavigatorImpl() {
        return new AppNavigatorImpl(getFragmentActivity());}

      @Override
      public void injectMainActivity(MainActivity arg0) {
        injectMainActivity2(arg0);}

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>emptySet();}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectNavigator(instance, getAppNavigatorImpl());
        return instance;
      }

      private final class FragmentCBuilder implements LogApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public LogApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends LogApplication_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public void injectButtonsFragment(ButtonsFragment buttonsFragment) {
          injectButtonsFragment2(buttonsFragment);}

        @Override
        public void injectLogsFragment(LogsFragment arg0) {
          injectLogsFragment2(arg0);}

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>emptySet();}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private ButtonsFragment injectButtonsFragment2(ButtonsFragment instance) {
          ButtonsFragment_MembersInjector.injectLogger(instance, DaggerLogApplication_HiltComponents_ApplicationC.this.getLoggerLocalDataSource());
          ButtonsFragment_MembersInjector.injectNavigator(instance, ActivityCImpl.this.getAppNavigatorImpl());
          return instance;
        }

        private LogsFragment injectLogsFragment2(LogsFragment instance) {
          LogsFragment_MembersInjector.injectLogger(instance, DaggerLogApplication_HiltComponents_ApplicationC.this.getLoggerLocalDataSource());
          LogsFragment_MembersInjector.injectDateFormatter(instance, new DateFormatter());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements LogApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public LogApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends LogApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements LogApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public LogApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends LogApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements LogApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public LogApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends LogApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
