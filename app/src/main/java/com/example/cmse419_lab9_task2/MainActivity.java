package com.example.cmse419_lab9_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Bt1,Bt2,Bt3,Bt4,Bt5,Bt6,Bt7,Bt8,Bt9,Bt10;
    TextView Tv1,Tv2;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bt1 = findViewById(R.id.button);
        Bt2 = findViewById(R.id.button2);
        Bt3 = findViewById(R.id.button3);
        Bt4 = findViewById(R.id.button4);
        Bt5 = findViewById(R.id.button5);
        Bt6 = findViewById(R.id.button6);
        Bt7 = findViewById(R.id.button7);
        Bt8 = findViewById(R.id.button8);
        Bt9 = findViewById(R.id.button9);
        Bt10 = findViewById(R.id.button10);
        Tv1 = findViewById(R.id.textView);
        Tv2 = findViewById(R.id.textView2);

        View.OnClickListener MulListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        if (i%2 == 0) {
                            Bt1.setText("O");
                        }
                        else {
                            Bt1.setText("X");
                        }
                        Bt1.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button2:
                        if (i%2 == 0) {
                            Bt2.setText("O");
                        }
                        else {
                            Bt2.setText("X");
                        }
                        Bt2.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button3:
                        if (i%2 == 0) {
                            Bt3.setText("O");
                        }
                        else {
                            Bt3.setText("X");
                        }
                        Bt3.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button4:
                        if (i%2 == 0) {
                            Bt4.setText("O");
                        }
                        else {
                            Bt4.setText("X");
                        }
                        Bt4.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button5:
                        if (i%2 == 0) {
                            Bt5.setText("O");
                        }
                        else {
                            Bt5.setText("X");
                        }
                        Bt5.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button6:
                        if (i%2 == 0) {
                            Bt6.setText("O");
                        }
                        else {
                            Bt6.setText("X");
                        }
                        Bt6.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button7:
                        if (i%2 == 0) {
                            Bt7.setText("O");
                        }
                        else {
                            Bt7.setText("X");
                        }
                        Bt7.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button8:
                        if (i%2 == 0) {
                            Bt8.setText("O");
                        }
                        else {
                            Bt8.setText("X");
                        }
                        Bt8.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button9:
                        if (i%2 == 0) {
                            Bt9.setText("O");
                        }
                        else {
                            Bt9.setText("X");
                        }
                        Bt9.setEnabled(false);
                        Tv1.setText(i%2 == 0 ? "X Turn" : "O Turn");
                        i++;
                        break;
                    case R.id.button10:
                        i=0;
                        Bt1.setText("");
                        Bt2.setText("");
                        Bt3.setText("");
                        Bt4.setText("");
                        Bt5.setText("");
                        Bt6.setText("");
                        Bt7.setText("");
                        Bt8.setText("");
                        Bt9.setText("");
                        Tv1.setText("O Turn");
                        Tv2.setText("Winner");
                        Bt1.setEnabled(true);
                        Bt2.setEnabled(true);
                        Bt3.setEnabled(true);
                        Bt4.setEnabled(true);
                        Bt5.setEnabled(true);
                        Bt6.setEnabled(true);
                        Bt7.setEnabled(true);
                        Bt8.setEnabled(true);
                        Bt9.setEnabled(true);
                        break;
                }
                if (    Bt1.getText()==Bt2.getText() && Bt2.getText()==Bt3.getText() && !Bt3.isEnabled() ||
                        Bt4.getText()==Bt5.getText() && Bt5.getText()==Bt6.getText() && !Bt6.isEnabled() ||
                        Bt7.getText()==Bt8.getText() && Bt8.getText()==Bt9.getText() && !Bt9.isEnabled() ||
                        Bt1.getText()==Bt4.getText() && Bt4.getText()==Bt7.getText() && !Bt7.isEnabled() ||
                        Bt2.getText()==Bt5.getText() && Bt5.getText()==Bt8.getText() && !Bt8.isEnabled() ||
                        Bt3.getText()==Bt6.getText() && Bt6.getText()==Bt9.getText() && !Bt9.isEnabled() ||
                        Bt1.getText()==Bt5.getText() && Bt5.getText()==Bt9.getText() && !Bt9.isEnabled() ||
                        Bt3.getText()==Bt5.getText() && Bt5.getText()==Bt7.getText() && !Bt7.isEnabled() ) {

                    Bt1.setEnabled(false);
                    Bt2.setEnabled(false);
                    Bt3.setEnabled(false);
                    Bt4.setEnabled(false);
                    Bt5.setEnabled(false);
                    Bt6.setEnabled(false);
                    Bt7.setEnabled(false);
                    Bt8.setEnabled(false);
                    Bt9.setEnabled(false);
                    Tv2.setText(i%2 == 0 ? "Winner is X" : "Winner is O");
                }
            }
        };

        Bt1.setOnClickListener(MulListener);
        Bt2.setOnClickListener(MulListener);
        Bt3.setOnClickListener(MulListener);
        Bt4.setOnClickListener(MulListener);
        Bt5.setOnClickListener(MulListener);
        Bt6.setOnClickListener(MulListener);
        Bt7.setOnClickListener(MulListener);
        Bt8.setOnClickListener(MulListener);
        Bt9.setOnClickListener(MulListener);
        Bt10.setOnClickListener(MulListener);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
