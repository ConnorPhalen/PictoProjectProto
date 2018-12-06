package com.example.phale.pictoprojectproto.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.phale.pictoprojectproto.DataClasses.Player;
import com.example.phale.pictoprojectproto.R;

import java.util.ArrayList;

public class SetupActivity extends AppCompatActivity {

    private ArrayList<Player> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_setup);

        playerList = new ArrayList<>();
    }

    // onClick event to go to the Setup Game phase
    public void dispatchStartGame(View view)
    {
        // Create intent for starting a Game Session
        Intent startGameIntent = new Intent(this, GameActivity.class);

        if(startGameIntent.resolveActivity(getPackageManager()) != null)
        {
            startGameIntent.putExtra("EXTRA_PLAYER_LIST", playerList);
            startActivity(startGameIntent);
        }
        else
        {
            // Display test message
            Toast.makeText(this, "Failed to start Game Session", Toast.LENGTH_SHORT).show();
            Log.d("dispatchStartGame", "Failed to startup game");
        }
    }
}
