package app.example.anubhav.broadcastapp;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by anubhav on 18/10/16.
 */
public class Airplane extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        String a = intent.getAction();
        if(a.equals("android.intent.action.AIRPLANE_MODE"))
        {
            Toast.makeText(context,"Airplane mode changed",Toast.LENGTH_LONG).show();
        }
        if(a.equals("android.intent.action.WALLPAPER_CHANGED"))
        {
            Toast.makeText(context,"wallpaper changed",Toast.LENGTH_LONG).show();
        }
        if(a.equals("myevent"))
        {
            String email = intent.getStringExtra("value");
            if(email.indexOf("@")==-1)
            {
                Toast.makeText(context,"Not a valid email:=="+email,Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(context,"Valid email:=="+email,Toast.LENGTH_LONG).show();
            }
        }
    }
}
