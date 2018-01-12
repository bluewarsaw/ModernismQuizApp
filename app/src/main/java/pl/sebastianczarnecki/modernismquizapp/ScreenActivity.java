package pl.sebastianczarnecki.modernismquizapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
    }



    public void eatCookie(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.img1);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("Warsaw localisted");
    }


    public void eatCookie2(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.img2);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("no ladny");
    }


    public void eatCookie3(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.img3);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("no ladny");
    }






}
