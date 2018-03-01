package app.example.anubhav.broadcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.EditText1);
        b1 = (Button)findViewById(R.id.Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"app.example.anubhav.broadcastapp.Airplane mode changed",Toast.LENGTH_LONG).show();
                Intent yahoo = new Intent();
                yahoo.setAction("myevent");
                yahoo.putExtra("value",et1.getText().toString());
                sendBroadcast(yahoo);
            }
        });

    }
}
