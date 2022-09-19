package com.example.madlibscs315;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.madlibscs315.MESSAGE";

    //These arrays will initiate on create.
    EditText[] user_input_text;
    String[] user_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText[] user_input_text = new EditText[20];
        String[] user_text = new String[20];
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        /*Declares user input text boxes 1 through 8.
        EditText user_text_input_1 = findViewById(R.id.user_input_textbox_1);
        EditText user_text_input_2 = findViewById(R.id.user_input_textbox_2);
        EditText user_text_input_3 = findViewById(R.id.user_input_textbox_3);
        EditText user_text_input_4 = findViewById(R.id.user_input_textbox_4);
        EditText user_text_input_5 = findViewById(R.id.user_input_textbox_5);
        EditText user_text_input_6 = findViewById(R.id.user_input_textbox_6);
        EditText user_text_input_7 = findViewById(R.id.user_input_textbox_7);
        EditText user_text_input_8 = findViewById(R.id.user_input_textbox_8);

        //Retrieves input from text boxes 1 through 8.
        String user_text_1 = user_text_input_1.getText().toString();
        String user_text_2 = user_text_input_2.getText().toString();
        String user_text_3 = user_text_input_3.getText().toString();
        String user_text_4 = user_text_input_4.getText().toString();
        String user_text_5 = user_text_input_5.getText().toString();
        String user_text_6 = user_text_input_6.getText().toString();
        String user_text_7 = user_text_input_7.getText().toString();
        String user_text_8 = user_text_input_8.getText().toString();

        //Sends text to fill in the blanks in the next activity.
        intent.putExtra(EXTRA_MESSAGE, user_text_1);
        intent.putExtra(EXTRA_MESSAGE, user_text_2);
        intent.putExtra(EXTRA_MESSAGE, user_text_3);
        intent.putExtra(EXTRA_MESSAGE, user_text_4);
        intent.putExtra(EXTRA_MESSAGE, user_text_5);
        intent.putExtra(EXTRA_MESSAGE, user_text_6);
        intent.putExtra(EXTRA_MESSAGE, user_text_7);
        intent.putExtra(EXTRA_MESSAGE, user_text_8);*/

        //Starts the activity only if the text boxes are not blank.
        if ()
            startActivity(intent);
    }

    public void GetUserInput(){

    }
}