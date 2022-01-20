package com.example.imageSwitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ImageView iv;
    boolean flag;
    int images[]={R.drawable.image1,R.drawable.image2,R.drawable.image3};
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.imageView);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        flag=true;
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                i++;
                if(i==3)
                    i=0;
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                i--;
                if(i==0)
                    i=2;
            }
        });
    }
}