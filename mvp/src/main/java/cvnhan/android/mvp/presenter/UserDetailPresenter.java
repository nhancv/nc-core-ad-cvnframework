package cvnhan.android.mvp.presenter;

import cvnhan.android.mvp.model.User;
import cvnhan.android.mvp.model.UserModel;
import cvnhan.android.mvp.utils.RxHelper;
import cvnhan.android.mvp.view.UserDetailView;
import rx.Subscription;

public class UserDetailPresenter implements BasePresenter<UserDetailView, UserModel> {

    private final String username;
    private Subscription userSubscription;

    public UserDetailPresenter(String username) {
        this.username = username;
    }


    @Override
    public void onStart(UserDetailView view, UserModel model) {
        view.showLoading(true);
        userSubscription = model.getUser(username)
                .compose(RxHelper.<User>applySchedulers())
                .subscribe(user -> view.render(user),
                        e -> {
                            view.showLoading(false);
                            e.printStackTrace();
                        },
                        () -> view.showLoading(false));
    }

    @Override
    public void onStop() {
        if (userSubscription != null) {
            userSubscription.unsubscribe();
        }
    }
}
