/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package org.selfkleptomaniac.mod.tirebootandroidapp;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

import android.app.Activity;
import android.content.Intent;

@Kroll.module(name="Tirebootandroidapp", id="org.selfkleptomaniac.mod.tirebootandroidapp")
public class TirebootandroidappModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "TirebootandroidappModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public TirebootandroidappModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	@Kroll.method
	public void reboot(){
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_MAIN);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.setClass(activity, activity.getClass());
		activity.startActivity(intent);
		activity.finish();
	}
	
	@Kroll.method
	public String example()
	{
		Log.d(TAG, "example called");
		return "hello world";
	}
	
	// Properties
	@Kroll.getProperty
	public String getExampleProp()
	{
		Log.d(TAG, "get example property");
		return "hello world";
	}
	
	
	@Kroll.setProperty
	public void setExampleProp(String value) {
		Log.d(TAG, "set example property: " + value);
	}

}

