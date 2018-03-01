package app.example.anubhav.zoomapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomButton;
import android.widget.ZoomButtonsController;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    ImageView im;
    ZoomControls zb;
    float x1,y1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=(ImageView)findViewById(R.id.ImageView1);
        zb=(ZoomControls) findViewById(R.id.ZoomControls1);
        //x1 = im.getScaleX();
        //y1 = im.getScaleY();
        zb.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x =(float)im.getScaleX();
                float y =(float)im.getScaleY();
                im.setScaleX(x+1);
                im.setScaleY(y+1);
                Toast.makeText(MainActivity.this,"X is "+(x+1)+" Y is "+(y+1),Toast.LENGTH_SHORT).show();
            }
        });
        zb.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x =(float)im.getScaleX();
                float y =(float)im.getScaleY();
                if((x>x1) && (y>y1))
                {
                    im.setScaleX(x-1);
                    im.setScaleY(y-1);
                    x =(float)im.getScaleX();
                    y =(float)im.getScaleY();
                }
                Toast.makeText(MainActivity.this,"X is "+(x)+" Y is "+(y),Toast.LENGTH_SHORT).show();
                if((x==x1)&&(y==y1))
                {
                    Toast.makeText(MainActivity.this,"Default Resolution reached",Toast.LENGTH_SHORT).show();
                }
            }
        });

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setBackgroundResource(R.drawable.abc);
                x1 = im.getScaleX();
                y1 = im.getScaleY();
                Toast.makeText(MainActivity.this,"X is "+x1+" Y is "+y1,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
