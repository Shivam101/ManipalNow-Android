package com.example.nav;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class Cafes extends Fragment {
	static int count2;
	static int sc=1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.city1, null);
       // TextView tv1=(TextView)root.findViewById(R.id.tv1);
		Typeface robotoLight = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Thin.ttf");
        View header = inflater.inflate(R.layout.header1, null);

       // tv1.setTypeface(robotoLight);
		GridView gv1=(GridView)root.findViewById(R.id.gridview);
		Level data[]=new Level[]
				{
				 new Level("Barista","",R.drawable.barista2),
				 new Level("Basil Cafe","",R.drawable.basil),
				 new Level("Cafe Coffee Day","",R.drawable.ccd),
				 new Level("Cosmo Cafe",R.drawable.cosmo),
				 new Level("Cafe MnM",R.drawable.mnm),
				 new Level("7 Bees",R.drawable.cafe_empty),
				 };
		ImageAdapter ia=new ImageAdapter(getActivity(), R.layout.grid_item_2, data);
	     //  gv1.addView(header);

		gv1.setAdapter(ia);

		//gv1.setAdapter(new ImageAdapter(getActivity()));
		gv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0)
				{	count2=1;
					Intent i=new Intent(getActivity(),CafeFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);

				}
				if(arg2==1)
				{
					count2=2;
					Intent i=new Intent(getActivity(),CafeFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);

				}
				if(arg2==2)
				{
					count2=3;
					Intent i=new Intent(getActivity(),CafeFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==3)
				{
					count2=4;
					Intent i=new Intent(getActivity(),CafeFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==4)
				{
					count2=5;
					Intent i=new Intent(getActivity(),CafeFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==5)
				{
					count2=6;
					Intent i=new Intent(getActivity(),CafeFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				
			}
		});
        return root;
        
    

}
}
