package app.example.anubhav.sqlproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.LinkedList;

public class DeleteActivity extends AppCompatActivity
{
    SQLiteDatabase dm;
    Spinner sp;
    Button delete;
    LinkedList data;
    String ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        sp=(Spinner)findViewById(R.id.spinner);
        delete=(Button)findViewById(R.id.button);
        data=new LinkedList();
        data.add("id");
        LoginBean log = new LoginBean(this);
        dm = log.getReadableDatabase();
        Cursor cc=dm.query(LoginBean.TABLE,new String[]{ LoginBean.COL_ID},null,null,null,null,null);
        if(cc.getCount()>0)
        {
            if(cc.moveToFirst())
            {
                while (!cc.isAfterLast())
                {
                    String h=cc.getString(0);
                    data.add(h);
                    cc.moveToNext();
                }
            }
        }
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        sp.setAdapter(aa);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
              ch=(String)data.get(position);
                Toast.makeText(DeleteActivity.this,"item selected:=="+ch,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String abc[]={ch};
                dm.delete(LoginBean.TABLE,"id=?",abc);
                Toast.makeText(DeleteActivity.this,"data deleted =="+ch,Toast.LENGTH_LONG).show();
                Intent gmail=new Intent(DeleteActivity.this,Login.class);
                startActivity(gmail);

            }
        });
    }
}
