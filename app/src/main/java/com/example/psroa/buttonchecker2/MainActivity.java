package com.example.psroa.buttonchecker2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreTextView;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rather than fill up the screen with a bunch of wire widgets line of code we offload that into wireWigets method
        wireWidgets();
        this.score = 0;

    }

    //this method is private because we don't need to access it from anywhere else
    private void wireWidgets() {
        scoreTextView = findViewById(R.id.text_view_score);
    }

    public void onClickMeClick(View view) {
        //Toast.makeText(this, "Ouches!!!!!", Toast.LENGTH_SHORT).show();
        score++;

        scoreTextView.setText("Score: " + score);
    }
}
