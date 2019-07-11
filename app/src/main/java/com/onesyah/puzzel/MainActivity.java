package com.onesyah.puzzel;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons;
    private String[] rndm = { "F", "D","G","C","O","M","N","E","B","H","A","K","J","I","L" ,""};
    private String[] rndmDua = { "A", "H","B","L","O","J","I","D","M","E","K","F","N","G","C" ,""};
    Random angka = new Random();




    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = findButtons();
        int a = 0;

        for (int i =0;i<rndm.length;i++){
                buttons[i].setText(rndm[i]);
        }

        if (buttons[0].getText().toString() == "A"){
            buttons[0].setBackgroundColor(Color.YELLOW);
        }else{
            buttons[0].setBackgroundColor(Color.WHITE);
        }
        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[1].getText().toString() == "" ){
                    buttons[1].setText(buttons[0].getText().toString());
                    buttons[0].setText("");
                }
                if (buttons[4].getText().toString() == "" ){
                    buttons[4].setText(buttons[0].getText().toString());
                    buttons[0].setText("");
                }
            }
        });
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[0].getText().toString() == "" ){
                    buttons[0].setText(buttons[1].getText().toString());
                    buttons[1].setText("");
                }
                if (buttons[2].getText().toString() == "" ){
                    buttons[2].setText(buttons[1].getText().toString());
                    buttons[1].setText("");
                }
                if (buttons[5].getText().toString() == "" ){
                    buttons[5].setText(buttons[1].getText().toString());
                    buttons[1].setText("");
                }

            }
        });
        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[1].getText().toString() == "" ){
                    buttons[1].setText(buttons[2].getText().toString());
                    buttons[2].setText("");
                }
                if (buttons[3].getText().toString() == "" ){
                    buttons[3].setText(buttons[2].getText().toString());
                    buttons[2].setText("");
                }
                if (buttons[6].getText().toString() == "" ){
                    buttons[6].setText(buttons[2].getText().toString());
                    buttons[2].setText("");
                }

            }
        });
        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[2].getText().toString() == "" ){
                    buttons[2].setText(buttons[3].getText().toString());
                    buttons[3].setText("");
                }
                if (buttons[7].getText().toString() == "" ){
                    buttons[7].setText(buttons[3].getText().toString());
                    buttons[3].setText("");
                }
            }
        });
        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[0].getText().toString() == "" ){
                    buttons[0].setText(buttons[4].getText().toString());
                    buttons[4].setText("");
                }
                if (buttons[5].getText().toString() == "" ){
                    buttons[5].setText(buttons[4].getText().toString());
                    buttons[4].setText("");
                }
                if (buttons[8].getText().toString() == "" ){
                    buttons[8].setText(buttons[4].getText().toString());
                    buttons[4].setText("");
                }

            }
        });
        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[1].getText().toString() == "" ){
                    buttons[1].setText(buttons[5].getText().toString());
                    buttons[5].setText("");
                }
                if (buttons[4].getText().toString() == "" ){
                    buttons[4].setText(buttons[5].getText().toString());
                    buttons[5].setText("");
                }
                if (buttons[6].getText().toString() == "" ){
                    buttons[6].setText(buttons[5].getText().toString());
                    buttons[5].setText("");
                }
                if (buttons[9].getText().toString() == "" ){
                    buttons[9].setText(buttons[5].getText().toString());
                    buttons[5].setText("");
                }

            }
        });
        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[2].getText().toString() == "" ){
                    buttons[2].setText(buttons[6].getText().toString());
                    buttons[6].setText("");
                }
                if (buttons[5].getText().toString() == "" ){
                    buttons[5].setText(buttons[6].getText().toString());
                    buttons[6].setText("");
                }
                if (buttons[7].getText().toString() == "" ){
                    buttons[7].setText(buttons[6].getText().toString());
                    buttons[6].setText("");
                }
                if (buttons[10].getText().toString() == "" ){
                    buttons[10].setText(buttons[6].getText().toString());
                    buttons[6].setText("");
                }

            }
        });
        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[3].getText().toString() == "" ){
                    buttons[3].setText(buttons[7].getText().toString());
                    buttons[7].setText("");
                }
                if (buttons[6].getText().toString() == "" ){
                    buttons[6].setText(buttons[7].getText().toString());
                    buttons[7].setText("");
                }
                if (buttons[11].getText().toString() == "" ){
                    buttons[11].setText(buttons[7].getText().toString());
                    buttons[7].setText("");
                }

            }
        });
        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[4].getText().toString() == "" ){
                    buttons[4].setText(buttons[8].getText().toString());
                    buttons[8].setText("");
                }
                if (buttons[9].getText().toString() == "" ){
                    buttons[9].setText(buttons[8].getText().toString());
                    buttons[8].setText("");
                }
                if (buttons[12].getText().toString() == "" ){
                    buttons[12].setText(buttons[8].getText().toString());
                    buttons[8].setText("");
                }

            }
        });
        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[5].getText().toString() == "" ){
                    buttons[5].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }
                if (buttons[8].getText().toString() == "" ){
                    buttons[8].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }
                if (buttons[10].getText().toString() == "" ){
                    buttons[10].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }
                if (buttons[13].getText().toString() == "" ){
                    buttons[13].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }

            }
        });
        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[5].getText().toString() == "" ){
                    buttons[5].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }
                if (buttons[8].getText().toString() == "" ){
                    buttons[8].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }
                if (buttons[10].getText().toString() == "" ){
                    buttons[10].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }
                if (buttons[13].getText().toString() == "" ){
                    buttons[13].setText(buttons[9].getText().toString());
                    buttons[9].setText("");
                }

            }
        });
        buttons[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[6].getText().toString() == "" ){
                    buttons[6].setText(buttons[10].getText().toString());
                    buttons[10].setText("");
                }
                if (buttons[9].getText().toString() == "" ){
                    buttons[9].setText(buttons[10].getText().toString());
                    buttons[10].setText("");
                }
                if (buttons[11].getText().toString() == "" ){
                    buttons[11].setText(buttons[10].getText().toString());
                    buttons[10].setText("");
                }
                if (buttons[14].getText().toString() == "" ){
                    buttons[14].setText(buttons[10].getText().toString());
                    buttons[10].setText("");
                }

            }
        });
        buttons[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[7].getText().toString() == "" ){
                    buttons[7].setText(buttons[11].getText().toString());
                    buttons[11].setText("");
                }
                if (buttons[10].getText().toString() == "" ){
                    buttons[10].setText(buttons[11].getText().toString());
                    buttons[11].setText("");
                }

                if (buttons[15].getText().toString() == "" ){
                    buttons[15].setText(buttons[11].getText().toString());
                    buttons[11].setText("");
                }

            }
        });
        buttons[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[8].getText().toString() == "" ){
                    buttons[8].setText(buttons[12].getText().toString());
                    buttons[12].setText("");
                }

                if (buttons[13].getText().toString() == "" ){
                    buttons[13].setText(buttons[12].getText().toString());
                    buttons[12].setText("");
                }

            }
        });
        buttons[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[9].getText().toString() == "" ){
                    buttons[9].setText(buttons[13].getText().toString());
                    buttons[13].setText("");
                }
                if (buttons[12].getText().toString() == "" ){
                    buttons[12].setText(buttons[13].getText().toString());
                    buttons[13].setText("");
                }

                if (buttons[14].getText().toString() == "" ){
                    buttons[14].setText(buttons[13].getText().toString());
                    buttons[13].setText("");
                }

            }
        });
        buttons[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[10].getText().toString() == "" ){
                    buttons[10].setText(buttons[14].getText().toString());
                    buttons[14].setText("");
                }
                if (buttons[13].getText().toString() == "" ){
                    buttons[13].setText(buttons[14].getText().toString());
                    buttons[14].setText("");
                }

                if (buttons[15].getText().toString() == "" ){
                    buttons[15].setText(buttons[14].getText().toString());
                    buttons[14].setText("");
                }

            }
        });
        buttons[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (buttons[11].getText().toString() == "" ){
                    buttons[11].setText(buttons[15].getText().toString());
                    buttons[15].setText("");
                }
                if (buttons[14].getText().toString() == "" ){
                    buttons[14].setText(buttons[15].getText().toString());
                    buttons[15].setText("");
                }
            }
        });
    }

    public Button[] findButtons() {
        Button[] b = new Button[16];
        b[0] = (Button) findViewById(R.id.btn0);
        b[1] = (Button) findViewById(R.id.btn1);
        b[2] = (Button) findViewById(R.id.btn2);
        b[3] = (Button) findViewById(R.id.btn3);
        b[4] = (Button) findViewById(R.id.btn4);
        b[5] = (Button) findViewById(R.id.btn5);
        b[6] = (Button) findViewById(R.id.btn6);
        b[7] = (Button) findViewById(R.id.btn7);
        b[8] = (Button) findViewById(R.id.btn8);
        b[9] = (Button) findViewById(R.id.btn9);
        b[10] = (Button) findViewById(R.id.btn10);
        b[11] = (Button) findViewById(R.id.btn11);
        b[12] = (Button) findViewById(R.id.btn12);
        b[13] = (Button) findViewById(R.id.btn13);
        b[14] = (Button) findViewById(R.id.btn14);
        b[15] = (Button) findViewById(R.id.btn15);

        return b;
    }


    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.ulang){
            buttons = findButtons();
            for (int i =0;i<rndm.length;i++){
                buttons[i].setText(rndm[i]);
            }
        } else if (item.getItemId() == R.id.keluar) {

            finish();
            System.exit(0);
        }
        return true;
    }


}
