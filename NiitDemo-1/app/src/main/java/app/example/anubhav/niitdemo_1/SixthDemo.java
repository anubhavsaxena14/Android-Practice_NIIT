package app.example.anubhav.niitdemo_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;


public class SixthDemo extends ActionBarActivity implements View.OnClickListener
{
    CheckBox coffe,tea,cold,burger;
    Button b;
    StringBuffer ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_demo);
        coffe=(CheckBox)findViewById(R.id.checkbox);
        /*tea=(CheckBox)findViewById(R.id.checkBox2);
        cold=(CheckBox)findViewById(R.id.checkBox3);
        burger=(CheckBox)findViewById(R.id.checkBox4);*/
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sixth_demo, menu);
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
    public void onClick(View v)
    {

        ss=new  StringBuffer();
        ss.append("\n bill is:==");
        int total=0;
       if(coffe.isChecked())
        {
            //ss.append("\n coffe is:==50");
          //  total=total+50;
        }
       /*
        if(tea.isChecked())
        {
            ss.append("\n Tea is:==25");
            total=total+25;
        }
        if(cold.isChecked())
        {
            ss.append("\n Cold iss:==15");
            total=total+15;
        }
        if(burger.isChecked())
        {
            ss.append("\n burger is:==45");
            total=total+45;
        }*/
        Toast.makeText(SixthDemo.this,ss+"\nToatl is:=="+total,Toast.LENGTH_LONG).show();
    }
}
