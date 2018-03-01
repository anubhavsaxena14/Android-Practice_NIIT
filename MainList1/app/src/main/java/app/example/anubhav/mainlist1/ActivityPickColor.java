package app.example.anubhav.mainlist1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class ActivityPickColor extends AppCompatActivity {
    SeekBar s1,s2,s3;
    Button b1;
    int v1=0,v2=0,v3=0;
    static RelativeLayout layout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_pick_color);
        final RelativeLayout layout1 =(RelativeLayout)findViewById(R.id.PickLayout3);
        //layout1.setBackgroundColor(Color.rgb(26, 51, 91));
        s1=(SeekBar)findViewById(R.id.SeekBar1);
        s2=(SeekBar)findViewById(R.id.SeekBar2);
        s3=(SeekBar)findViewById(R.id.SeekBar3);
        b1=(Button)findViewById(R.id.button);
        /*s1.setMaxValue(255);
        n1.setMinValue(0);
        n2.setMaxValue(255);
        n2.setMinValue(0);
        n3.setMaxValue(255);
        n3.setMinValue(0);*/
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                v1=progress;
                layout1.setBackgroundColor(Color.rgb(v1, v2, v3));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                v2=progress;
                layout1.setBackgroundColor(Color.rgb(v1, v2, v3));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                v3=progress;
                layout1.setBackgroundColor(Color.rgb(v1, v2, v3));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setBackgroundColor(Color.rgb(v1, v2, v3));
                //Toast.makeText(PickNumber.this,"Number = "+v1,Toast.LENGTH_SHORT).show();

            }
        });*/
    }
}
