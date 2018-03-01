package app.example.anubhav.mainlist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String city[]={"Kota","Nagpur","New Delhi","Bangalore","Jaipur"};
    String travel[]={"Bus","Train","Flight"};
    int d1,p1;
    Spinner sp1,sp2,sp3;
    ProgressBar pb1,pb2;
    EditText et1;
    ArrayAdapter aa,bb;
    Button b1;
    static int i=0, j=0, k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        et1=(EditText)findViewById(R.id.EditText1);
        b1=(Button)findViewById(R.id.button1);
        sp3=(Spinner)findViewById(R.id.spinner3);
        sp1=(Spinner)findViewById(R.id.spinner1);
        pb1=(ProgressBar) findViewById(R.id.ProgressBar1);
        pb2=(ProgressBar) findViewById(R.id.ProgressBar2);
        pb1.setMax(2140);
        pb2.setMax(8560);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,city);
        sp1.setAdapter(aa);
        sp2=(Spinner)findViewById(R.id.spinner2);
        sp2.setAdapter(aa);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String val=city[position] ;
                switch (val)
                {
                    case "Kota":
                        i=0;
                        break;
                    case "Nagpur":
                        i=1;
                        break;
                    case "New Delhi":
                        i=2;
                        break;
                    case "Bangalore":
                        i=3;
                        break;
                    case "Jaipur":
                        i=4;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String val=city[position] ;
                switch (val)
                {
                    case "Kota":
                        j=0;
                        break;
                    case "Nagpur":
                        j=1;
                        break;
                    case "New Delhi":
                        j=2;
                        break;
                    case "Bangalore":
                        j=3;
                        break;
                    case "Jaipur":
                        j=4;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,travel);
        sp3.setAdapter(bb);
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String val=travel[position];
                switch (val)
                {
                    case "Bus":
                        k=0;
                        break;
                    case "Train":
                        k=1;
                        break;
                    case "Flight":
                        k=2;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i)
                {
                    case 0:
                        if(j==0)
                        {
                            d1=0;
                            calculate(d1);
                        }
                        if(j==1)
                        {
                            d1=905;
                            calculate(d1);
                        }
                        if(j==2)
                        {
                            d1=506;
                            calculate(d1);
                        }
                        if(j==3)
                        {
                            d1=2002;
                            calculate(d1);
                        }
                        if(j==4)
                        {
                            d1=252;
                            calculate(d1);
                        }
                        break;
                    case 1:
                        if(j==0)
                        {
                            d1=905;
                            calculate(d1);
                        }
                        if(j==1)
                        {
                            d1=0;
                            calculate(d1);
                        }
                        if(j==2)
                        {
                            d1=1044;
                            calculate(d1);
                        }
                        if(j==3)
                        {
                            d1=1090;
                            calculate(d1);
                        }
                        if(j==4)
                        {
                            d1=1025;
                            calculate(d1);
                        }
                        break;
                    case 2:
                        if(j==0)
                        {
                            d1=506;
                            calculate(d1);
                        }
                        if(j==1)
                        {
                            d1=1044;
                            calculate(d1);
                        }
                        if(j==2)
                        {
                            d1=0;
                            calculate(d1);
                        }
                        if(j==3)
                        {
                            d1=2140;
                            calculate(d1);
                        }
                        if(j==4)
                        {
                            d1=268;
                            calculate(d1);
                        }
                        break;
                    case 3:
                        if(j==0)
                        {
                            d1=2002;
                            calculate(d1);
                        }
                        if(j==1)
                        {
                            d1=1090;
                            calculate(d1);
                        }
                        if(j==2)
                        {
                            d1=2140;
                            calculate(d1);
                        }
                        if(j==3)
                        {
                            d1=0;
                            calculate(d1);
                        }
                        if(j==4)
                        {
                            d1=2005;
                            calculate(d1);
                        }
                        break;
                    case 4:
                        if(j==0)
                        {
                            d1=252;
                            calculate(d1);
                        }
                        if(j==1)
                        {
                            d1=1026;
                            calculate(d1);
                        }
                        if(j==2)
                        {
                            d1=268;
                            calculate(d1);
                            }
                        if(j==3)
                        {
                            d1=2005;
                            calculate(d1);
                            }
                        if(j==4)
                        {
                            d1=0;
                        }
                        break;
                }
            }
        });
    }
    public void calculate(int d1){
        if(k==0)
        {
            p1=2*d1;
            Toast.makeText(SecondActivity.this,"Distance = "+d1+" Bill = "+p1, Toast.LENGTH_SHORT).show();
        }
        if(k==1)
        {
            p1=3*d1;
            Toast.makeText(SecondActivity.this,"Distance = "+d1+" Bill = "+p1, Toast.LENGTH_SHORT).show();
        }
        if(k==2)
        {
            p1=4*d1;
            Toast.makeText(SecondActivity.this,"Distance = "+d1+" Bill = "+p1, Toast.LENGTH_SHORT).show();
        }
        pb1.setProgress(d1);
        pb2.setProgress(p1);
    }
}
