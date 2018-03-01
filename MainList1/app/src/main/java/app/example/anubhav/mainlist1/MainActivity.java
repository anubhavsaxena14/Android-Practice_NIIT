package app.example.anubhav.mainlist1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner sp1;
    ListView lv1;
    EditText et1;
    Button b1;
    String country[]={"India","China","USA","Canada"};
    String city1[]={"Jaipur","Mumbai","New Delhi","Bangalore","Hyderabad"};
    String city2[]={"Shanghai","Beijing","Xi'an","Guangzhou","Hong Kong"};
    String city3[]={"Chicago","San Francisco","Los Angeles","New York","Seattle"};
    String city4[]={"Toronto","Vancouver","Montreal","Ottawa","Quebec"};
    int i=0;
    static ArrayAdapter aa;
    LinkedList ll1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner)findViewById(R.id.spinner);
        lv1=(ListView)findViewById(R.id.listView);
        et1=(EditText)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button1);
        ll1=new LinkedList();
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,country);
        sp1.setAdapter(aa);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(MainActivity.this,"India Selected",Toast.LENGTH_LONG).show();
                    i=0;
                }
                if(position==1)
                {
                    Toast.makeText(MainActivity.this,"China Selected",Toast.LENGTH_LONG).show();
                    i=1;
                }
                if(position==2)
                {
                    Toast.makeText(MainActivity.this,"USA Selected",Toast.LENGTH_LONG).show();
                    i=2;
                }
                if(position==3)
                {
                    Toast.makeText(MainActivity.this,"Canada Selected",Toast.LENGTH_LONG).show();
                    i=3;
                }
                switch (i) {
                    case 0:
                        ll1.clear();
                        for (String p : city1) {
                            ll1.add(p);
                        }
                        MainActivity.aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, city1);
                        lv1.setAdapter(MainActivity.aa);
                        break;
                    case 1:
                        ll1.clear();
                        for (String p : city2) {
                            ll1.add(p);
                        }
                        MainActivity.aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, city2);
                        lv1.setAdapter(MainActivity.aa);
                        break;
                    case 2:
                        ll1.clear();
                        for (String p : city3) {
                            ll1.add(p);
                        }
                        MainActivity.aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, city3);
                        lv1.setAdapter(MainActivity.aa);
                        break;
                    case 3:
                        ll1.clear();
                        for (String p : city4) {
                            ll1.add(p);
                        }
                        MainActivity.aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, city4);
                        lv1.setAdapter(MainActivity.aa);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, "City Selected is " + ll1.get(position), Toast.LENGTH_LONG).show();
                }
            });
            b1.setOnClickListener(this);
        }
        public void add(View v)
        {
        String k=et1.getText().toString();
        if((k.length() >0))
            {
                ll1.add(k);
                aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,ll1);
                lv1.setAdapter(aa);
            }
            else
            {
            finish();
            }
         }

        @Override
        public void onClick(View v) {
            add(v);
    }
}
