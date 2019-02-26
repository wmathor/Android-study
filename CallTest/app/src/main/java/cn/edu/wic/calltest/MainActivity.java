package cn.edu.wic.calltest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // callNewActivity
        Button callNewActivity = (Button) findViewById(R.id.CallNewActivity);
        callNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, newActivity.class);
                startActivity(intent);
            }
        });

        // callURL
        Button callURL = (Button) findViewById(R.id.CallURL);
        callURL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://wmathor.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // CallPhoneOnDial
        Button callPhoneOnDial = (Button) findViewById(R.id.CallPhoneOnDial);
        callPhoneOnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "12345678910"));
                startActivity(intent);
            }
        });

        // CallPhone
        Button callPhone = (Button) findViewById(R.id.CallPhone);
        callPhone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + "12345678910"));
                startActivity(intent);
            }
        });
    }
}
