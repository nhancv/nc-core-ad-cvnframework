package cvnhan.android.cvnframework.core.compat;

import android.os.StrictMode;

import cvnhan.android.cvnframework.core.compat.base.IStrictMode;

/**
 * Implementation that supports the Strict Mode functionality
 * available for the first platform release that supported Strict Mode.
 */
public class LegacyStrictMode implements IStrictMode {

    /**
     * Enable {@link android.os.StrictMode}
     * TODO Set your preferred Strict Mode features.
     */
    public void enableStrictMode() {
        StrictMode.setThreadPolicy(
                new StrictMode.ThreadPolicy.Builder()
                        .detectDiskReads()
                        .detectDiskWrites()
                        .detectNetwork()
                        .penaltyLog()
                        .build()
        );
    }
}
