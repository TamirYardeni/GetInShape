package tmrapps.getinshapeapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by tamir on 1/6/2018.
 */

public class MyApplication extends Application{
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context.getApplicationContext();
    }

    public static Context getMyContext() {
        return context;
    }
}
