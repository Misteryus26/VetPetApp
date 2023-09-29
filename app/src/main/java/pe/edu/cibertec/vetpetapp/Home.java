package pe.edu.cibertec.vetpetapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(
                new BottomNavigationView.OnItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.nav_item1:
                                //startActivity(new Intent(Home.this, Home.class));
                                return true;
                            case R.id.nav_item2:
                                // Abrir la actividad del segundo tab
                                //startActivity(new Intent(Home.this, SegundoTabActivity.class));
                                return true;
                            case R.id.nav_item3:
                                // Abrir la actividad del tercer tab
                               // startActivity(new Intent(Home.this, TercerTabActivity.class));
                                return true;
                            case R.id.nav_item4:
                                // Abrir la actividad de notificaciones
                                //startActivity(new Intent(Home.this, Notificaciones.class));
                                return true;
                            case R.id.nav_item5:
                                // Abrir la actividad de perfil
                                //startActivity(new Intent(Home.this, Perfil.class));
                                return true;
                        }
                        return false;
                    }
                });
    }
}