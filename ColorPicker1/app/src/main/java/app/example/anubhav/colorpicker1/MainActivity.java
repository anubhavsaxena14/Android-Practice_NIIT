package app.example.anubhav.colorpicker1;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    NumberPicker n1,n2,n3;
    Button b1;
    int v1,v2,v3;
    static RelativeLayout layout1;



    /*TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void pickColor(int a, int b, int c);
    }*/

    /*@Override
      public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        try{
            activityCommander = (TopSectionListener) fragment;
        }
        catch (ClassCastException e){
            throw new ClassCastException(fragment.toString());
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout layout1 =(RelativeLayout)findViewById(R.id.PickLayout);
        n1=(NumberPicker)findViewById(R.id.NumberPicker2);
        n2=(NumberPicker)findViewById(R.id.NumberPicker3);
        n3=(NumberPicker)findViewById(R.id.NumberPicker);
        b1=(Button)findViewById(R.id.Button1);
        n1.setMaxValue(255);
        n1.setMinValue(0);
        n2.setMaxValue(255);
        n2.setMinValue(0);
        n3.setMaxValue(255);
        n3.setMinValue(0);
        n1.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public void onScrollStateChange(NumberPicker view, int scrollState) {
                v1=n1.getValue();
                //Toast.makeText(PickNumber.this,"Number Increased",Toast.LENGTH_SHORT).show();
            }
        });
        n2.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public void onScrollStateChange(NumberPicker view, int scrollState) {
                v2=n2.getValue();
            }
        });
        n3.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public void onScrollStateChange(NumberPicker view, int scrollState) {
                v3=n3.getValue();
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //activityCommander.pickColor(v1,v2,v3);
                //layout1.setBackgroundColor(Color.rgb(v1, v2, v3));
                //Toast.makeText(PickNumber.this,"Number = "+v1,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
