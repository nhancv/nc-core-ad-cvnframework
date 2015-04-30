package cvnhan.android.cvnframework.core;

import android.app.Application;

import cvnhan.android.cvnframework.core.compat.PlatformSpecificImplementationFactory;
import timber.log.Timber;

public abstract class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (isDebug()) {
            Timber.plant(new Timber.DebugTree());
            // Enable strictMode for development. This will help to keep project in high quality.
            PlatformSpecificImplementationFactory.getStrictMode().enableStrictMode();
        } else {
//            Timber.plant(new CrashReportingTree());
        }
    }

    protected abstract boolean isDebug();

}
