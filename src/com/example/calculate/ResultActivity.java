package com.example.calculate;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity{
	private TextView textView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		//receive the value from mainActivity
		Intent intent = getIntent();
		String value1 = intent.getStringExtra("value1");
		String value2 = intent.getStringExtra("value2");
		int v1 = Integer.parseInt(value1);
		int v2 = Integer.parseInt(value2);
		int res = (v1 * v2);
		textView = (TextView)findViewById(R.id.resTextView);
		textView.setText(res+"");
	}
	
}
