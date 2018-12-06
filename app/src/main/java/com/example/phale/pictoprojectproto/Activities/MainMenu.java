package com.example.phale.pictoprojectproto.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.phale.pictoprojectproto.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);
    }

    // onClick event to go to the Setup Game phase
    public void dispatchPlayGame(View view)
    {
        // Create intent for starting a Game Session
        Intent setupIntent = new Intent(this, SetupActivity.class);

        if(setupIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(setupIntent);
        }
        else
        {
            // Display test message
            Toast.makeText(this, "Failed to start Game Session", Toast.LENGTH_SHORT).show();
            Log.d("dispatchPlayGame", "Failed to start Game Session");
        }
    }
}