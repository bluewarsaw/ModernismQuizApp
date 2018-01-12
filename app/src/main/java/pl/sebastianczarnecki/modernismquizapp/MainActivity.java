package pl.sebastianczarnecki.modernismquizapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        TextView location = (TextView) findViewById(R.id.Location);

        // Set a click listener on that View
        location.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, LocationActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


// Find the View that shows the numbers category
        TextView dates = (TextView) findViewById(R.id.Dates);

        // Set a click listener on that View
        dates.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, DatesActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


        // Find the View that shows the numbers category
        TextView score = (TextView) findViewById(R.id.Score);

        // Set a click listener on that View
        score.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ScreenActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


//stackoverlow

        ImageView podpis = (ImageView) findViewById(R.id.podpis);
        podpis.setOnClickListener(new View.OnClickListener() {
            @Override
         public void onClick (View view) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sebastianczarnecki.pl/"));
        startActivity(i);
    }
});

    }}
