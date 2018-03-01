package app.example.anubhav.multipletabapp;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TabHost mTabHost = getTabHost();

        mTabHost.addTab(mTabHost.newTabSpec("first").setIndicator("First").setContent(new Intent(MainActivity.this,FirstActivity.class )));
        mTabHost.addTab(mTabHost.newTabSpec("second").setIndicator("Second").setContent(new Intent(MainActivity.this,SecondActivity.class )));
        mTabHost.setCurrentTab(0);
    }
}
