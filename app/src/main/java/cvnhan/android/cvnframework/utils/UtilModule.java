package cvnhan.android.cvnframework.utils;

import android.app.Application;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilModule {

    @Singleton
    @Provides
    public ImageLoader provideImageLoader(Application application) {
        final Picasso picasso = Picasso.with(application);
        return new PicassoImageLoader(picasso);
    }

    @Singleton
    @Provides
    public EventBus provideEventBus() {
        return new OttoEventBus();
    }
}
