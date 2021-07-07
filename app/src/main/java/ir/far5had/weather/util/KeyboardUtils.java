package ir.far5had.weather.util;

import android.app.Activity;
import android.view.WindowManager;

public class KeyboardUtils {

    public static void hideKeyboard(Activity activity) {
        activity.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
