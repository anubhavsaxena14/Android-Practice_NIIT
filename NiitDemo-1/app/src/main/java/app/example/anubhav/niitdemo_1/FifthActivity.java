package app.example.anubhav.niitdemo_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class FifthActivity extends ActionBarActivity  implements OnItemSelectedListener{
    RatingBar rb;
    String city[]={"Kota","Nagpur","New Delhi","Bangalore","Jaipur"};
    Spinner ss;
    EditText et1;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_fifth);
       rb=(RatingBar)findViewById(R.id.ratingBar);
       et1=(EditText)findViewById(R.id.EditText4);
       ss=(Spinner)findViewById(R.id.spinner);
       ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,city);
       ss.setAdapter(aa);
       ss.setAdapter(aa);
       ss.setOnItemSelectedListener(this);
       rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
           @Override
           public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               Toast.makeText(FifthActivity.this, "Rating is:==" + rating, Toast.LENGTH_LONG).show();
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fifth, menu);
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
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
     String val=city[position] ;
        switch (val)
        {
            case "Kota":
                et1.setText("506", TextView.BufferType.NORMAL);
                Toast.makeText(FifthActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
            case "Nagpur":
                et1.setText("1044", TextView.BufferType.NORMAL);
                Toast.makeText(FifthActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
            case "New Delhi":
                et1.setText("0", TextView.BufferType.NORMAL);
                Toast.makeText(FifthActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
            case "Bangalore":
                et1.setText("2140", TextView.BufferType.NORMAL);
                Toast.makeText(FifthActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
            case "Jaipur":
                et1.setText("268", TextView.BufferType.NORMAL);
                Toast.makeText(FifthActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
