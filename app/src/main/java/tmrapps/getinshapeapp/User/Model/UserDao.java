package tmrapps.getinshapeapp.User.Model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

/**
 * Created by tamir on 1/5/2018.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM User WHERE id = :userId")
    User getUserById(String userId);

    @Query("SELECT * FROM User WHERE mail = :mail AND password = :password")
    User getUserByMailPass(String mail, String pass);

    @Insert
    void insertUser(User user);

    @Delete
    void delete (User user);
}
