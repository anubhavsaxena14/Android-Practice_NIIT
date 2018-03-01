package app.example.anubhav.contacttest;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Contacts;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    Cursor cursor;
    int contactPhone;
    TextView tt;
    ListView ls;
    LinkedList data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = (ListView) findViewById(R.id.ListView1);
        data = new LinkedList();
        cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME}, null, null, null, null);
        //tt = (TextView) findViewById(R.id.textView4);
        Toast.makeText(MainActivity.this, "count:==" + cursor.getCount(), Toast.LENGTH_LONG).show();
        if (cursor.moveToFirst()) {
            do {

                String a = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                String b = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                //Toast.makeText(ContactTestActivity.this, a + ":==" + b, Toast.LENGTH_LONG).show();
                data.add(a + " " + b);
                // cursor.moveToNext();
            } while (cursor.moveToNext());
        }
        //tt.append(contactPhone+"")
        ArrayAdapter aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, data);
        ls.setAdapter(aa);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String dd = (String) data.get(position);
                String num[] = dd.split(" ");
                String ph = num[0];
                Toast.makeText(MainActivity.this, "Phone is:==" + ph, Toast.LENGTH_LONG).show();
                Intent cc = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + ph));
                /*if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }*/
                startActivity(cc);
            }
        });
    }
}
