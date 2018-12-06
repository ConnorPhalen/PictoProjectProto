package com.example.phale.pictoprojectproto.DataClasses;

public class Player {

    private int     playerID;
    private int     playerScore;
    private String  playerName;
    private boolean isDrawing;

    // Constructor
    public void Player(String inputName)
    {
        playerName = inputName;
    }

    // Function to sum into player score.
    protected void adjustScore(int adjScr)
    {
       // Sum with playerScore
        playerScore += adjScr;
    }






    /* ---- Start Get and Set Functions ---- */
    // Get the Player Name
    public String getPlayerName()
    {
        return playerName;
    }

    // Get Player Score
    public int getPlayerScore()
    {
        return playerScore;
    }

    // Get PlayerID
    public int getPlayerID() {
        return playerID;
    }

    public boolean getIsDrawing()
    {
        return isDrawing;
    }

    /* ---- End Get and Set Functions ---- */
}
