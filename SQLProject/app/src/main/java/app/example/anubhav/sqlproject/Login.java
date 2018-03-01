package app.example.anubhav.sqlproject;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import android.content.ContentValues;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    SQLiteDatabase dm;
    TextView td;
    StringBuffer sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        td = (TextView)findViewById(R.id.TextView1);
        LoginBean log = new LoginBean(this);
        dm = log.getReadableDatabase();
        ContentValues value = new ContentValues();
        value.put(LoginBean.COL_NAME,"Gurbinder");
        value.put(LoginBean.COL_PASS,"pass@12367");
        dm.insert(LoginBean.TABLE,null,value);
        Toast.makeText(Login.this,"Data Inserted",Toast.LENGTH_LONG).show();
        sb = new StringBuffer();
        Cursor cc=dm.query(LoginBean.TABLE,new String[]{ LoginBean.COL_ID,LoginBean.COL_NAME,LoginBean.COL_PASS},null,null,null,null,null);
        if(cc.getCount()>0)
        {
            if(cc.moveToFirst())
            {
                while (!cc.isAfterLast())
                {
                    sb.append(cc.getString(0)+"\t"+cc.getString(1)+"\t"+cc.getString(2)+"\n");
                    cc.moveToNext();
                }
            }
        }
        td.setText(""+sb);

    }
}
