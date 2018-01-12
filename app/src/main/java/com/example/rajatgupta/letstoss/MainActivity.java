package com.example.rajatgupta.letstoss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView v1;
    Button b1;
    Random r;
     int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1=(ImageView)findViewById(R.id.img1);
        b1=(Button)findViewById(R.id.bid1);
        r=new Random();
        b1.setOnClickListener(this);

    }
    @Override
    public  void onClick(View v) {
        switch (v.getId()) {
            case R.id.bid1:
                 b1.setText("hello");
              c=r.nextInt(2);

            if(c==0) {
                v1.setImageResource(R.drawable.head);
                Toast.makeText(MainActivity.this, "heads", Toast.LENGTH_SHORT ).show();
            }

            else if(c==1)
            {
                v1.setImageResource(R.drawable.tail);
                Toast.makeText(MainActivity.this, "tails", Toast.LENGTH_SHORT ).show();

            }
                RotateAnimation rotate=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                 rotate.setDuration(1000);
                v1.startAnimation(rotate);
                b1.startAnimation(rotate);



        }
    }

}
