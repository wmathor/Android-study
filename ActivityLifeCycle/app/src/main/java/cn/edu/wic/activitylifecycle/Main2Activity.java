package cn.edu.wic.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        System.out.println("Main2Activity was Created...");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Main2Activity");


        // CallThisButton
        findViewById(R.id.CallThisButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        // CallOtherButton
        findViewById(R.id.CallOtherButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Main2Activity is Sarting...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Main2Activity is Destroying...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Main2Activity is Pausing...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Main2Activity is Restarting...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Main2Activity is Resuming...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Main2Activity is Stopping...");
    }
}