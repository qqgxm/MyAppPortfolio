package com.example.gxm.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button popularmovies_btn;
    private Button stockhawk_btn;
    private Button builditbigger_btn;
    private Button makeyourapp_btn;
    private Button goubiquitous_btn;
    private Button capstone_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popularmovies_btn = (Button) findViewById(R.id.button);
        stockhawk_btn = (Button) findViewById(R.id.button2);
        builditbigger_btn = (Button) findViewById(R.id.button3);
        makeyourapp_btn = (Button) findViewById(R.id.button4);
        goubiquitous_btn = (Button) findViewById(R.id.button5);
        capstone_btn = (Button) findViewById(R.id.button6);

        popularmovies_btn.setOnClickListener(this);
        stockhawk_btn.setOnClickListener(this);
        builditbigger_btn.setOnClickListener(this);
        makeyourapp_btn.setOnClickListener(this);
        goubiquitous_btn.setOnClickListener(this);
        capstone_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                showToastPopularMovies(view);
                break;
            case R.id.button2:
                showToastStockhawk(view);
                break;
            case R.id.button3:
                showToastBuildItBigger(view);
                break;
            case R.id.button4:
                showToastMakeYourApp(view);
                break;
            case R.id.button5:
                showToastGoUbiquitous(view);
                break;
            case R.id.button6:
                showToastCapstone(view);
                break;
        }
    }

    private void showToastPopularMovies(View view){
        Toast toast = Toast.makeText(this,"Popular Movies Message!",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showToastStockhawk(View view){
        Toast toast = Toast.makeText(this,"Stock Hawk Message!",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showToastBuildItBigger(View view){
        Toast toast = Toast.makeText(this,"Build It Bigger Message!",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showToastMakeYourApp(View view){
        Toast toast = Toast.makeText(this,"Make Your Apps Message!",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showToastGoUbiquitous(View view){
        Toast toast = Toast.makeText(this,"Go Ubiquitous Message!",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showToastCapstone(View view){
        Toast toast = Toast.makeText(this,"Capstone Message!",Toast.LENGTH_SHORT);
        toast.show();
    }
}
