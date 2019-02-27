package cn.edu.wic.passvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SimplePassValueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_pass_value);
        Intent intent = getIntent();
        TextView tv_name = (TextView)findViewById(R.id.UserNameText1);
        TextView tv_password = (TextView)findViewById(R.id.PassWordText1);
        String name = intent.getStringExtra("name");
        String password = intent.getStringExtra("password");
        tv_name.setText(name);
        tv_password.setText(password);
    }
}
