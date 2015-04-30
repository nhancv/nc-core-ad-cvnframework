package cvnhan.android.mvp.view;

import java.util.List;

import cvnhan.android.mvp.model.User;

public interface UsersView {

    /**
     * Show or hide loading progress.
     *
     * @param show <b>true</b> to show or <b>false</b> to hide.
     */
    void showLoading(boolean show);

    /**
     * Render a list of user on UI
     *
     * @param users the users to be rendered.
     */
    void render(List<User> users);
}
