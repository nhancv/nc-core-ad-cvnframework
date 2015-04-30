package cvnhan.android.cvnframework.core.utils;

import android.app.Activity;
import android.view.View;

public class Views {

    public static <T extends View> T findViewById(View source, int resId) {
        return (T) source.findViewById(resId);
    }

    public static <T extends View> T findViewById(Activity source, int resId) {
        return (T) source.findViewById(resId);
    }
}
