package app.example.anubhav.newoneer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity implements View.OnClickListener
{
    RadioGroup rg;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.rg);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        Toast.makeText(MainActivity.this,"Button",Toast.LENGTH_LONG).show();
        int id=rg.getCheckedRadioButtonId();
        Toast.makeText(MainActivity.this,"Button:=="+id,Toast.LENGTH_LONG).show();
        RadioButton r=(RadioButton)findViewById(id);
        switch(id)
        {
            case R.id.radioButton:
                Toast.makeText(MainActivity.this,"Radio Button one",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this,"Radio Button second",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
