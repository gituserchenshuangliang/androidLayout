package com.cls.demo;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author Cherry
 * @date  2019年6月6日
 */
public class BaseActivity extends Activity implements OnClickListener{
	private static final String TAG = "BaseActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 * 输出当前活动名称
		 */
		Log.d(TAG,getClass().getSimpleName());
		/*
		 * 活动的添加到管理器
		 */
		ActivityManager.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		/*
		 * 从管理器移除活动
		 */
		ActivityManager.removeActivity(this);
	}
	
	/*
	 * 创建监听返回按钮对象
	 */
	public  Button returnCreateListenButton(int r){
		Button btn =  (Button) findViewById(r);
		btn.setOnClickListener(this);
		return btn;
	}
	
	/*
	 * 创建监听按钮对象
	 */
	public  void createListenButton(int r){
		Button btn =  (Button) findViewById(r);
		btn.setOnClickListener(this);
	}
	
	/*
	 * 直接点击按钮进入活动
	 */
	@SuppressWarnings("rawtypes")
	public void startButtonsActivity(int r,final Context context,final Class activityClass){
		Button btn =  (Button) findViewById(r);
		btn.setOnClickListener(this);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ints = new Intent(context, activityClass);
				startActivity(ints);
			}
		});
	}

	@Override
	public void onClick(View v) {
	}
}
