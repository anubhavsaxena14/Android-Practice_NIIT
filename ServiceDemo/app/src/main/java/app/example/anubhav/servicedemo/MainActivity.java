package app.example.anubhav.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
Intent ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ab=new Intent(MainActivity.this,ServiceOne.class);
    }
    public void st(View v)
    {
        startService(ab);
    }
    public void sp(View v)
    {
        stopService(ab);

    }
    public void pu(View v)
    {
        ServiceOne.player.pause();
    }
}
