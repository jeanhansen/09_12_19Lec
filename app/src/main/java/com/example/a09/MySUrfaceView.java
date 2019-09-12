package com.example.a09;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySUrfaceView extends SurfaceView {
    private int radius;

    public MySUrfaceView(Context context, AttributeSet attrs){
        super(context, attrs);

        setWillNotDraw(false);

        radius = 0;

    }

    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.LTGRAY);

        paint.setStrokeWidth(5.0f);

        canvas.drawRect(10,10,100,200,paint);
        Bitmap myImageBMP = BitmapFactory.decodeResource(getResources(), R.drawable.roses_are_red);
canvas.drawColor(Color.BLACK);
canvas.drawBitmap(myImageBMP, 00, 00, null);
}













}
