package io.github.freuvim.sipregister;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class BootCompletedIntentReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            Intent i = new Intent(context, BackgroundService.class);
            context.startService(i);
    }
}
