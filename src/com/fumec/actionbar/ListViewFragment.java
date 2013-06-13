package com.fumec.actionbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class ListViewFragment extends SherlockFragment implements OnItemClickListener {
	
	private ArrayAdapter<String> adapter;
	private OnClickTimeListner onClickTimeListner;
	private DetailFragment detail;
	

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		detail = (DetailFragment) ((SherlockFragmentActivity)getSherlockActivity()).getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
		
		String[] times = new String[]{"Cruzeiro", "Atletico", "Flamengo", "Corintias"};
		
		adapter = new ArrayAdapter<String>(getSherlockActivity(), android.R.layout.simple_list_item_1,times);
		
		ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_listview, container, false);
		
		ListView listView = (ListView)rootView.findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
		
		return rootView;
	}
	

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long location) {
		String name = this.adapter.getItem(position);
		detail.setNameTime(name);
//		onClickTimeListner.onClickTime(name);
		
	}

	public OnClickTimeListner getOnClickTimeListner() {
		return onClickTimeListner;
	}


	public void setOnClickTimeListner(OnClickTimeListner onClickTimeListner) {
		this.onClickTimeListner = onClickTimeListner;
	}

	public interface OnClickTimeListner {
		public void onClickTime(String name);
	}
}
