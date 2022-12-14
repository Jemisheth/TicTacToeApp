package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GamePage extends AppCompatActivity {

    // variable declaration

    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private String startGame = "X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xCount=0,oCount=0,i=0;
    private TextView playerx,playero;
    private Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        // finding the id of variable
        button1 = findViewById(R.id.buttonImage1);
        button2 = findViewById(R.id.buttonImage2);
        button3 = findViewById(R.id.buttonImage3);
        button4 = findViewById(R.id.buttonImage4);
        button5 = findViewById(R.id.buttonImage5);
        button6 = findViewById(R.id.buttonImage6);
        button7 = findViewById(R.id.buttonImage7);
        button8 = findViewById(R.id.buttonImage8);
        button9 = findViewById(R.id.buttonImage9);

        playerx = findViewById(R.id.ScoreX);
        playero = findViewById(R.id.ScoreY);

        Reset = findViewById(R.id.Reset);

        // listener has been added to the button

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset the game
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                xCount=0;
                oCount=0;
                resetValues();
                playerx.setText("Score X:- "+String.valueOf(xCount));
                playero.setText("Score Y:- "+String.valueOf(oCount));

            }
        });

        // listener to the each box
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button1.setImageResource(R.drawable.cross);
                    b1=1;
                    i++;
                }
                else
                {
                    button1.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button2.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button3.setImageResource(R.drawable.cross);
                    b3=1;
                    i++;
                }
                else
                {
                    button3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button4.setImageResource(R.drawable.cross);
                    b4=1;
                    i++;
                }
                else
                {
                    button4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button5.setImageResource(R.drawable.cross);
                    b5=1;
                    i++;
                }
                else
                {
                    button5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button6.setImageResource(R.drawable.cross);
                    b6=1;
                    i++;
                }
                else
                {
                    button6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button7.setImageResource(R.drawable.cross);
                    b7=1;
                    i++;
                }
                else
                {
                    button7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button8.setImageResource(R.drawable.cross);
                    b8=1;
                    i++;
                }
                else
                {
                    button8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){

                    button9.setImageResource(R.drawable.cross);
                    b9=1;
                    i++;
                }
                else
                {
                    button9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });


    }

    // this method is used for winner of the game
    private void winningGame()
    {

        if((b1==1) && (b2==1) && (b3==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));


        }

        else if((b4==1) && (b5==1) && (b6==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }

        else if((b7==1) && (b8==1) && (b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }

        else if((b1==1) && (b4==1) && (b7==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }


        else if((b2==1) && (b5==1) && (b8==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }

        else if((b3==1) && (b6==1) && (b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }

        else if((b1==1) && (b5==1) && (b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }

        else if((b3==1) && (b5==1) && (b7==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            playerx.setText("Score X:- "+String.valueOf(xCount));

        }

        else if((b1==0) && (b2==0) && (b3==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }


        else if((b4==0) && (b5==0) && (b6==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else if((b7==0) && (b8==0) && (b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else if((b1==0) && (b4==0) && (b7==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else if((b2==0) && (b5==0) && (b8==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else if((b3==0) && (b6==0) && (b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else if((b1==0) && (b5==0) && (b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else if((b3==0) && (b5==0) && (b7==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Weeee Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            playero.setText("Score Y:- "+String.valueOf(oCount));

        }

        else
        {
            if (i==9)
            {

                // this dialog is for no player wins
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No-One Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);
                        resetValues();

                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }

    }

    // this method is used to choose the player
    private void choosePlayer(){

        if (startGame.equals("X"))
        {
            startGame = "O";
        }
        else{

            startGame = "X";
        }
    }


    private void resetValues() {

        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
    }
}