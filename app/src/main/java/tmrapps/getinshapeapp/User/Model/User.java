package tmrapps.getinshapeapp.User.Model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.HashMap;

/**
 * Created by tamir on 1/5/2018.
 */
@Entity
public class User {
    @PrimaryKey
    @NonNull
    private String id;

    private String mail;

    private String password;

    private float lastUpdated;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {return this.password;}

    public void setPassword(String password) {this.password = password;}

    public float getLastUpdated() {return this.lastUpdated;}

    public void setLastUpdated(float lastUpdated) {this.lastUpdated = lastUpdated;}

    HashMap<String, Object> toJson() {
        HashMap<String , Object> result = new HashMap<>();
        result.put("id", id);
        result.put("mail", mail);
        result.put("password", password);
        result.put("lastUpdated", lastUpdated);
        return result;
    }
}
