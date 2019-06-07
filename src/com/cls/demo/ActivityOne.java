package com.cls.demo;

import android.os.Bundle;

/**
 * 布局学习
 * @author Cherry
 * @date  2019年6月6日
 */
public class ActivityOne extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_one);
		this.startButtonsActivity(R.id.A, ActivityOne.this, ActivityTwo.class);
		this.startButtonsActivity(R.id.B, ActivityOne.this, ActivityFour.class);
		this.startButtonsActivity(R.id.C, ActivityOne.this, ActivityFive.class);
		this.startButtonsActivity(R.id.D, ActivityOne.this, ActivityThree.class);
	}
}
