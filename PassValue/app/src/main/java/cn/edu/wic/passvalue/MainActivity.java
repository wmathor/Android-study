package cn.edu.wic.passvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import cn.edu.wic.User.User;

public class MainActivity extends AppCompatActivity {

    private static int REQUEST_CODE = 1011;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ClearButton
        findViewById(R.id.ClearButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_name = findViewById(R.id.UserNameText);
                EditText et_password = findViewById(R.id.PassWordText);
                et_name.setText("");
                et_password.setText("");
            }
        });

        // SimplePassValueButton
        findViewById(R.id.SimplePassValue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimplePassValueActivity.class);
                EditText et_name = findViewById(R.id.UserNameText);
                EditText et_password = findViewById(R.id.PassWordText);
                intent.putExtra("name", et_name.getText().toString());
                intent.putExtra("password", et_password.getText().toString());
                startActivity(intent);
            }
        });

        // BundlePassValueButton
        findViewById(R.id.BundlePassValue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BundlePassValueActivity.class);
                EditText et_name = findViewById(R.id.UserNameText);
                EditText et_password = findViewById(R.id.PassWordText);
                Bundle bd = new Bundle();
                bd.putString("name", et_name.getText().toString());
                bd.putString("password", et_password.getText().toString());
                intent.putExtras(bd);
                startActivity(intent);
            }
        });

        // ClassPassValueButton
        findViewById(R.id.ClassPassValue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassPassValueActivity.class);
                EditText et_name = findViewById(R.id.UserNameText);
                EditText et_password = findViewById(R.id.PassWordText);
                intent.putExtra("user", new User(et_name.getText().toString(), et_password.getText().toString()));
                startActivity(intent);
            }
        });

        // ForResultPassValue
        findViewById(R.id.ForResultPassValue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForResultActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                EditText et_name = findViewById(R.id.UserNameText);
                et_name.setText(data.getStringExtra("data"));
            }
        }
    }
}