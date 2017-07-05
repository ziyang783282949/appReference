package com.demo.fuzhucheng.someShapesImageview;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.demo.fuzhucheng.R;

public class ImageViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        final ImageView shapeCircle=(ImageView)findViewById(R.id.shapecircle);
        final ImageView myCircle=(ImageView)findViewById(R.id.mycircle);
        //myCircle.setImageDrawable(this.getResources().getDrawable(R.drawable.history));
        //myCircle.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher));
        shapeCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "可见是一个方框",
                        Toast.LENGTH_SHORT).show();
            }
        });
        myCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "可见不是一个方框",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
