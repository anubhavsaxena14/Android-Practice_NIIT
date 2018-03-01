package app.example.anubhav.mainlist1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
public class NextOne extends AppCompatActivity
{
    TextView tm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_one2);
        tm=(TextView)findViewById(R.id.textView7);
        Intent av=getIntent();
        String a=av.getStringExtra("name");
        int b=av.getIntExtra("pass",10);

        tm.setText("name is:=="+a+"\tPass is:=="+b);
    }

}
