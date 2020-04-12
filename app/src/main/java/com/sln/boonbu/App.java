package com.sln.boonbu;

import android.app.Application;
import com.sln.boonbu.network.RetrofitNetwork;
import retrofit2.Retrofit;

public class App extends Application {
    private static Retrofit network;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Retrofit getNetwork() {
        if (network == null) {
            network = new RetrofitNetwork().serviceBuilder("https://popilage-fee9d.firebaseio.com/");
        }
        return network;
    }
}
