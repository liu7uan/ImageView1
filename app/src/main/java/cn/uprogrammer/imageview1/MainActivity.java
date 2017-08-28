package cn.uprogrammer.imageview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  ImageView img1;
    private  ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.RelativeLayout);
/*
        img1=(ImageView)findViewById(R.id.imageview1);
        img2=(ImageView)findViewById(R.id.imageview2);
//        img1.setImageResource(R.drawable.timg);
        img1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        img2.setScaleType(ImageView.ScaleType.FIT_CENTER);*/
    }
}
