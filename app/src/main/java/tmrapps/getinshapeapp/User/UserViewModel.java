package tmrapps.getinshapeapp.User;

import android.arch.lifecycle.ViewModel;

import tmrapps.getinshapeapp.User.Model.User;

/**
 * Created by tamir on 1/5/2018.
 */

public class UserViewModel extends ViewModel {
    private String userId;
    private User user;
    public void init(String userId) {
        this.userId = userId;
    }
    public User getUser() {
        return user;
    }
}
