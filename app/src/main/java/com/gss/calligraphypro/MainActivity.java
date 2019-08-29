package com.gss.calligraphypro;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import uk.co.chrisjenx.calligraphy.Calligraphy;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalligraphyConfig config = Calligraphy.getConfig();
    }

}
