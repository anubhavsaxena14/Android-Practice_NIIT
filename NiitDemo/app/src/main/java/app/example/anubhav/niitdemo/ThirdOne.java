package app.example.anubhav.niitdemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class ThirdOne extends ActionBarActivity implements CompoundButton.OnCheckedChangeListener
{
Switch ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_one);
        ss=(Switch)findViewById(R.id.switch1);
        ss.setOnCheckedChangeListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third_one, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
     if(isChecked==true)
     {
         Toast.makeText(ThirdOne.this,"switch on",Toast.LENGTH_LONG).show();
         Intent yy=new Intent(Intent.ACTION_DIAL);
         startActivity(yy);
     }
        else
     {
      Toast.makeText(ThirdOne.this,"switch off",Toast.LENGTH_LONG).show();
         Intent yy=new Intent(ThirdOne.this,SecondOne.class);
         startActivity(yy);
     }
    }
}
