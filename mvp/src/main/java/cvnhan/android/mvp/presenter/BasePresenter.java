package cvnhan.android.mvp.presenter;

public interface BasePresenter<V, M> {

    /**
     * Start the presenter
     */
    void onStart(V view, M model);


    /**
     * Stop the presenter
     */
    public void onStop();

}
