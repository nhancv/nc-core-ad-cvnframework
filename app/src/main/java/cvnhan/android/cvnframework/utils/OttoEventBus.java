package cvnhan.android.cvnframework.utils;

import com.squareup.otto.Bus;

import javax.inject.Inject;

public class OttoEventBus implements EventBus {

    private static final Bus BUS = new Bus();

    @Inject
    public OttoEventBus() {

    }

    @Override
    public void register(Object object) {
        BUS.register(object);
    }

    @Override
    public void unregister(Object object) {
        BUS.unregister(object);
    }

    @Override
    public void post(Object object) {
        BUS.post(object);
    }
}
