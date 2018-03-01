package app.example.anubhav.mainlist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity
{
    EditText name,pass;
    Button bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        name=(EditText)findViewById(R.id.editText2);
        pass=(EditText)findViewById(R.id.editText3);
        bu=(Button)findViewById(R.id.button2);
        bu.setOnLongClickListener(new View.OnLongClickListener()
        {

            @Override
            public boolean onLongClick(View v)
            {
                String a=name.getText().toString();
                String b=pass.getText().toString();


                Intent jack=new Intent(Activity3.this,NextOne.class);
                jack.putExtra("name",a);
                jack.putExtra("pass",Integer.parseInt(b));
                Toast.makeText(Activity3.this,a+"\t"+b,Toast.LENGTH_LONG).show();
                startActivity(jack);
                return false;
            }
        });


    }
}
