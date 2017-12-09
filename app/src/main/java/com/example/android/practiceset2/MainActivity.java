package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increment by 3 points when +3 button is clicked
     */
    public void incbythreeA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void incbythreeB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increment by 2 points when +2 button clicked
     */
    public void incbytwoA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void incbytwoB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increment by 1 point when free points is clicked
     */
    public void freeptsA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void freeptsB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * When reset button clicked
     */
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
