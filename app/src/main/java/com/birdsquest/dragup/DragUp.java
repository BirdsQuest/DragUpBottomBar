package com.birdsquest.dragup;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;

/**
build.gradle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 compile 'com.android.support:appcompat-v7:23.2.0'
 compile 'com.android.support:design:23.2.0'
*/

public class DragUp extends CoordinatorLayout{

	public DragUp(Context context){
		super(context);
		init(context, null, -1);
	}

	public DragUp(Context context, AttributeSet attrs){
		super(context, attrs);
		init(context, attrs, -1);
	}

	public DragUp(Context context, AttributeSet attrs, int defStyleAttr){
		super(context, attrs, defStyleAttr);
		init(context, attrs, defStyleAttr);
	}
	public void init(Context context, AttributeSet attrs, int defStyleAttr){

	}
}
