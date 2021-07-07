package ir.far5had.weather.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;

import ir.far5had.weather.AppController;

public class NetworkUtils {

    public static boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AppController.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (connectivityManager != null) {
                Network[] networks = connectivityManager.getAllNetworks();
                NetworkInfo networkInfo;
                for (Network mNetwork : networks) {
                    networkInfo = connectivityManager.getNetworkInfo(mNetwork);
                    if (networkInfo.getState().equals(NetworkInfo.State.CONNECTED))
                        return true;
                }
            }
        } else {
            if (connectivityManager != null) {
                NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
                if (info != null)
                    for (NetworkInfo anInfo : info)
                        if (anInfo.getState() == NetworkInfo.State.CONNECTED)
                            return true;
            }
        }
        return false;
    }

}
