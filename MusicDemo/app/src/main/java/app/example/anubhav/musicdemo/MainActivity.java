package app.example.anubhav.musicdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Switch loop;
    MediaPlayer m1;
    Button b1,b2;
    Spinner ss;
    String song[]={"Harry Potter","Pirates Of Caribbean","Crystallize"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1=MediaPlayer.create(this,R.raw.hp);
        ss=(Spinner)findViewById(R.id.Spinner);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,song);
        ss.setAdapter(aa);
        ss.setAdapter(aa);
        ss.setOnItemSelectedListener(this);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.pause();
            }
        });
        loop=(Switch)findViewById(R.id.switch1);
        loop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    Toast.makeText(MainActivity.this, "Loop on", Toast.LENGTH_LONG).show();
                    m1.setLooping(isChecked);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Loop off",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String val=song[position];
        m1.reset();
        switch(val)
        {
            case "Harry Potter":
                m1=MediaPlayer.create(this,R.raw.hp);
                m1.start();
                Toast.makeText(MainActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
            case "Pirates Of Caribbean":
                m1=MediaPlayer.create(this,R.raw.poc);
                m1.start();
                Toast.makeText(MainActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
            case "Crystallize":
                m1=MediaPlayer.create(this,R.raw.cryst);
                m1.start();
                Toast.makeText(MainActivity.this,""+val+" Selected",Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
