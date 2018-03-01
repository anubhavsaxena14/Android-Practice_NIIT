package app.example.anubhav.newoneer;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


public class SecondActivity extends ActionBarActivity
{
    String city[]={"jaipur","jodhpur","jaislmer","kota","kanpur","delhi","dehradun","bikaner","bundi"};
    AutoCompleteTextView av;
    MultiAutoCompleteTextView mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        av=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        mv=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,city);
        av.setAdapter(aa);
       // av.setThreshold(1);
        av.setTextColor(Color.BLUE);
        mv.setAdapter(aa);
        mv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
}
