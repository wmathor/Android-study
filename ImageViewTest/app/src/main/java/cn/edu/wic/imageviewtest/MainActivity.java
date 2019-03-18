package cn.edu.wic.imageviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int[] imageId = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};
    private int index = 1;
    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView1.setImageResource(imageId[index]);
        Button pre = (Button) findViewById(R.id.button);
        Button next = (Button) findViewById(R.id.button2);

        // NEXT
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (index < imageId.length - 1)
                    index++;
                else
                    index = 0;
                imageView1.setImageResource(imageId[index]);
            }
        });

        // PRE
        pre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (index > 0)
                    index--;
                else
                    index = imageId.length - 1;
                imageView1.setImageResource(imageId[index]);
            }
        });
    }
}