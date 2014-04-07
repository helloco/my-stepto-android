package com.example.calculate;

import com.example.calculate.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private Button calculate = null; 
	private EditText editText1 = null;
	private EditText editText2 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		calculate = (Button)findViewById(R.id.calculate);
		editText1 = (EditText)findViewById(R.id.editText1);
		editText2 = (EditText)findViewById(R.id.editText2);
		calculate.setOnClickListener(new myListener());
		
	}
	//menu 。当用户点击菜单的时候调用该方法
	public boolean onCreateOptionMenu(Menu menu){
		menu.add(0, 1, 1, R.string.about);
		menu.add(0, 2, 2, R.string.exit);
		
		return super.onCreateOptionsMenu(menu);
		
	}
	public boolean onOptionsItemSelected(MenuItem item){
		if(item.getItemId() == 1){
			finish();
		}
		return super.onOptionsItemSelected(item);
		
	}
	class myListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			String va1 = editText1.getText().toString();
			String va2 = editText2.getText().toString();
			intent.putExtra("value1", va1);
			intent.putExtra("value2", va2);
			intent.setClass(MainActivity.this, ResultActivity.class);
			MainActivity.this.startActivity(intent);
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
