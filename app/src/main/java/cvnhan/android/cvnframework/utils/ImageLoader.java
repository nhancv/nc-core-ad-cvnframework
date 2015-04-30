package cvnhan.android.cvnframework.utils;

import android.widget.ImageView;

public interface ImageLoader {

    void load(String url, ImageView target, int errorId);

    void load(String url, ImageView target, int errorId, Object tag);

    void pauseTag(Object tag);

    void resumeTag(Object tag);

    void cancelTag(Object tag);
}
