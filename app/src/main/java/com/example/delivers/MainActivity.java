package com.example.delivers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.delivers.Activities.ActivityListaDeEnderecos;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#191970")));
        setTitle("Delivre");

        configuraLista();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_meu_endereço){
            Intent intent = new Intent(MainActivity.this, ActivityListaDeEnderecos.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void configuraLista() {
        ListView listaDeParceiros = findViewById(R.id.lista_de_enderecos_listview);
        final List<Parceiro> parceiros = new ParceiroDAO().lista();
        listaDeParceiros.setAdapter(new AdapterListaParceiros(parceiros, this));

    }
}