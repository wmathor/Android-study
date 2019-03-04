package cn.edu.wic.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("MainActivity was Created...");
        TextView tv = findViewById(R.id.textView);
        tv.setText("MainActivity");

        // CallThisButton
        findViewById(R.id.CallThisButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // CallOtherButton
        findViewById(R.id.CallOtherButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity is Sarting...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("MainActivity is Destroying...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("MainActivity is Pausing...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("MainActivity is Restarting...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity is Resuming...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("MainActivity is Stopping...");
    }
}