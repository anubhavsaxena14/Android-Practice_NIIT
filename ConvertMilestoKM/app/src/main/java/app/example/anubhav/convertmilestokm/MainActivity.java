package app.example.anubhav.convertmilestokm;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMileToKM = (Button) findViewById(R.id.buttonConvMileToKM);
        buttonConvMileToKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextMile = (EditText) findViewById(R.id.editTextMile);
                EditText editTextKM = (EditText) findViewById(R.id.editTextKM);
                double vMile = Double.valueOf(editTextMile.getText().toString());
                double vKM = vMile / 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                editTextKM.setText(formatval.format(vKM));
            }
        });

        Button buttonConvKMToMile = (Button) findViewById(R.id.buttonConvKMToMile);
        buttonConvKMToMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextMile = (EditText) findViewById(R.id.editTextMile);
                EditText editTextKM = (EditText) findViewById(R.id.editTextKM);
                double vKM = Double.valueOf(editTextKM.getText().toString());
                double vMile = vKM * 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                editTextMile.setText(formatval.format(vMile));
            }
        });
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
}
