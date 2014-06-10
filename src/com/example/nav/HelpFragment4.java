package com.example.nav;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelpFragment4 extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.helpfrag, null);
        ImageView iv1=(ImageView)root.findViewById(R.id.helpimg1);
        TextView title=(TextView)root.findViewById(R.id.tv2);
        TextView desc=(TextView)root.findViewById(R.id.tv3);
        Typeface robotoLight = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Light.ttf");

        View v=new ImageView(getActivity());
        iv1.setImageDrawable(v.getResources().getDrawable(R.drawable.hospital));	
		title.setText("Hospitals");
		LinearLayout lv1=(LinearLayout)root.findViewById(R.id.footer);
        View v2=new LinearLayout(getActivity());
        lv1.setVisibility(v2.GONE);
        title.setTextColor(getResources().getColor(R.color.playred));
		desc.setText("Ready help in times of need");
		desc.setTypeface(robotoLight);
		
		     
        return root;
    

}
}
