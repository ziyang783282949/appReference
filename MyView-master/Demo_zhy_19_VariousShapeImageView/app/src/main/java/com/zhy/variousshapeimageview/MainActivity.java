package com.zhy.variousshapeimageview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.zhy.view.RoundImageView;

public class MainActivity extends Activity
{
	private int i=0;
	private RoundImageView mQiQiu;
	private RoundImageView mMeiNv ; 

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mQiQiu = (RoundImageView) findViewById(R.id.id_qiqiu);
		mMeiNv = (RoundImageView) findViewById(R.id.id_meinv);
		
		mQiQiu.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				//mQiQiu.setType(RoundImageView.TYPE_ROUND);
				if(i==0){
					mQiQiu.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.aa));
					i=(i+1)%2;
				}
				if(i==1){
					mQiQiu.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.im3));
					i=(i+1)%2;
				}
			}
		});
		
		mMeiNv.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				mMeiNv.setBorderRadius(90);
			}
		});
	}

}
