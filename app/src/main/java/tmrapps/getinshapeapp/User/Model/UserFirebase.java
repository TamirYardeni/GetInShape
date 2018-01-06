package tmrapps.getinshapeapp.User.Model;

/**
 * Created by tamir on 1/5/2018.
 */

public class UserFirebase {
    public interface Callback<T> {
        void onComplete(T data);
    }

    public static void getUserAndObserve(final Callback<User> callback) {

    }
}
