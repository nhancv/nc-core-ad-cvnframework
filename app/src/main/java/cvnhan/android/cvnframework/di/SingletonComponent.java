package cvnhan.android.cvnframework.di;

import android.app.Application;

import javax.inject.Singleton;

import cvnhan.android.cvnframework.core.di.ApplicationModule;
import cvnhan.android.cvnframework.utils.EventBus;
import cvnhan.android.cvnframework.utils.ImageLoader;
import cvnhan.android.cvnframework.utils.UtilModule;
import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = {UtilModule.class, ApplicationModule.class})
public interface SingletonComponent {

    Application application();

    EventBus eventBus();

    ImageLoader imageLoader();

}