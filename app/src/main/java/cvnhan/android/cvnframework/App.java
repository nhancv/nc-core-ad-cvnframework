package cvnhan.android.cvnframework;

import android.content.Context;

import cvnhan.android.cvnframework.core.BaseApp;
import cvnhan.android.cvnframework.core.di.ApplicationModule;
import cvnhan.android.cvnframework.di.DaggerSingletonComponent;
import cvnhan.android.cvnframework.di.SingletonComponent;
import cvnhan.android.cvnframework.utils.UtilModule;


public class App extends BaseApp {

    private SingletonComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerSingletonComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .utilModule(new UtilModule())
                .build();
    }

    public SingletonComponent component() {
        return component;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    protected boolean isDebug() {
        return BuildConfig.DEBUG;
    }

}
