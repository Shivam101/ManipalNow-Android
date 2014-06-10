package com.example.nav;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class Settings3 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings3);
		ListView lv1=(ListView)findViewById(R.id.listView1);
		Level weather_data[]=new Level[]
				{
					new Level("About",R.drawable.about_settings),
					new Level("Contact",R.drawable.email_settings),
					new Level("Report a Bug",R.drawable.bug_settins),
					new Level("Privacy Policcy",R.drawable.privacy_settings)
				};
		LevelAdapter adapter = new LevelAdapter(this,
                R.layout.drawer_list_item_2, weather_data);
		lv1.setAdapter(adapter);
		ActionBar ab=getSupportActionBar();
		Resources r=getResources();
		Drawable d=r.getDrawable(R.color.playred);
		ab.setBackgroundDrawable(d);
		
		// Show the Up button in the action bar.
		setupActionBar();
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
		getMenuInflater().inflate(R.menu.settings3, menu);
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
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
