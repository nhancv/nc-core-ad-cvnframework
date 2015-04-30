package cvnhan.android.cvnframework.core.compat;


import cvnhan.android.cvnframework.core.compat.base.IStrictMode;

/**
 * Factory class to create the correct instances
 * of a variety of classes with platform specific
 * implementations.
 */
public class PlatformSpecificImplementationFactory {

    /**
     * Create a new StrictMode instance.
     *
     * @return StrictMode
     */
    public static IStrictMode getStrictMode() {
        if (Platform.SUPPORTS_HONEYCOMB)
            return new HoneycombStrictMode();
        else if (Platform.SUPPORTS_GINGERBREAD)
            return new LegacyStrictMode();
        else
            return null;
    }
}
