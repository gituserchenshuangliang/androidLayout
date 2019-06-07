package com.cls.demo;

import android.os.Bundle;
import android.view.View;

/**
 * 布局学习
 * @author Cherry
 * @date  2019年6月6日
 */
public class ActivityTwo extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_two);
		this.returnCreateListenButton(R.id.A);
	}
	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.A){
			finish();
		}
	}
}
