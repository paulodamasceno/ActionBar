package com.fumec.actionbar;

import android.os.Bundle;
import android.util.Log;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.fumec.actionbar.ListViewFragment.OnClickTimeListner;


public class MainActivity extends SherlockFragmentActivity implements OnClickTimeListner {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListViewFragment fgmListView = (ListViewFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_listview);
		DetailFragment fgmDetail = (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
		fgmListView.setOnClickTimeListner(fgmDetail);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClickTime(String name) {
		
		DetailFragment fgmDetail = (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
		fgmDetail.setNameTime(name);
		Log.i("TIME", name);
		
	}

}
