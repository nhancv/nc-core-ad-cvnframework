package cvnhan.android.mvp.model;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface UserModel {

    @GET("/users")
    Observable<List<User>> getUsers();

    @GET("/users/{username}")
    Observable<User> getUser(@Path("username") String username);
}
