package app.example.anubhav.multipletabapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class FirstActivity extends Activity {

    String s1[]={"A1 List","A2 List","A3 List","A4 List","A5 List","A6 List","A7 List","A8 List","A9 List","A10 List"};
    ArrayAdapter aa;
    ListView l1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        l1=(ListView)findViewById(R.id.ListView1);
        ArrayAdapter aa=new ArrayAdapter(FirstActivity.this,android.R.layout.simple_list_item_1,s1);
        l1.setAdapter(aa);
        b1=(Button)findViewById(R.id.Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"In First Tab",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
