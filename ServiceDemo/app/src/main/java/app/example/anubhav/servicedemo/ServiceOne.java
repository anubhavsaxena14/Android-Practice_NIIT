package app.example.anubhav.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by anubhav on 17/10/16.
 */
public class ServiceOne extends Service
{

    static MediaPlayer player;
    @Nullable
    @Override

    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate()
    {
        player=MediaPlayer.create(getApplicationContext(),R.raw.hp);
        Toast.makeText(getApplicationContext(),"service created",Toast.LENGTH_LONG).show();
    }
    public void onDestroy()
    {
        player.stop();
        Toast.makeText(getApplicationContext(),"service destroyed",Toast.LENGTH_LONG).show();
    }
    public  void onStart(Intent intent,int startid)
    {
        player.start();
        Toast.makeText(getApplicationContext(),"service started",Toast.LENGTH_LONG).show();

    }
}
