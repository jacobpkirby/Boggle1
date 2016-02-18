package com.example.jacob.boggle;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static Boolean tile1ButtonPushed, tile2ButtonPushed, tile3ButtonPushed, tile4ButtonPushed,
            tile5ButtonPushed, tile6ButtonPushed, tile7ButtonPushed, tile8ButtonPushed,
            tile9ButtonPushed, tile10ButtonPushed, tile11ButtonPushed, tile12ButtonPushed,
            tile13ButtonPushed, tile14ButtonPushed, tile15ButtonPushed, tile16ButtonPushed;

    public static String tile1ButtonLetter, tile2ButtonLetter, tile3ButtonLetter, tile4ButtonLetter,
            tile5ButtonLetter, tile6ButtonLetter, tile7ButtonLetter, tile8ButtonLetter,
            tile9ButtonLetter, tile10ButtonLetter, tile11ButtonLetter, tile12ButtonLetter,
            tile13ButtonLetter, tile14ButtonLetter, tile15ButtonLetter, tile16ButtonLetter;

    protected Button tile1Button, tile2Button, tile3Button, tile4Button, tile5Button, tile6Button,
            tile7Button, tile8Button, tile9Button, tile10Button, tile11Button, tile12Button, tile13Button,
            tile14Button, tile15Button, tile16Button;
    protected Button submitScoreButton;
    protected TextView letterDisplayTextView;
    protected TextView yourScoreNumberTextView;
    boolean letterSumbitted1, letterSumbitted2, letterSumbitted3, letterSumbitted4,
            letterSumbitted5, letterSumbitted6, letterSumbitted7, letterSumbitted8, letterSumbitted9,
            letterSumbitted10, letterSumbitted11, letterSumbitted12, letterSumbitted14, letterSumbitted15;
    int yourScoreNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letterDisplayTextView = (TextView) findViewById(R.id.letterDisplayTextView);
        letterDisplayTextView.setText("");

        tile1Button = (Button) findViewById(R.id.tile1Button);
        tile1Button.setOnClickListener(this);
        tile1ButtonPushed = false;
        tile2ButtonPushed = false;
        tile3ButtonPushed = false;
        tile4ButtonPushed = false;
        tile5ButtonPushed = false;
        tile6ButtonPushed = false;
        tile7ButtonPushed = false;
        tile8ButtonPushed = false;
        tile9ButtonPushed = false;
        tile10ButtonPushed = false;
        tile11ButtonPushed = false;
        tile12ButtonPushed = false;
        tile13ButtonPushed = false;
        tile14ButtonPushed = false;
        tile15ButtonPushed = false;
        tile16ButtonPushed = false;

        tile2Button = (Button) findViewById(R.id.tile2Button);
        tile2Button.setOnClickListener(this);

        tile3Button = (Button) findViewById(R.id.tile3Button);
        tile3Button.setOnClickListener(this);

        tile4Button = (Button) findViewById(R.id.tile4Button);
        tile4Button.setOnClickListener(this);

        tile5Button = (Button) findViewById(R.id.tile5Button);
        tile5Button.setOnClickListener(this);

        tile6Button = (Button) findViewById(R.id.tile6Button);
        tile6Button.setOnClickListener(this);

        tile7Button = (Button) findViewById(R.id.tile7Button);
        tile7Button.setOnClickListener(this);

        tile8Button = (Button) findViewById(R.id.tile8Button);
        tile8Button.setOnClickListener(this);

        tile9Button = (Button) findViewById(R.id.tile9Button);
        tile9Button.setOnClickListener(this);

        tile10Button = (Button) findViewById(R.id.tile10Button);
        tile10Button.setOnClickListener(this);

        tile11Button = (Button) findViewById(R.id.tile11Button);
        tile11Button.setOnClickListener(this);

        tile12Button = (Button) findViewById(R.id.tile12Button);
        tile12Button.setOnClickListener(this);

        tile13Button = (Button) findViewById(R.id.tile13Button);
        tile13Button.setOnClickListener(this);

        tile14Button = (Button) findViewById(R.id.tile14Button);
        tile14Button.setOnClickListener(this);

        tile15Button = (Button) findViewById(R.id.tile15Button);
        tile15Button.setOnClickListener(this);

        tile16Button = (Button) findViewById(R.id.tile16Button);
        tile16Button.setOnClickListener(this);

        submitScoreButton = (Button) findViewById(R.id.submitScoreButton);
        submitScoreButton.setOnClickListener(this);

        yourScoreNumberTextView =  (TextView) findViewById(R.id.yourScoreNumberTextView);

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.tile1Button && !tile1ButtonPushed) {
            //Sets background of button to black when pushed
            tile1Button.setBackgroundColor(0x86090404);
            tile1ButtonPushed = true; //button is pushed
            //Adds the letter of Button to TextView
            tile1ButtonLetter = tile1Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile1ButtonLetter);
            //letterSumbitted1 = true;


        } else if (v.getId() == R.id.tile1Button && tile1ButtonPushed) {
            //if Button pressed again, changes background back to original background
            tile1Button.setBackgroundResource(R.mipmap.wood1);
            tile1ButtonPushed = false; //the button is no longer pushed
            //letterSumbitted1 = false;

            // letterDisplayTextView.setText
            //   (letterDisplayTextView.getText().toString().replace(tile1ButtonLetter, ""));
            removeLetter(tile1ButtonLetter);
        }

        if (v.getId() == R.id.tile2Button && !tile2ButtonPushed) {
            tile2Button.setBackgroundColor(0x86090404);
            tile2ButtonPushed = true;
            tile2ButtonLetter = tile2Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile2ButtonLetter = tile2Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile2ButtonLetter);
        } else if (v.getId() == R.id.tile2Button && tile2ButtonPushed) {
            tile2Button.setBackgroundResource(R.mipmap.wood1);
            tile2ButtonPushed = false;
            removeLetter(tile2ButtonLetter);

        }

        if (v.getId() == R.id.tile3Button && !tile3ButtonPushed) {
            tile3Button.setBackgroundColor(0x86090404);
            tile3ButtonPushed = true;
            tile3ButtonLetter = tile3Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile3ButtonLetter = tile3Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile3ButtonLetter);
        } else if (v.getId() == R.id.tile3Button && tile3ButtonPushed) {
            tile3Button.setBackgroundResource(R.mipmap.wood1);
            tile3ButtonPushed = false;
            removeLetter(tile3ButtonLetter);
        }


        if (v.getId() == R.id.tile4Button && !tile4ButtonPushed) {
            tile4Button.setBackgroundColor(0x86090404);
            tile4ButtonPushed = true;
            tile4ButtonLetter = tile4Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile4ButtonLetter = tile4Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile4ButtonLetter);
        } else if (v.getId() == R.id.tile4Button && tile4ButtonPushed) {
            tile4Button.setBackgroundResource(R.mipmap.wood1);
            tile4ButtonPushed = false;
            removeLetter(tile4ButtonLetter);
        }


        if (v.getId() == R.id.tile5Button && !tile5ButtonPushed) {
            tile5Button.setBackgroundColor(0x86090404);
            tile5ButtonPushed = true;
            tile5ButtonLetter = tile5Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile5ButtonLetter = tile5Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile5ButtonLetter);
        } else if (v.getId() == R.id.tile5Button && tile5ButtonPushed) {
            tile5Button.setBackgroundResource(R.mipmap.wood1);
            tile5ButtonPushed = false;
            removeLetter(tile5ButtonLetter);
        }


        if (v.getId() == R.id.tile6Button && !tile6ButtonPushed) {
            tile6Button.setBackgroundColor(0x86090404);
            tile6ButtonPushed = true;
            tile6ButtonLetter = tile6Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile6ButtonLetter = tile6Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile6ButtonLetter);
        } else if (v.getId() == R.id.tile6Button && tile6ButtonPushed) {
            tile6Button.setBackgroundResource(R.mipmap.wood1);
            tile6ButtonPushed = false;
            removeLetter(tile6ButtonLetter);
        }

        if (v.getId() == R.id.tile7Button && !tile7ButtonPushed) {
            tile7Button.setBackgroundColor(0x86090404);
            tile7ButtonPushed = true;
            tile7ButtonLetter = tile7Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile7ButtonLetter = tile7Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile7ButtonLetter);
        } else if (v.getId() == R.id.tile7Button && tile7ButtonPushed) {
            tile7Button.setBackgroundResource(R.mipmap.wood1);
            tile7ButtonPushed = false;
            removeLetter(tile7ButtonLetter);
        }

        if (v.getId() == R.id.tile8Button && !tile8ButtonPushed) {
            tile8Button.setBackgroundColor(0x86090404);
            tile8ButtonPushed = true;
            tile8ButtonLetter = tile8Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile8ButtonLetter = tile8Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile8ButtonLetter);
        } else if (v.getId() == R.id.tile8Button && tile8ButtonPushed) {
            tile8Button.setBackgroundResource(R.mipmap.wood1);
            tile8ButtonPushed = false;
            removeLetter(tile8ButtonLetter);
        }

        if (v.getId() == R.id.tile9Button && !tile9ButtonPushed) {
            tile9Button.setBackgroundColor(0x86090404);
            tile9ButtonPushed = true;
            tile9ButtonLetter = tile9Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile9ButtonLetter = tile9Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile9ButtonLetter);
        } else if (v.getId() == R.id.tile9Button && tile9ButtonPushed) {
            tile9Button.setBackgroundResource(R.mipmap.wood1);
            tile9ButtonPushed = false;
            removeLetter(tile9ButtonLetter);
        }

        if (v.getId() == R.id.tile10Button && !tile10ButtonPushed) {
            tile10Button.setBackgroundColor(0x86090404);
            tile10ButtonPushed = true;
            tile10ButtonLetter = tile10Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile10ButtonLetter = tile10Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile10ButtonLetter);
        } else if (v.getId() == R.id.tile10Button && tile10ButtonPushed) {
            tile10Button.setBackgroundResource(R.mipmap.wood1);
            tile10ButtonPushed = false;
            removeLetter(tile10ButtonLetter);
        }

        if (v.getId() == R.id.tile11Button && !tile11ButtonPushed) {
            tile11Button.setBackgroundColor(0x86090404);
            tile11ButtonPushed = true;
            tile11ButtonLetter = tile11Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile11ButtonLetter = tile11Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile11ButtonLetter);
        } else if (v.getId() == R.id.tile11Button && tile11ButtonPushed) {
            tile11Button.setBackgroundResource(R.mipmap.wood1);
            tile11ButtonPushed = false;
            removeLetter(tile11ButtonLetter);
        }

        if (v.getId() == R.id.tile12Button && !tile12ButtonPushed) {
            tile12Button.setBackgroundColor(0x86090404);
            tile12ButtonPushed = true;
            tile12ButtonLetter = tile12Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile12ButtonLetter = tile12Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile12ButtonLetter);
        } else if (v.getId() == R.id.tile12Button && tile12ButtonPushed) {
            tile12Button.setBackgroundResource(R.mipmap.wood1);
            tile12ButtonPushed = false;
            removeLetter(tile12ButtonLetter);
        }

        if (v.getId() == R.id.tile13Button && !tile13ButtonPushed) {
            tile13Button.setBackgroundColor(0x86090404);
            tile13ButtonPushed = true;
            tile13ButtonLetter = tile13Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile13ButtonLetter = tile13Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile13ButtonLetter);
        } else if (v.getId() == R.id.tile13Button && tile13ButtonPushed) {
            tile13Button.setBackgroundResource(R.mipmap.wood1);
            tile13ButtonPushed = false;
            removeLetter(tile13ButtonLetter);
        }

        if (v.getId() == R.id.tile14Button && !tile14ButtonPushed) {
            tile14Button.setBackgroundColor(0x86090404);
            tile14ButtonPushed = true;
            tile14ButtonLetter = tile14Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile14ButtonLetter = tile14Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile14ButtonLetter);
        } else if (v.getId() == R.id.tile14Button && tile14ButtonPushed) {
            tile14Button.setBackgroundResource(R.mipmap.wood1);
            tile14ButtonPushed = false;
            removeLetter(tile14ButtonLetter);
        }

        if (v.getId() == R.id.tile15Button && !tile15ButtonPushed) {
            tile15Button.setBackgroundColor(0x86090404);
            tile15ButtonPushed = true;
            tile15ButtonLetter = tile15Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile15ButtonLetter = tile15Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile15ButtonLetter);
        } else if (v.getId() == R.id.tile15Button && tile15ButtonPushed) {
            tile15Button.setBackgroundResource(R.mipmap.wood1);
            tile15ButtonPushed = false;
            removeLetter(tile15ButtonLetter);
        }

        if (v.getId() == R.id.tile16Button && !tile16ButtonPushed) {
            tile16Button.setBackgroundColor(0x86090404);
            tile16ButtonPushed = true;
            tile16ButtonLetter = tile16Button.getText().toString();
            //Adds the letter of Button to TextView
            String tile16ButtonLetter = tile16Button.getText().toString();
            letterDisplayTextView.setText(letterDisplayTextView.getText() + tile16ButtonLetter);
        } else if (v.getId() == R.id.tile16Button && tile16ButtonPushed) {
            tile16Button.setBackgroundResource(R.mipmap.wood1);
            tile16ButtonPushed = false;
            removeLetter(tile16ButtonLetter);
        }

        if (v.getId() == R.id.submitScoreButton) {
            letterDisplayTextView.setText("");
            yourScoreNumber++;
            yourScoreNumberTextView.setText("" + yourScoreNumber);

            tile1Button.setBackgroundResource(R.mipmap.wood1);
            tile1ButtonPushed = false;
            tile2Button.setBackgroundResource(R.mipmap.wood1);
            tile2ButtonPushed = false;
            tile3Button.setBackgroundResource(R.mipmap.wood1);
            tile3ButtonPushed = false;
            tile4Button.setBackgroundResource(R.mipmap.wood1);
            tile4ButtonPushed = false;
            tile5Button.setBackgroundResource(R.mipmap.wood1);
            tile5ButtonPushed = false;
            tile6Button.setBackgroundResource(R.mipmap.wood1);
            tile6ButtonPushed = false;
            tile7Button.setBackgroundResource(R.mipmap.wood1);
            tile7ButtonPushed = false;
            tile8Button.setBackgroundResource(R.mipmap.wood1);
            tile8ButtonPushed = false;
            tile9Button.setBackgroundResource(R.mipmap.wood1);
            tile9ButtonPushed = false;
            tile10Button.setBackgroundResource(R.mipmap.wood1);
            tile10ButtonPushed = false;
            tile11Button.setBackgroundResource(R.mipmap.wood1);
            tile11ButtonPushed = false;
            tile12Button.setBackgroundResource(R.mipmap.wood1);
            tile12ButtonPushed = false;
            tile13Button.setBackgroundResource(R.mipmap.wood1);
            tile13ButtonPushed = false;
            tile14Button.setBackgroundResource(R.mipmap.wood1);
            tile14ButtonPushed = false;
            tile15Button.setBackgroundResource(R.mipmap.wood1);
            tile15ButtonPushed = false;
            tile16Button.setBackgroundResource(R.mipmap.wood1);
            tile16ButtonPushed = false;
        }

        //ButtonLetterListener.setLetter()

    }

    public void removeLetter(String letter) {
        //char c = letterDisplayTextView.getText().toString().charAt(0);
        if (!letter.equals("Qu")) {
            int Index = letterDisplayTextView.getText().toString().lastIndexOf(letter);
            char character = letterDisplayTextView.getText().toString().charAt(Index);
            String s = character + "";

            if (Index != -1) {
                letterDisplayTextView.setText(letterDisplayTextView.getText().toString().replace(s, "")); // not forgot to put check if(endIndex != -1)
            }
        } else {
            letter = "Q";
            int Index = letterDisplayTextView.getText().toString().lastIndexOf(letter);
            char character = letterDisplayTextView.getText().toString().charAt(Index);
            String s = character + "u";
            System.out.println(s);
            if (Index != -1) {
                letterDisplayTextView.setText(letterDisplayTextView.getText().toString().replace(s, "")); // not forgot to put check if(endIndex != -1)
            }


        }
        //(letterDisplayTextView.getText().toString().replace(tile1ButtonLetter, ""));
        //letterDisplayTextView.setText
        //     (letterDisplayTextView.getText().toString().replace(lastIndexof(tile1ButtonLetter), ""));

    }
}