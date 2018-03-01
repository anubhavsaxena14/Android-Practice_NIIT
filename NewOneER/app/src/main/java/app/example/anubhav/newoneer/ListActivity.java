package app.example.anubhav.newoneer;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;

public class ListActivity extends Activity
{
     ListView  ls;
    String city[]={"jaipur","jodhpur","surat","mummbai","kota","Noida","Gurgoan"};
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
            ls=(ListView)findViewById(R.id.listView);
            ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,city);
            ls.setAdapter(aa);
    }
}
