package com.bnt.bntshine;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

public class MyApplication extends Application {
	private ArrayList<GlobalItem> allItems;
	private ProfileManager profileManager;

	@Override
	public void onCreate() {
		allItems = new ArrayList<GlobalItem>();
		profileManager = new ProfileManager();
		super.onCreate();
	}
	
	public ProfileManager getProfileManager() {
		return profileManager;
	}

	public ArrayList<GlobalItem> getAllItems() {
		return allItems;
	}
	
	public List<GlobalItem> getFromType(int type) {
		List<GlobalItem> selected = new ArrayList<GlobalItem>();
		
		for (GlobalItem globalItem : allItems) {
			if ((globalItem.getType() & type) != 0)
				selected.add(globalItem);
		}
		
		return selected;
	}
}
