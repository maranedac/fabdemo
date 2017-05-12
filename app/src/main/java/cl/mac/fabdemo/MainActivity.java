package cl.mac.fabdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private FloatingActionButton main, second, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        
        main = (FloatingActionButton) findViewById(R.id.mainFab);
        second = (FloatingActionButton) findViewById(R.id.secondFab);
        third = (FloatingActionButton) findViewById(R.id.thirdFab);
        
        
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (main.getRotation() != 0){  //si la rotacion ya ocurrio, la escondemos
                    hideFabs();
                }else{
                    showFabs();
                }
            }
        });
        
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Im sad :(", Toast.LENGTH_SHORT).show();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I'm happy :)", Toast.LENGTH_SHORT).show();
            }
        });

    }
    
    
    private void showFabs(){
        main.animate().rotation(45).setDuration(400).start(); //con esto ya gire el primer fab
        second.animate().translationY(-200).setDuration(600).start();
        third.animate().translationY(-400).setDuration(800).start();
    }
    
    private void hideFabs(){
        main.animate().rotation(0).setDuration(400).start(); //con esto ya gire el primer fab
        second.animate().translationY(0).setDuration(600).start();
        third.animate().translationY(0).setDuration(800).start();
        
        
    }
    
    

   
}
