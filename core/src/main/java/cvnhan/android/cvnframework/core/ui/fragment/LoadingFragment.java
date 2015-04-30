package cvnhan.android.cvnframework.core.ui.fragment;

import android.view.View;

import cvnhan.android.cvnframework.core.ui.view.ViewSwitcher;

public class LoadingFragment extends BaseFragment {

    private ViewSwitcher loadingViewSwitcher;

    protected void setupLoading(View mainView, View loadingView) {
        loadingViewSwitcher = new ViewSwitcher();
        loadingViewSwitcher.setMainView(mainView);
        loadingViewSwitcher.setAlterView(loadingView);
    }

    public void setShowLoading(boolean show) {
        loadingViewSwitcher.showMainView(!show);
    }

}
