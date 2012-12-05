package com.rikt.tech.and.samplepinchzoomforimageaview;

import com.rikt.tech.and.pinchzoomforimageview.PinchZoomForImageView;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

public class MainActivity extends Activity {
	PinchZoomForImageView pinchZoom;
	ImageView iv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.imageView1);
        //creating object with parameters as imageview,image,width,height,resource
        pinchZoom=new PinchZoomForImageView(iv,R.drawable.branches,1600,2000,getResources());
        pinchZoom.setPinchZoom();
        
    }
}
