package com.example.nav;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelpFragment8 extends Fragment {
	
	@SuppressLint("ResourceAsColor")
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.helpfrag, null);
        ImageView iv1=(ImageView)root.findViewById(R.id.helpimg1);
        TextView title=(TextView)root.findViewById(R.id.tv2);
        TextView desc=(TextView)root.findViewById(R.id.tv3);
        TextView swipe=(TextView)root.findViewById(R.id.tv1);
        View v2=new TextView(getActivity());
        swipe.setVisibility(v2.GONE);
        Button b1=(Button)root.findViewById(R.id.saveButton);
        Typeface robotoLight = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Light.ttf");
        View v=new ImageView(getActivity());
        iv1.setImageDrawable(v.getResources().getDrawable(R.drawable.mike));	
		title.setText("Talk to me");
		title.setTextColor(getResources().getColor(R.color.playgreen));
		desc.setText("Because using fingers is too mainstream");
		desc.setTypeface(robotoLight);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getActivity(),MainActivity.class);
				startActivity(i);
				getActivity().finish();
			}
		});
		
        return root;
    

}
}
