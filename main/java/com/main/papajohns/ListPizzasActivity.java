package com.main.papajohns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListPizzasActivity extends AppCompatActivity {
    private Database database = new Database();
    private LinearLayout linearLayoutHeadPizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizzas);

        initViews();
        showList();
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, ListPizzasActivity.class);
    }

    private void initViews() {
        linearLayoutHeadPizzas = findViewById(R.id.linearLayoutHeadPizzas);
    }
    private void showList() {
        for (ListItem item : database.GetPizzas()) {
            View view = getLayoutInflater().inflate(R.layout.note_item, linearLayoutHeadPizzas, false);
            TextView textViewNote = view.findViewById(R.id.textViewNote);
            textViewNote.setText(item.GetName());
            textViewNote.setOnClickListener(v -> {
                Intent intent = ViewProductActivity.newIntent(ListPizzasActivity.this,
                        item.GetName(),
                        item.GetImg(),
                        item.GetDescription());
                startActivity(intent);
            });

            linearLayoutHeadPizzas.addView(view);
        }
    }
}