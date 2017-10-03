package com.example.jromeromar.infowindows.Controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.jromeromar.infowindows.R;

public class ProhibitedImage extends RelativeLayout implements View.OnClickListener {

    private ImageView imgProhibite,imgIcono;
    private Drawable icon;
    private Context context;
    private int countImagen=0;

    public ProhibitedImage(Context context) {
        super(context);
        inflateLayouts(context,null);
    }

    public ProhibitedImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateLayouts(context,attrs);
    }

    public ProhibitedImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateLayouts(context,attrs);
    }
    private void  inflateLayouts(Context context, AttributeSet attrs)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.prohibited_layout,this);
        if(attrs!=null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ProhibitedImage);
            icon = typedArray.getDrawable(R.styleable.ProhibitedImage_iconoRef);
        }
        this.context=context;
    }
    @Override
    protected void onFinishInflate() {
        imgProhibite =(ImageView)findViewById(R.id.imgProhibido);
        imgIcono=(ImageView)findViewById(R.id.imgIcono);
        imgIcono.setOnClickListener(this);
        if(icon!=null){
            imgIcono.setImageDrawable(icon);
        }
        super.onFinishInflate();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imgIcono:
                if(countImagen%2==0) {
                    imgProhibite.setVisibility(INVISIBLE);
                }
                else{
                    imgProhibite.setVisibility(VISIBLE);
                }
                countImagen++;
                break;
        }

    }
}
