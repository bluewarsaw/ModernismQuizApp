package pl.sebastianczarnecki.modernismquizapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;




public class DatesActivity extends Activity {


    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);
    }


    // method sumUp counts final score

    public void sumUp(View view) {

        // this part identifies all RadioButtons, Checkboxes that have correct answers. It also verifies if those radio/checkboxes are checked

        RadioButton six = (RadioButton) findViewById(R.id.six);
        boolean isSix = six.isChecked();

        RadioButton five = (RadioButton) findViewById(R.id.five);
        boolean isFive = five.isChecked();

        RadioButton eighteen = (RadioButton) findViewById(R.id.eighteen);
        boolean isEighteen = eighteen.isChecked();






        //Using "if" statement, method is counting points. It adds 1 point every time the right answer is given


        if (isSix) {
            score = score + 1;
        }

        if (isFive) {
            score = score + 1;
        }

        if (isEighteen) {
            score = score + 1;
        }

        // this creates toast message that shows score of a player
        Toast.makeText(this,"Your score" + score, Toast.LENGTH_SHORT).show();

    }
}
