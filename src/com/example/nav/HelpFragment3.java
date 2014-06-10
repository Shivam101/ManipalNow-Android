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

public class HelpFragment3 extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.helpfrag, null);
        ImageView iv1=(ImageView)root.findViewById(R.id.helpimg1);
        TextView title=(TextView)root.findViewById(R.id.tv2);
        TextView desc=(TextView)root.findViewById(R.id.tv3);
        View v=new ImageView(getActivity());
        iv1.setImageDrawable(v.getResources().getDrawable(R.drawable.bars));	
		title.setText("Bars");
		Typeface robotoLight = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Light.ttf");
		LinearLayout lv1=(LinearLayout)root.findViewById(R.id.footer);
        View v2=new LinearLayout(getActivity());
        lv1.setVisibility(v2.GONE);
        title.setTextColor(getResources().getColor(R.color.playorange));
		desc.setText("Discover new places to get a drink");
		desc.setTypeface(robotoLight);
		
        return root;
    

}
}
