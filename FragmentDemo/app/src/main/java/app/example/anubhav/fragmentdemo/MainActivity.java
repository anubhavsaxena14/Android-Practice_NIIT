package app.example.anubhav.fragmentdemo;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity  implements View.OnClickListener
 {

    Button b1, b2;
     FragmentManager fragmentManager;
     FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
         fragmentManager = getFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();
        if(v.getId()==R.id.button){
            Toast.makeText(MainActivity.this,"Button clicked",Toast.LENGTH_LONG).show();
            FirstFragment n = new FirstFragment();
            fragmentTransaction.replace(R.id.fragment,n);
        }
        else
        {
            Toast.makeText(MainActivity.this,"Button second clicked",Toast.LENGTH_LONG).show();
            SecondFragment n = new SecondFragment();
            fragmentTransaction.replace(R.id.fragment,n);
        }
        fragmentTransaction.commit();
    }
}



