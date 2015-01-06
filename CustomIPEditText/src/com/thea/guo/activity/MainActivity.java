package com.thea.guo.activity;

import com.thea.guo.R;
import com.thea.guo.view.IPEditText;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	IPEditText mEditText;
	Button mButton;
	TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mEditText=(IPEditText) findViewById(R.id.mycustom);
		mButton=(Button) findViewById(R.id.mybutton);
		mTextView=(TextView) findViewById(R.id.mytextview);
		
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mTextView.setText(mEditText.getText(MainActivity.this));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return false;
	}

}
