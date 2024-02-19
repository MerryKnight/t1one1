package com.example.t1one;

import static com.example.t1one.MainActivity.KEY;

import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    @Override
    protected void onStart() {
        super.onStart();
        Bundle b1 = getIntent().getExtras();
        if(b1 != null)
        {
            String str = b1.getString(KEY);
            TextView t1=(TextView)findViewById(R.id.textView);
            t1.setText(str);
        }
    }
}
