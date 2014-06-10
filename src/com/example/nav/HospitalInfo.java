package com.example.nav;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HospitalInfo extends Fragment {
	

	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.rinfo2, null);
        TextView tv1=(TextView)root.findViewById(R.id.tv1);
        TextView tv2=(TextView)root.findViewById(R.id.tv2);
        TextView tv3=(TextView)root.findViewById(R.id.tv3);
        TextView tv4=(TextView)root.findViewById(R.id.tv4);
        TextView tv5=(TextView)root.findViewById(R.id.tv5);
        TextView tv6=(TextView)root.findViewById(R.id.tv6);
        ImageView img_map=(ImageView)root.findViewById(R.id.img1);
        View v = new ImageView(getActivity());
        setHasOptionsMenu(true);
        
        Typeface robotoLight = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Light.ttf");
		Typeface robotoThin = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Thin.ttf");
		Typeface robotoRegular = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Regular.ttf");
		/*Level data[]=new Level[]
				{
					new Level("CALL","",R.drawable.call2),
					new Level("INVITE FRIENDS","",R.drawable.share),
				};
		LevelAdapter adapter = new LevelAdapter(getActivity(),
                R.layout.list_item4,data);*/
     
		//lv1.setAdapter(adapter);
		//View header = inflater.inflate(R.layout.header1, null);
		if(Hospitals.count4==1)
		{
			tv1.setText("Barista");
			tv1.setTypeface(robotoLight);
			tv2.setTypeface(robotoLight);
			tv3.setText(getResources().getString(R.string.aloha));
			tv4.setTypeface(robotoLight);
			tv5.setTypeface(robotoLight);
			tv5.setText("3.0 out of 5");
			tv6.setTypeface(robotoLight);
			 img_map.setImageDrawable(v.getResources().getDrawable(R.drawable.aloha_map));		
			 }
		else if(Hospitals.count4==2)
		{
			tv1.setText("Basil Cafe");
			tv1.setTypeface(robotoLight);
			tv2.setTypeface(robotoLight);
			tv3.setText(getResources().getString(R.string.attill));
			tv4.setTypeface(robotoLight);
			tv5.setTypeface(robotoLight);
			tv5.setText("4.0 out of 5");
			tv6.setTypeface(robotoLight);
			img_map.setImageDrawable(v.getResources().getDrawable(R.drawable.attill));

		}
		else if(Hospitals.count4==3)
		{
			tv1.setText("Cafe Coffee Day");
			tv1.setTypeface(robotoLight);
			tv2.setTypeface(robotoLight);
			tv3.setText(getResources().getString(R.string.biryaniadda));
			tv4.setTypeface(robotoLight);
			tv5.setTypeface(robotoLight);
			tv5.setText("4.0 out of 5");
			tv6.setTypeface(robotoLight);

		
		}
		else if(Hospitals.count4==4)
		{
			tv1.setText("Cosmo Cafe");
			tv1.setTypeface(robotoLight);
			tv2.setTypeface(robotoLight);
			tv3.setText(getResources().getString(R.string.chinavalley));
			tv4.setTypeface(robotoLight);
			tv5.setTypeface(robotoLight);
			tv5.setText("3.5 out of 5");
			tv6.setTypeface(robotoLight);
			img_map.setImageDrawable(v.getResources().getDrawable(R.drawable.china_valley_map));

		
		}
		else if(Hospitals.count4==5)
		{
			tv1.setText("Cafe MnM");
			tv1.setTypeface(robotoLight);
			tv2.setTypeface(robotoLight);
			tv3.setText(getResources().getString(R.string.dishes));
			tv4.setTypeface(robotoLight);
			tv5.setTypeface(robotoLight);
			tv5.setText("3.5 out of 5");
			tv6.setTypeface(robotoLight);
			img_map.setImageDrawable(v.getResources().getDrawable(R.drawable.dishes_map));


		
		}
		else if(Hospitals.count4==6)
		{
			tv1.setText("7 Bees");
			tv1.setTypeface(robotoLight);
			tv2.setTypeface(robotoLight);
			tv3.setText(getResources().getString(R.string.dollops));
			tv4.setTypeface(robotoLight);
			tv5.setTypeface(robotoLight);
			tv5.setText("4.0 out of 5");
			tv6.setTypeface(robotoLight);
			img_map.setImageDrawable(v.getResources().getDrawable(R.drawable.dollops_map));

		
		}
				
        return root;
		

}
	
	public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu, inflater);
    	inflater.inflate(R.menu.rest_info, menu);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.action_call:
		{
			if(Hospitals.count4==1)
			{
			 Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.aloha_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			}
			else if(Hospitals.count4==2)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.attill_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			}
			else if(Hospitals.count4==3)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.biryani_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			
			}
			else if(Hospitals.count4==4)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.china_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			}
			else if(Hospitals.count4==5)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.dishes_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			}
			else if(Hospitals.count4==6)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.dollops_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			
			}
			else if(Hospitals.count4==7)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.dominos_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
			}
			else if(Hospitals.count4==9)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.grababite_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
		    }
			else if(Hospitals.count4==10)
			{
				Intent i = new Intent(Intent.ACTION_DIAL);
		        String p = "tel:" + getString(R.string.guzzlers_num);
		        i.setData(Uri.parse(p));
		        startActivity(i);
		    
			}
			break;
		}
		case R.id.action_share:
			if(Hospitals.count4==1)
			{
				Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
				sharingIntent.setType("text/plain");
				sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Shared from Manipal Now");
				sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "some sample");
				startActivity(Intent.createChooser(sharingIntent, "Share via"));
			}
		}
		
		return false;	
		
		
	}

}
