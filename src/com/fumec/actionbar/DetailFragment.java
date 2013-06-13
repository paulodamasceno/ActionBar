package com.fumec.actionbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.fumec.actionbar.ListViewFragment.OnClickTimeListner;

public class DetailFragment extends SherlockFragment implements OnClickTimeListner{
	
	private TextView textDetail;
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_detail, container, false);
		textDetail = (TextView)rootView.findViewById(R.id.text_detail);
		return rootView;
	}
	
	public void setNameTime(String name) {
		textDetail.setText(name);
	}

	@Override
	public void onClickTime(String name) {
		textDetail.setText(name);
	}
}
