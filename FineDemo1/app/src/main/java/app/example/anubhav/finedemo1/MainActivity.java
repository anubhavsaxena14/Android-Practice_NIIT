package app.example.anubhav.finedemo1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    WebView we;
    StringBuffer sb;
    EditText et1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button);
        we=(WebView)findViewById(R.id.webView);
        sb=new StringBuffer();
        sb.append("<html><body bgcolor=cyan><form><table border=5>");
        sb.append("<tr><th>Name</th><td><input type=text></td></tr>");
        sb.append("<tr><th>Password</th><td><input type=password></td></tr>");
        sb.append("<tr><td><input type=submit value=next>></td></tr>");
        sb.append("</table></form></body></html>");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yahoo=new Intent(Intent.ACTION_VIEW, Uri.parse("https://et1"));
                startActivity(yahoo);

            }
        });
       // we.loadData(""+sb,"text/html","UTF-8");
        //we.loadUrl("https://wwww.google.com");
       // we.loadUrl("file:///android_asset/an.txt");
        //we.loadUrl("file:///android_asset/img.jpg");
        //Intent yahoo=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        //startActivity(yahoo);

    }
}
