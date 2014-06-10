package com.example.nav;

import java.util.Locale;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class Coffee extends ActionBarActivity {

	static final String speak1="Here are some of the restaurants near you";
	//TextToSpeech tts;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.city1);
		// Show the Up button in the action bar.
		setupActionBar();
		ActionBar ab=getSupportActionBar();
        Resources r=getResources();
		Drawable d=r.getDrawable(R.color.playred);
		ab.setBackgroundDrawable(d);
		
		//tts=new TextToSpeech(Coffee.this,new OnInitListener() {
			
			/*public void onInit(int status) {
				// TODO Auto-generated method stub
				if(status!=TextToSpeech.ERROR)
				{
					tts.setLanguage(Locale.UK);
				}
			}
		});
		tts.speak(speak1, TextToSpeech.QUEUE_FLUSH, null);
		*/GridView gv1=(GridView)findViewById(R.id.gridview);
		Level data[]=new Level[]
				{
				 new Level("Barista","",R.drawable.barista2),
				 new Level("Basil Cafe","",R.drawable.basil),
				 new Level("Cafe Coffee Day","",R.drawable.ccd),
				 new Level("Cosmo Cafe",R.drawable.cosmo),
				 new Level("Cafe MnM",R.drawable.mnm),
				 new Level("7 Bees",R.drawable.cafe_empty),
				 };
		ImageAdapter ia=new ImageAdapter(this, R.layout.grid_item_2, data);
		gv1.setAdapter(ia);


	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.coffee, menu);
		return true;
	}

	@Override
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
			this.overridePendingTransition(R.anim.push_down_out,R.anim.push_down_in);

			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
