package com.felight.broadcastreceiverdemo;

import com.felight.broadcastreceiverdemo.R;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.Menu;

public class MainActivity extends Activity {
	
	BroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
  /*  @Override
    protected void onPause() {
       unregisterReceiver(receiver);
       super.onPause();
    }

    @Override
    protected void onResume() {
       this.receiver = new ConnectivityChangeReceiver();
       //receiver is an object of type BroadcastReceiver
       registerReceiver(
             this.receiver, 
             new IntentFilter(
                   ConnectivityManager.CONNECTIVITY_ACTION));
       super.onResume();
    }*/


	
    
    
    
}
