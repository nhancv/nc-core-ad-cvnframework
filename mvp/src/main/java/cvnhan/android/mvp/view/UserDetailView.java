package cvnhan.android.mvp.view;

import cvnhan.android.mvp.model.User;

public interface UserDetailView {
    /**
     * Show or hide loading progress.
     *
     * @param show <b>true</b> to show or <b>false</b> to hide.
     */
    void showLoading(boolean show);

    /**
     * Render the user on UI
     *
     * @param user the user to be rendered.
     */
    void render(User user);

}
