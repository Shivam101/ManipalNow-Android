package com.example.nav;

import java.util.Locale;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class Food extends ActionBarActivity {

	static final String speak1="Here are some of the restaurants near you";
	TextToSpeech tts;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.city1);
		setupActionBar();
		android.support.v7.app.ActionBar ab=getSupportActionBar();
		ab.hide();

		tts=new TextToSpeech(Food.this,new OnInitListener() {
			
			@Override
			public void onInit(int status) {
				// TODO Auto-generated method stub
				if(status!=TextToSpeech.ERROR)
				{
					tts.setLanguage(Locale.UK);
				}
			}
		});
		tts.speak(speak1, TextToSpeech.QUEUE_FLUSH, null);
		GridView gv1=(GridView)findViewById(R.id.gridview);
		Level data[]=new Level[]
				{
				 new Level("Aloha","Continental",R.drawable.aloha2),
				 new Level("Attil","",R.drawable.attil2),
				 new Level("Biryani Adda",R.drawable.biryani2),
				 new Level("China Valley","Chinese",R.drawable.china2),
				 new Level("Dishes",R.drawable.covere),
				 new Level("Dollops",R.drawable.dollops2),
				 new Level("Dominos Pizza","Italian",R.drawable.dominos2),
				 new Level("Fish Maxx",R.drawable.coverc),
				 new Level("Grab-a-Bite",R.drawable.coverd),
				 new Level("Guzzlers",R.drawable.covere),
				 new Level("Hangyo CTF",R.drawable.covera),
				 new Level("Hangyo Saiba",R.drawable.saiba2),
				 new Level("Hot Chix",R.drawable.chix2),
				 new Level("Hot n Spicy",R.drawable.coverd),
				 new Level("HotSpot",R.drawable.covere),
				 new Level("KFC",R.drawable.kfc2),
				 new Level("Opium",R.drawable.coverb),
				 new Level("Paangala Restuarant",R.drawable.coverc),
				 new Level("Paratha Point",R.drawable.coverd),
				 new Level("Pizza Hut",R.drawable.phut2),
				// new Level("Planet Cafe",R.drawable.pcafe2),
				 //new Level("Poornima Juice Centre",R.drawable.covera),
				 //new Level("Prax Restaurant",R.drawable.prax2),
				// new Level("Red Kitchen",R.drawable.covera),
				 //new Level("Shantala Restuarant",R.drawable.covera),
				 new Level("Sheela Sagar",R.drawable.covera),
				 new Level("Stone House",R.drawable.sthouse2),
				 new Level("Subway",R.drawable.sub2),
				 //new Level("Tasty Bite",R.drawable.tasty2),
				 new Level("Tiwaari Chaat",R.drawable.tiwari2),
			//	 new Level("Uncle's Point",R.drawable.covera),
				// new Level("Woodlands Restaurant",R.drawable.wood2),



				};
		ImageAdapter ia=new ImageAdapter(this, R.layout.grid_item, data);
		gv1.setAdapter(ia);


	}
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	
	protected void onPause()
	{
		super.onPause();
		if(tts!=null){
		tts.stop();
		tts.shutdown();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.food, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			this.overridePendingTransition(R.anim.push_down_in_2,R.anim.push_down_out_2);

			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
