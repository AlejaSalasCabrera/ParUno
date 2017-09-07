package com.i012114.paruno;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView boNa = (BottomNavigationView) findViewById(R.id.boNa_1);
        boNa.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_1:
                        PantallaUno p1= new PantallaUno();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fra_1,p1)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "Taller", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item_2:
                        PantallaDos p2= new PantallaDos();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fra_1,p2)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "Taller", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item_3:
                        PantallaTres p3= new PantallaTres();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fra_1,p3)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "Taller", Toast.LENGTH_SHORT).show();
                        break;
                }


                return false;
            }
        });

        FloatingActionButton mop =(FloatingActionButton) findViewById(R.id.fab_1);
        registerForContextMenu(mop);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Mis opciones");
        inflater.inflate(R.menu.menu, menu);
    }

}
