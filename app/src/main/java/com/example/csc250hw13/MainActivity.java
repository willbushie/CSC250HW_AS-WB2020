package com.example.csc250hw13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // declare variables for necessary methods
    int numOfRolls = 0;
    int diceSelection = 0;

    // RESET METHODS
    // reset ONLY number keypad
    public void resetNumbers(View v)
    {
        // reset variables
        numOfRolls = 0;
        // reset styles for all buttons
        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.
        oneKeypad_button.setTextColor(Color.WHITE);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);
        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);

        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);


    }
    // reset ONLY dice selection keypad
    public void resetDiceSelection(View v)
    {
        // reset variables
        diceSelection = 0;
        // reset styles for all buttons

    }


    // -------- ALL BUTTON ONCLICK METHODS  -------

    // for the roll button press (click "@+id/roll_button")(, int numOfRolls, int diceSelection)
    public void roll_buttonActivate(View v)
    {
        // identify text views later used
        TextView rollResutls_textview = this.findViewById(R.id.rollResults_textview);
        TextView rollResultsTotal_textview = this.findViewById(R.id.rollResultsTotal_textview);

        // if unable to process the request
        if (numOfRolls == 0 || diceSelection ==0)
        {
            // exit the method
            return;
        }

        // execute the roll(s) (# of dice * # of sides)
        int finalTotal = 0;
        String finalAdditionStatement = "";
        int count = 0;
        while (count < numOfRolls)
        {
            // generate random number based on diceSelection
            Random r = new Random();
            int roll = r.nextInt(diceSelection+1);
            // update values
            finalTotal += roll;
            String strToInt = Integer.toString(roll);
            finalAdditionStatement += strToInt;
            // update count
            count++;
            finalAdditionStatement += " + ";
        }

        // update the appropriate textViews ("@+id/rollResults_textview" & "@+id/rollResultsTotal_textview")
        rollResutls_textview.setText(finalAdditionStatement);
        rollResultsTotal_textview.setText(finalTotal);
    }

    // for the percentile button press (click "@+id/percentile_button")
    public void percentile_buttonActivate(View v)
    {
        // identify text views to later be updated
        TextView rollResutls_textview = this.findViewById(R.id.rollResults_textview);
        TextView rollResultsTotal_textview = this.findViewById(R.id.rollResultsTotal_textview);

        // roll a random number from 1 to 100 & store it
        Random r = new Random();
        int randInt = r.nextInt(100);
        // update the textview values
        rollResutls_textview.setText(randInt);
        rollResultsTotal_textview.setText(randInt);

    }

    // ALL KEYPAD BUTTON METHODS (NUMBERS ONLY)
    // the one button
    public void oneKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 1;
        // update the button theme to be active
        Button oneKeypad_button = this.findViewById(R.id.oneKeypad_button);
        oneKeypad_button.setBackgroundColor(Color.WHITE);
        oneKeypad_button.setTextColor(Color.BLACK);
    }
    // the two button
    public void twoKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 2;
        // update the button theme to be active
        Button twoKeypad_button = this.findViewById(R.id.twoKeypad_button);
        twoKeypad_button.setBackgroundColor(Color.WHITE);
        twoKeypad_button.setTextColor(Color.BLACK);
    }
    // the three button
    public void threeKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 3;
        // update the button theme to be active
        Button threeKeypad_button = this.findViewById(R.id.threeKeypad_button);
        threeKeypad_button.setBackgroundColor(Color.WHITE);
        threeKeypad_button.setTextColor(Color.BLACK);
    }
    // the four button
    public void fourKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 4;
        // update the button theme to be active
        Button fourKeypad_button = this.findViewById(R.id.fourKeypad_button);
        fourKeypad_button.setBackgroundColor(Color.WHITE);
        fourKeypad_button.setTextColor(Color.BLACK);
    }
    // the five button
    public void fiveKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 5;
        // update the button theme to be active
        Button fiveKeypad_button = this.findViewById(R.id.fiveKeypad_button);
        fiveKeypad_button.setBackgroundColor(Color.WHITE);
        fiveKeypad_button.setTextColor(Color.BLACK);
    }
    // the six button
    public void sixKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 6;
        // update the button theme to be active
        Button sixKeypad_button = this.findViewById(R.id.sixKeypad_button);
        sixKeypad_button.setBackgroundColor(Color.WHITE);
        sixKeypad_button.setTextColor(Color.BLACK);
    }
    // the seven button
    public void sevenKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 7;
        // update the button theme to be active
        Button sevenKeypad_button = this.findViewById(R.id.sevenKeypad_button);
        sevenKeypad_button.setBackgroundColor(Color.WHITE);
        sevenKeypad_button.setTextColor(Color.BLACK);
    }
    // the eight button
    public void eightKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 8;
        // update the button theme to be active
        Button eightKeypad_button = this.findViewById(R.id.eightKeypad_button);
        eightKeypad_button.setBackgroundColor(Color.WHITE);
        eightKeypad_button.setTextColor(Color.BLACK);
    }
    // the nine button
    public void nineKeypad_buttonActivate(View v)
    {
        resetNumbers();
        // update the number of rolls
        numOfRolls = 9;
        // update the button theme to be active
        Button nineKeypad_button = this.findViewById(R.id.nineKeypad_button);
        nineKeypad_button.setBackgroundColor(Color.WHITE);
        nineKeypad_button.setTextColor(Color.BLACK);
    }

    // ALL KEYPAD BUTTON METHODS (DICE SELECTION ONLY)
    // the D4 button
    public void D4Keypad_buttonActivate(View v)
    {
        resetDiceSelection();
        // update the number of rolls
        diceSelection = 4;
        // update the button theme to be active
        Button d4_button = this.findViewById(R.id.d4_button);
        d4_button.setBackgroundColor(Color.WHITE);
        d4_button.setTextColor(Color.BLACK);
    }
    // the D6 button
    public void D6Keypad_buttonActivate(View v)
    {
        resetDiceSelection();
        // update the number of rolls
        diceSelection = 4;
        // update the button theme to be active
        Button d6_button = this.findViewById(R.id.d6_button);
        d6_button.setBackgroundColor(Color.WHITE);
        d6_button.setTextColor(Color.BLACK);
    }
    // the D8 button
    public void D8Keypad_buttonActivate(View v)
    {
        resetDiceSelection();
        // update the number of rolls
        diceSelection = 8;
        // update the button theme to be active
        Button d8_button = this.findViewById(R.id.d8_button);
        d8_button.setBackgroundColor(Color.WHITE);
        d8_button.setTextColor(Color.BLACK);
    }
    // the D10 button
    public void D10Keypad_buttonActivate(View v)
    {
        resetDiceSelection();
        // update the number of rolls
        diceSelection = 10;
        // update the button theme to be active
        Button d10_button = this.findViewById(R.id.d10_button);
        d10_button.setBackgroundColor(Color.WHITE);
        d10_button.setTextColor(Color.BLACK);
    }
    // the D12 button
    public void D12Keypad_buttonActivate(View v)
    {
        resetDiceSelection();
        // update the number of rolls
        diceSelection = 12;
        // update the button theme to be active
        Button d12_button = this.findViewById(R.id.d12_button);
        d12_button.setBackgroundColor(Color.WHITE);
        d12_button.setTextColor(Color.BLACK);
    }
    // the D20 button
    public void D20Keypad_buttonActivate(View v)
    {
        resetDiceSelection();
        // update the number of rolls
        diceSelection = 20;
        // update the button theme to be active
        Button d20_button = this.findViewById(R.id.d20_button);
        d20_button.setBackgroundColor(Color.WHITE);
        d20_button.setTextColor(Color.BLACK);
    }

}