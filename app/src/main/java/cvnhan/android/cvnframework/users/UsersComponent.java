package cvnhan.android.cvnframework.users;

import cvnhan.android.cvnframework.activity.UsersActivity;
import cvnhan.android.cvnframework.core.di.AbstractActivityComponent;
import cvnhan.android.cvnframework.core.di.ActivityModule;
import cvnhan.android.cvnframework.core.di.PerActivity;
import cvnhan.android.cvnframework.di.SingletonComponent;
import cvnhan.android.cvnframework.fragment.UsersFragment;
import dagger.Component;

@PerActivity
@Component(modules = ActivityModule.class, dependencies = {SingletonComponent.class})
public interface UsersComponent extends AbstractActivityComponent {
    void inject(UsersActivity activity);

    void inject(UsersFragment fragment);

}
