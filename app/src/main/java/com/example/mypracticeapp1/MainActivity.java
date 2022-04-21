package com.example.mypracticeapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //all coding here in MainActivity
    //we will create instance/objects for all components from the widgets of andriod
    //let say for a button
    Button SignUp;
    TextView NameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setcontent view is used to load resources

        //setContentView(R.layout.activity_main);
        setContentView(R.layout.testlayout);
        //give button id to bind
        //if you miss the constraint the component will ove to the 0,0 location
        //give it the contraints from the design section
        SignUp = findViewById(R.id.signup);
        NameText = findViewById(R.id.nameText);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameText.setText("successs!");
            }
        });
    }

}