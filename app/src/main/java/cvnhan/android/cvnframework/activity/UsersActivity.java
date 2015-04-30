package cvnhan.android.cvnframework.activity;

import android.os.Bundle;

import com.squareup.otto.Subscribe;

import javax.inject.Inject;

import cvnhan.android.cvnframework.App;
import cvnhan.android.cvnframework.R;
import cvnhan.android.cvnframework.core.di.ActivityModule;
import cvnhan.android.cvnframework.core.ui.FragmentNavigator;
import cvnhan.android.cvnframework.core.ui.activity.BaseActivity;
import cvnhan.android.cvnframework.fragment.UserDetailFragment;
import cvnhan.android.cvnframework.fragment.UsersFragment;
import cvnhan.android.cvnframework.users.DaggerUsersComponent;
import cvnhan.android.cvnframework.users.UsersComponent;
import cvnhan.android.cvnframework.utils.EventBus;
import cvnhan.android.mvp.model.User;

public class UsersActivity extends BaseActivity {
    private FragmentNavigator fragmentNavigator;

    @Inject
    EventBus bus;
    private UsersComponent component;

    @Override
    protected int getContentViewId() {
        return R.layout.activity_single_page;
    }

    @Override
    protected void injectDependencies() {
        component = DaggerUsersComponent.builder()
                .singletonComponent(App.get(this).component())
                .activityModule(new ActivityModule(this))
                .build();
        component.inject(this);
    }

    public UsersComponent component() {
        return component;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentNavigator = FragmentNavigator.create(this, R.id.container);
        if (savedInstanceState == null) {
            fragmentNavigator.showScreen(new UsersFragment(), false);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        bus.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        bus.unregister(this);
    }

    @Override
    public void onBackPressed() {
        if (!fragmentNavigator.navigateBack()) super.onBackPressed();
    }

    @Subscribe
    public void onUserItemClicked(User user) {
        fragmentNavigator.showScreen(UserDetailFragment.newInstance(user.login), true);
    }

}
