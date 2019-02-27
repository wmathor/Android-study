package cn.edu.wic.passvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.edu.wic.User.User;

public class ClassPassValueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_pass_value);

        Intent intent = getIntent();
        // User user = (User) intent.getSerializableExtra("user");//类实现Serializable接口时用
        User user = (User) intent.getParcelableExtra("user");//类实现Parcelable接口时用
        TextView tv_name = (TextView) findViewById(R.id.UserNameText3);
        TextView tv_password = (TextView) findViewById(R.id.PassWordText3);
        String name = user.getName();
        String password = user.getPassword();
        tv_name.setText(name);
        tv_password.setText(password);
    }
}
