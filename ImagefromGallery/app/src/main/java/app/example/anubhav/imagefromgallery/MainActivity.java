package app.example.anubhav.imagefromgallery;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonloadImage;
    ImageView targetImage;
    TextView textTargetUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonloadImage = (Button) findViewById(R.id.button);
        targetImage = (ImageView) findViewById(R.id.imageView);
        textTargetUri = (TextView) findViewById(R.id.textView);
        buttonloadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(ab, 0);
            }
        });
    }
    protected void onActivityResult(int requestcode,int resultcode,Intent data)
          {
        super.onActivityResult(requestcode,resultcode,data);
        if(resultcode==RESULT_OK)
        {
            Uri targeturi=data.getData();
            textTargetUri.setText((targeturi).toString());
            Bitmap bitmap;
            try
            {
                bitmap=BitmapFactory.decodeStream(getContentResolver().openInputStream(targeturi));
                targetImage.setImageBitmap(bitmap);
            }
            catch(Exception e)
            {
                Toast.makeText(MainActivity.this,"exception is:=="+e,Toast.LENGTH_LONG).show();
                 textTargetUri.setText(""+e);
            }
        }
         }

    }

