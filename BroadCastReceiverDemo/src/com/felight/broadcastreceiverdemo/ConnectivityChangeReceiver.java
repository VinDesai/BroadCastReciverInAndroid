package com.felight.broadcastreceiverdemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Contacts.People;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class ConnectivityChangeReceiver extends BroadcastReceiver {

	private static final int SIMPLE_NOTFICATION_ID = 0;
	private NotificationManager nm;
	
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Connetion changed", Toast.LENGTH_LONG).show();
		/*Bundle bundle = intent.getExtras();        
        SmsMessage[] msgs = null;
        String str = "";            
        if (bundle != null)
        {
            //---retrieve the SMS message received---
            Object[] pdus = (Object[]) bundle.get("pdus");
            msgs = new SmsMessage[pdus.length];            
            for (int i=0; i<msgs.length; i++){
                msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);                
                str += "SMS from " + msgs[i].getOriginatingAddress();                     
                str += " :";
                str += msgs[i].getMessageBody().toString();
                str += "\n";        
            }
            //---display the new SMS message---
            Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
        }     
		*/
	}

	/*
	 * @Override public void onReceive(Context context, Intent intent) { //do
	 * something on receiving and broadcast. //Like starting a service }
	 */
	
	

	/*public void onReceive(Context context, Intent intent) {

		Toast.makeText(context, "Connectivity changed", Toast.LENGTH_LONG).show();
		// Vibrate the mobile phone
		Vibrator vibrator = (Vibrator) context
				.getSystemService(Context.VIBRATOR_SERVICE);
		vibrator.vibrate(2000);
		vibrator.vibrate(5000);
		vibrator.vibrate(10000);
		vibrator.vibrate(20000);
		
		

	}*/

	
	
	
	
	/*  public void onReceive(Context context, Intent intent) {
	  
	  nm = (NotificationManager) context
	  .getSystemService(Context.NOTIFICATION_SERVICE); Notification
	  notifyDetails = new Notification(R.drawable.ic_launcher, "Connection changed",
	  System.currentTimeMillis()); 
	  PendingIntent myIntent =
	  PendingIntent.getActivity(context, 0, new Intent(context,
	  MainActivity.class), 0); notifyDetails.setLatestEventInfo(context,
	  "Time has been Reset", "Click on me to view Contacts", myIntent);
	  notifyDetails.flags |= Notification.FLAG_AUTO_CANCEL; notifyDetails.flags
	  |= Notification.DEFAULT_SOUND; nm.notify(SIMPLE_NOTFICATION_ID,
	  notifyDetails); Log.i("hisham_debug", "Sucessfully Changed Time"); }*/
	 

}
