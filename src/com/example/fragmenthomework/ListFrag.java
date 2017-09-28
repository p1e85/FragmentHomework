package com.example.fragmenthomework;

import java.util.ArrayList;

import com.example.fragmenthomework.ItemClickInterface;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListFrag extends ListFragment implements ItemClickInterface, DisplayFrag.ChangeList {
	
		MainActivity main = new MainActivity();
		
		DisplayFrag frag;

	ItemClickInterface callback;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setHasOptionsMenu(true);
		
		//main.initAdapter();

	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		if (callback != null) {
			callback.onItemClick(position);
		}
	}
/*
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.main, menu);

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_add) {
			
			  Toast.makeText(getActivity(), "Action Add", Toast.LENGTH_SHORT).show(); 
			Random rand = new Random(); int
			  randomXmen = rand.nextInt(xmen.length); if (adapter.getCount() <
			  xmen.length) { adapter.add(xmen[(int)
			  adapter.getItemId(randomXmen)]);
			  
			  
			  //adapter.add(xmen[adapter.getCount()]); }
			 
			return true;
		}
		if (id == R.id.action_delete) {
			
			  Toast.makeText(getActivity(), "All Deleted", Toast.LENGTH_SHORT).show();
			  if (xmenList.size() > 0)
			  xmenList.clear();
			  
			  adapter.notifyDataSetChanged(); 
			  
			  return true;
			 
		}
		return super.onOptionsItemSelected(item);
	}*/

	void setItemClickCallback(ItemClickInterface callback) {
		this.callback = callback;
	}

	public void getEditText(String etext) {

	}

	@Override
	public void saveEditText(String etext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemClick(int position) {
		// TODO Auto-generated method stub
		
	}

}
