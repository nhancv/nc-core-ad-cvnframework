package cvnhan.android.cvnframework.utils;

public interface EventBus {

    void register(Object object);

    void unregister(Object object);

    void post(Object object);

}
