package com.example.nav;

public class Level {
	
    public String title;
    public int icon;
    public String title2;
    
    public Level()
    {
        super();
    }
   
    public Level(String title,int icon) {
        super();
        this.icon = icon;
        this.title = title;
    }
    public Level(String title,String title2,int icon)
    {
    	super();
    	this.icon=icon;
    	this.title=title;
    	this.title2=title2;
    }

}