package cn.edu.wic.passvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BundlePassValueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_pass_value);
        Intent intent = getIntent();
        TextView tv_name = (TextView)findViewById(R.id.UserNameText2);
        TextView tv_password = (TextView)findViewById(R.id.PassWordText2);
        Bundle bd = intent.getExtras();
        String name = bd.getString("name");
        String password = bd.getString("password");
        tv_name.setText(name);
        tv_password.setText(password);
    }
}
