package com.example.fragmenthomework;

import java.util.Random;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class DisplayFrag extends Fragment {
	String displayText;
	TextView text;
	EditText et1;
	Button btnSave, btnCancel;
	
	public interface ChangeList {
		public void saveEditText(String etext);
	}
	
	ChangeList callback;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		callback = (ChangeList) activity;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.display_data, container, false);
		setHasOptionsMenu(true);

		et1 = (EditText) view.findViewById(R.id.et1);
		btnSave = (Button) view.findViewById(R.id.btnSave);
		//btnCancel = (Button) view.findViewById(R.id.btnCancel);
		
		btnSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String etext;
				etext = et1.getText().toString();
				callback.saveEditText(etext);
				
			}
		});
		
		/*btnCancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				getActivity().getFragmentManager().popBackStack();
				
			}
		});*/
		
		text = (TextView) view.findViewById(R.id.et1);

		if (displayText != null) {
			text.setText(displayText);
		}

		return view;
	}
	
	
	public void setDisplayText(String str) {
		displayText = str;
		if(text != null) {
			text.setText(str);
		}
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.display_frag_menu, menu);
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_save) {
			
			 
			return true;
		}
		if (id == R.id.action_cancel) {
			getActivity().getFragmentManager().popBackStack();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
