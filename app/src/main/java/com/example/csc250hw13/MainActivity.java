package com.example.csc250hw13;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // for the button press (update @+id/button_FName)
    public void fNameButtonClick(View v)
    {
        TextView textView_FName = this.findViewById(R.id.textView_FName);
        // store value for a temporary time
        TextView tempHoldTextView = textView_FName;
        // replace the text
        textView_FName.setText("William");
    }

    // for the button press (update @+id/button_lName)
    public void lNameButtonClick(View v)
    {
        TextView textView_LName = this.findViewById(R.id.textView_LName);
        // store value for a temporary time
        TextView tempHoldTextView = textView_LName;
        // replace the text
        textView_LName.setText("Bushie");
    }
}