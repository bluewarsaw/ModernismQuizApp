package pl.sebastianczarnecki.modernismquizapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class LocationActivity extends Activity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }


    // method sumUp counts final score

    public void sumUpTwo(View view) {

        // this part identifies all RadioButtons, Checkboxes that have correct answers. It also verifies if those radio/checkboxes are checked

        RadioButton isWarsaw = (RadioButton) findViewById(R.id.warsaw);
        boolean warsaw = isWarsaw.isChecked();

        RadioButton isWarsawThree = (RadioButton) findViewById(R.id.warsawThree);
        boolean warsawThree = isWarsawThree.isChecked();

        RadioButton isWarsawTwo = (RadioButton) findViewById(R.id.warsawtwo);
        boolean warsawTwo = isWarsawTwo.isChecked();



// this part creates String that was given by a player in EditText field and it turns it to lower case

        EditText openText = (EditText) findViewById(R.id.answer);
        String openAnswer = openText.getText().toString();


        //Using "if" statement, method is counting points. It adds 1 point every time the right answer is given


        if (warsaw) {
            score = score + 1;
        }

        if (warsawThree) {
            score = score + 1;
        }

        if (warsawTwo) {
            score = score + 1;
        }


        // this creates toast message that shows score of a player

        Toast.makeText(this, "Your score: " + score + openAnswer, Toast.LENGTH_LONG).show();

        // after toast message, method resets "score" value back to 0.

    }


}
