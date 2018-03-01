package app.example.anubhav.niitdemo_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FourthActivity extends ActionBarActivity implements View.OnClickListener {
    EditText t1,t2;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        t1=(EditText)findViewById(R.id.EditText2);
        t2=(EditText)findViewById(R.id.EditText3);
        b5=(Button)findViewById(R.id.Button5);
        b5.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourth, menu);
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
        String s1=t1.getText().toString();
        int i1=Integer.parseInt(s1);
        String s2=t2.getText().toString();
        int i2=Integer.parseInt(s2);
        int i3 = i1+i2;
        Toast.makeText(FourthActivity.this, ""+i3, Toast.LENGTH_LONG).show();
    }
}
