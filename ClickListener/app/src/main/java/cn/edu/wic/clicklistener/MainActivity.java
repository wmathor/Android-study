package cn.edu.wic.clicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(MyClickListener);

        // first method
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "FirstButton has been called", Toast.LENGTH_SHORT).show();
            }
        });

        // AutoCompleteTextView
//        String[] autoString = {"Apple", "Apple pencil", "Apple Watch", "Google Map", "Google", "Google Search"};
        String[] autoString = getResources().getStringArray(R.array.autoString);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, autoString);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);

    }

    // second method
    public void button2Click(View v) {
        Toast.makeText(MainActivity.this, "SecondButton has been called", Toast.LENGTH_SHORT).show();
    }

    // third method
    private android.view.View.OnClickListener MyClickListener = new android.view.View.OnClickListener() {
        public void onClick(View v) {
            Button button = (Button) v;
            switch (button.getId()) {
                case R.id.button3:
                    Toast.makeText(MainActivity.this, "ThirdButton has been called", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
