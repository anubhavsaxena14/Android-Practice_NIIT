package app.example.anubhav.niitdemo;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
public class SecondOne extends Activity implements View.OnClickListener
{
    Button one,two;
    EditText data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_one);
        data=(EditText)findViewById(R.id.editText);
        one=(Button)findViewById(R.id.button3);
        two=(Button)findViewById(R.id.button4);
        one.setOnClickListener(this);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("");
                one.setText("Upper");
                two.setText("Reverse");
            }
        });
    }
public void abc(View v)

{
    //String y=data.getText().toString();
   // data.setText(y.toUpperCase());
    Intent yy=new Intent(SecondOne.this,MainActivity.class);
    startActivity(yy);

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_one, menu);
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
        String d=data.getText().toString();
        StringBuffer sb=new StringBuffer(d);
        sb.reverse();
        sb.append("my name is");
        data.setText(""+sb);
    }
}
