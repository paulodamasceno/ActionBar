package com.fumec.actionbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class ListViewFragment extends SherlockFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		String[] times = new String[]{"Cruzeiro", "Atletico", "Flamengo", "Corintias"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getSherlockActivity(), android.R.layout.simple_list_item_1,times);
		
		ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_listview, container, false);
		ListView listView = (ListView)rootView.findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		
		return rootView;
	}
}
