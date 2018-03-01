package app.example.anubhav.contactinfo;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import static app.example.anubhav.contactinfo.R.layout.row;


public class InfoActivity extends Activity {

    Button mButton;
    EditText mEdit;
    TextView mText;

    Uri uri;
    ContentResolver cr;
    Cursor c;
    ListView lvMsg;

    SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


                // Create Inbox box URI
                Uri inboxURI = Uri.parse("content://sms/inbox");

                // List required columns
                String[] reqCols = new String[] { "_id", "address", "body" };

                // Get Content Resolver object, which will deal with Content Provider
                Cursor cr = getContentResolver().query(inboxURI,null,null,null,null);

                // Fetch Inbox SMS Message from Built-in Content Provider
               // c = cr.query(inboxURI, null, null, null, null);

                String sms = "";
                int jumlah=0;
                while (cr.moveToNext()) {
                    sms += "From :" + cr.getString(2) + " : " + cr.getString(11)+"\n";
                    jumlah=jumlah+1;
                }

        Toast.makeText(this,"sms count =" + Integer.toString(jumlah), Toast.LENGTH_SHORT).show();
            }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
