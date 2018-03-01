package app.example.anubhav.broadcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    EditText ed;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        next = (Button)findViewById(R.id.Button4);
        ed = (EditText)findViewById(R.id.EditText2);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String val = ed.getText().toString();
        Intent gmail = getIntent();
        String data = gmail.getStringExtra("number");
        if(data.equals("heightinfo"))
        {
            gmail.putExtra("height",val);
            setResult(1,gmail);
            finish();
        }
        if(data.equals("widthinfo"))
        {
            gmail.putExtra("width",val);
            setResult(1,gmail);
            finish();
        }
    }

}
