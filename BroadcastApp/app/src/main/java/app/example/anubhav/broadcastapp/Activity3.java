package app.example.anubhav.broadcastapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends Activity implements View.OnClickListener{

    Button height,width,area;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        height=(Button)findViewById(R.id.Button1);
        width=(Button)findViewById(R.id.Button2);
        area=(Button)findViewById(R.id.Button3);
        height.setOnClickListener(this);
        width.setOnClickListener(this);
        area.setOnClickListener(this);
        intent = new Intent(Activity3.this,Activity4.class);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.Button1:
                intent.putExtra("number","heightinfo");
                startActivityForResult(intent,1);
                break;
            case R.id.Button2:
                intent.putExtra("number","widthinfo");
                startActivityForResult(intent,1);
                break;
            case R.id.Button3:
                int x = Integer.parseInt(height.getText().toString());
                int y = Integer.parseInt(width.getText().toString());
                area.setText("Area is:=="+Math.PI*x*y);
                break;
        }
    }
    public void onActivityResult(int requestcode, int resultcode, Intent data)
    {
        if(data.getExtras().containsKey("height"))
        {
            height.setText(data.getStringExtra("height"));
        }
        if(data.getExtras().containsKey("width"))
        {
            width.setText(data.getStringExtra("width"));
        }
        super.onActivityResult(requestcode,resultcode,data);
    }
}
