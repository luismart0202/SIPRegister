package io.github.freuvim.sipregister;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;
import android.app.Service;

public class BackgroundService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Serviço iniciado!", Toast.LENGTH_LONG).show();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Serviço finalizado!", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
