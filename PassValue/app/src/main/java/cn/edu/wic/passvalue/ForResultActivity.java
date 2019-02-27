package cn.edu.wic.passvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.xml.transform.Result;

public class ForResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result);

        findViewById(R.id.ButtonForResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                EditText editText = findViewById(R.id.EditText);
                intent.putExtra("data", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
