package com.main.papajohns;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonPizzas;
    private Button buttonPasta;
    private Button buttonStores;
    private Button buttonCreateOrder;
    private OrdeList orderList = OrdeList.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        buttonPizzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ListPizzasActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
        buttonPasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ListPastasActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
        buttonStores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ListStoresActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
        buttonCreateOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = OrderActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        buttonPizzas = findViewById(R.id.buttonPizzas);
        buttonPasta = findViewById(R.id.buttonPasta);
        buttonStores = findViewById(R.id.buttonStores);
        buttonCreateOrder = findViewById(R.id.buttonCreateOrder);
    }
}