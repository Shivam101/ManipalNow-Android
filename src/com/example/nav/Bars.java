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

public class Bars extends Fragment {
	static int count3;
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
				 new Level("BigBoss",R.drawable.aloha2),
				 new Level("Blue Waters",R.drawable.attil2),
				 new Level("Cocks n Mocks",R.drawable.biryani2),
				 new Level("DeeTee",R.drawable.china2),
				 new Level("Edge",R.drawable.covere),
				 new Level("Manohar Wines",R.drawable.dollops2),
				 new Level("Remix Lounge",R.drawable.dominos2),
				 new Level("T Spirits",R.drawable.coverc),
				 new Level("Zero Degree Lounge",R.drawable.coverd),
				 /*new Level("Guzzlers",R.drawable.covere),
				 new Level("Hangyo CTF","World Cuisine",R.drawable.covera),
				 new Level("Hangyo Saiba","World Cuisine",R.drawable.saiba2),
				 new Level("Hot Chix","Fast Food",R.drawable.chix2),
				 new Level("Hot n Spicy","Fast Food",R.drawable.coverd),
				 new Level("HotSpot","Fast Food",R.drawable.covere),
				 new Level("KFC","Fast Food",R.drawable.kfc2),
				 new Level("Opium","World Cuisine",R.drawable.coverb),
				 new Level("Paangala Restuarant","South Indian",R.drawable.coverc),
				 new Level("Paratha Point","Indian",R.drawable.coverd),
				 new Level("Pizza Hut","Italian",R.drawable.phut2),
				 new Level("Planet Cafe","Fast Food",R.drawable.pcafe3),
				 new Level("Prax Restaurant","Fast Food",R.drawable.prax3),
				 new Level("Sheela Sagar","",R.drawable.covera),
				 new Level("Stone House","World Cuisine",R.drawable.sthouse2),
				 new Level("Subway","Fast Food",R.drawable.sub2),
				 new Level("Tasty Bite","Fast Food",R.drawable.tasty3),
				 new Level("Tiwaari Chaat","Indian Fast Food",R.drawable.tiwari2),
				new Level("Woodlands","Vegetarian",R.drawable.wood3),
			*/	};
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
				{	count3=1;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);

				}
				if(arg2==1)
				{
					count3=2;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);

				}
				if(arg2==2)
				{
					count3=3;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==3)
				{
					count3=4;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==4)
				{
					count3=5;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==5)
				{	count3=6;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);

				}
				if(arg2==6)
				{	count3=7;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==7)
				{
					count3=8;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==8)
				{
					count3=9;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==9)
				{
					count3=10;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==10)
				{
					count3=11;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==11)
				{
					count3=12;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==12)
				{
					count3=13;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==13)
				{
					count3=14;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==14)
				{
					count3=15;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==15)
				{
					count3=16;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==16)
				{
					count3=17;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==17)
				{
					count3=18;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==18)
				{
					count3=19;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				if(arg2==19)
				{
					count3=20;
					Intent i=new Intent(getActivity(),BarFragment.class);
					getActivity().startActivity(i);
					getActivity().overridePendingTransition(R.anim.right_slide_1,R.anim.right_slide_2);
				}
				


				
			}
		});
        return root;
        
    

}
}
