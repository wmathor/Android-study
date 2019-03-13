package cn.edu.wic.radiocheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RadioGroup
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);

        // CheckBox
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);

        checkBox1.setOnCheckedChangeListener(new BootBallOnCheckedChangeListener());
        checkBox2.setOnCheckedChangeListener(checkbox_linstener);
        checkBox3.setOnCheckedChangeListener(checkbox_linstener);

        // SubmitButton
        Button button = (Button) findViewById(R.id.button);

        // SetButtonClickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < radioGroup.getChildCount(); i++) {
                    RadioButton r = (RadioButton) radioGroup.getChildAt(i);
                    String str = "Your Profession is" + r.getText() + "\n";
                    if (checkBox1.isChecked())
                        str += checkBox1.getText().toString() + " ";
                    if (checkBox2.isChecked())
                        str += checkBox2.getText().toString() + " ";
                    if (checkBox3.isChecked())
                        str += checkBox3.getText().toString() + " ";
                    if (r.isChecked())
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                }
            }

        });


        // RadioGroup CheckedChangeListener
        final RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.RadioGroup);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r = (RadioButton) findViewById(i);
                Toast.makeText(MainActivity.this, "Your Hobby is" + r.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // CheckBox CheckChangeListener
    private CheckBox.OnCheckedChangeListener checkbox_linstener = new CheckBox.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonview, boolean ischeck) {
            if (ischeck)
                Toast.makeText(MainActivity.this, "Your checked " + buttonview.getText().toString() + "", Toast.LENGTH_SHORT).show();
        }
    };

    // Ohter CheckBox CheckchangeListener
    class BootBallOnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (isChecked)
                Toast.makeText(getApplicationContext(), "Your hobby is Swim", Toast.LENGTH_SHORT).show();
        }
    }
}