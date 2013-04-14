package com.paresh.gridviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class GridViewExampleActivity extends Activity {
    /** Called when the activity is first created. */
	
	private GridviewAdapter mAdapter;
	private ArrayList<String> listCountry;
	private ArrayList<Integer> listFlag;
	
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        prepareList();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listCountry, listFlag);
        
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
        
        // Implement On Item click listener
        gridView.setOnItemClickListener(new OnItemClickListener() 
        {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Toast.makeText(GridViewExampleActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
			}
		});
        
    }
    
    public void prepareList()
    {
    	  listCountry = new ArrayList<String>();
    	  
    	  listCountry.add("india");
    	  listCountry.add("Brazil");
          listCountry.add("Canada");
          listCountry.add("China");
          listCountry.add("France");
          listCountry.add("Germany");
          listCountry.add("Iran");
          listCountry.add("Italy");
          listCountry.add("Japan");
          listCountry.add("Korea");
          listCountry.add("Mexico");  
          listCountry.add("Netherlands");
          listCountry.add("Portugal");  
          listCountry.add("Russia");
          listCountry.add("Saudi Arabia");  
          listCountry.add("Spain");
          listCountry.add("Turkey");
          listCountry.add("United Kingdom");
          listCountry.add("United States");
          
          listFlag = new ArrayList<Integer>();
          listFlag.add(R.drawable.india);
          listFlag.add(R.drawable.brazil);
          listFlag.add(R.drawable.canada);
          listFlag.add(R.drawable.china);
          listFlag.add(R.drawable.france);
          listFlag.add(R.drawable.germany);
          listFlag.add(R.drawable.iran);
          listFlag.add(R.drawable.italy);
          listFlag.add(R.drawable.japan);
          listFlag.add(R.drawable.korea);
          listFlag.add(R.drawable.mexico);
          listFlag.add(R.drawable.netherlands);
          listFlag.add(R.drawable.portugal);
          listFlag.add(R.drawable.russia);
          listFlag.add(R.drawable.saudi_arabia);
          listFlag.add(R.drawable.spain);
          listFlag.add(R.drawable.turkey);
          listFlag.add(R.drawable.united_kingdom);
          listFlag.add(R.drawable.united_states);
    }
   
}