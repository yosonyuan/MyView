package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class DrawMyView extends View {

	//使用资源文件填充时必须的构造函数
	public DrawMyView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	//使用资源文件填充时必须的构造函数
	public DrawMyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	//使用代码创建时必须的构造函数
	public DrawMyView(Context context) {
		super(context);
	}
	
	/**
	 * 测量绘制的图形的大小
	 */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}
	
	
	/**
	 * 图形将会放置在布局文件的位置
	 */
	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		super.onLayout(changed, left, top, right, bottom);
	}

	/**
	 * 绘制图形的方法
	 */
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}




	
	
	
	
	
	

}
