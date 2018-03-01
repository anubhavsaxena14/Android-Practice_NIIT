package app.example.anubhav.multipletabapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SecondActivity extends Activity {

    String s2[]={"B1 List","B2 List","B3 List","B4 List","B5 List","B6 List","B7 List","B8 List","B9 List","B10 List","B11 List","B12 List","B13 List","B14 List","B15 List"};
    ArrayAdapter bb;
    ListView l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        l2=(ListView)findViewById(R.id.ListView2);
        ArrayAdapter bb=new ArrayAdapter(SecondActivity.this,android.R.layout.simple_list_item_1,s2);
        l2.setAdapter(bb);

    }
}
