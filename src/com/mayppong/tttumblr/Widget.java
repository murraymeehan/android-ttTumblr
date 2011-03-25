package com.mayppong.tttumblr;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.appwidget.*;
import android.widget.RemoteViews;

// import the app's activity that the widget will call
import com.tacticalnuclearstrike.tttumblr.MainActivity;
import com.tacticalnuclearstrike.tttumblr.R;
import com.tacticalnuclearstrike.tttumblr.activites.Dashboard;
import com.tacticalnuclearstrike.tttumblr.activites.PostTextActivity;
import com.tacticalnuclearstrike.tttumblr.activites.UploadImageActivity;
import com.tacticalnuclearstrike.tttumblr.activites.UploadVideoActivity;


public class Widget extends AppWidgetProvider {
	
	@Override 		// to override the default onUpdate method
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		
		// Get the layout for the App Widget
		RemoteViews WidgetView = new RemoteViews(context.getPackageName(), R.layout.widgetview);
		
		// Tumblr logo opens the app
		Intent widget_TumblrLogoPressed = new Intent(context, MainActivity.class); 
		PendingIntent widget_TumblrLogo_pendingPress = PendingIntent.getActivity(context, 0, widget_TumblrLogoPressed, 0);
		WidgetView.setOnClickPendingIntent(R.id.widget_TumblrLogo, widget_TumblrLogo_pendingPress); 
		
		// Dashboard post button launch 
		Intent widget_DashboardBtnPressed = new Intent(context, Dashboard.class);
		PendingIntent widget_DashboardBtn_pendingPress = PendingIntent.getActivity(context, 0, widget_DashboardBtnPressed, 0);
		WidgetView.setOnClickPendingIntent(R.id.widget_DashboardBtn, widget_DashboardBtn_pendingPress);
		
		// Text post button launch
		Intent widget_TextBtnPressed = new Intent(context, PostTextActivity.class);
		PendingIntent widget_TextBtn_pendingPress = PendingIntent.getActivity(context, 0, widget_TextBtnPressed, 0);
		WidgetView.setOnClickPendingIntent(R.id.widget_TextBtn, widget_TextBtn_pendingPress);
		
		// Image post button launch 
		Intent widget_ImgBtnPressed = new Intent(context, UploadImageActivity.class);
		PendingIntent widget_ImgBtn_pendingPress = PendingIntent.getActivity(context, 0, widget_ImgBtnPressed, 0);
		WidgetView.setOnClickPendingIntent(R.id.widget_ImgBtn, widget_ImgBtn_pendingPress);
		
		// Video post button launch 
		Intent widget_VideoBtnPressed = new Intent(context, UploadVideoActivity.class);
		PendingIntent widget_VideoBtn_pendingPress = PendingIntent.getActivity(context, 0, widget_VideoBtnPressed, 0);
		WidgetView.setOnClickPendingIntent(R.id.widget_VideoBtn, widget_VideoBtn_pendingPress);
		
		// Tell the AppWidgetManaget to update the widget
		appWidgetManager.updateAppWidget(appWidgetIds, WidgetView);
    } 	// close onUpdate
		
} 	// close widget.class
