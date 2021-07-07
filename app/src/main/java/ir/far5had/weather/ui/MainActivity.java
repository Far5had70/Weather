package ir.far5had.weather.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import ir.far5had.weather.R;
import ir.far5had.weather.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            HomeFragment fragment = new HomeFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment, HomeFragment.TAG).commit();
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}
