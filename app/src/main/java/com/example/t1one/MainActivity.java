package com.example.t1one;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    public static final String KEY = "K1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","onCreate()");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.button)
        {
            //Явное
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            EditText et1=(EditText)findViewById(R.id.editTextText);

            intent.putExtra(KEY,et1.getEditableText().toString());
            startActivity(intent);
            //Неявное
           /* Intent intent = new Intent(Intent.ACTION_VIEW);
            String str = "https://youtube.com";
            intent.setData(Uri.parse(str));
            startActivity(intent);*/
        } else {

        }
    }

}