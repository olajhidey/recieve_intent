package com.jonetech.receiveintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView labelText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the intent coming from outside of the application

        Intent mIntent = getIntent();

        // Convert it to a uri so its accessible

        Uri mUri = mIntent.getData();

        if(mUri != null) {
            String text_uri = "URI: "+ mUri.toString();

            // Get yout label text from the view
            labelText = (TextView) findViewById(R.id.text_uri_message);


            // Append the text_uri into our Label Text if the Uri is not null
            labelText.setText(text_uri);
        }
    }
}
