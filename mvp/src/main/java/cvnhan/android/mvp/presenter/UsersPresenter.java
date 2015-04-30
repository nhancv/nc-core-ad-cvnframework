package cvnhan.android.mvp.presenter;

import java.util.List;

import cvnhan.android.mvp.model.User;
import cvnhan.android.mvp.model.UserModel;
import cvnhan.android.mvp.utils.RxHelper;
import cvnhan.android.mvp.view.UsersView;
import rx.Subscription;

public class UsersPresenter implements BasePresenter<UsersView, UserModel> {

    private Subscription usersSubscription;

    @Override
    public void onStart(UsersView view, UserModel model) {
        view.showLoading(true);
        usersSubscription = model.getUsers()
                .compose(RxHelper.<List<User>>applySchedulers())
                .subscribe(users -> view.render(users),
                        e -> {
                            view.showLoading(false);
                            e.printStackTrace();
                        },
                        () -> view.showLoading(false));
    }

    @Override
    public void onStop() {
        if (usersSubscription != null) {
            usersSubscription.unsubscribe();
        }
    }
}
