package cvnhan.android.mvp.model;

import retrofit.RestAdapter;

public class ModelManager {

    public static final String BASE_URL = "https://api.github.com";

    public static UserModel getGitUserModel() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        return restAdapter.create(UserModel.class);
    }
}
