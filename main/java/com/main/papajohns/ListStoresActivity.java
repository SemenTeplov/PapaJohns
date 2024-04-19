package com.main.papajohns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListStoresActivity extends AppCompatActivity {
    private Database database = new Database();
    private LinearLayout linearLayoutHeadStores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_stores);

        initViews();
        showList();
    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ListStoresActivity.class);

        return intent;
    }
    private void initViews() {
        linearLayoutHeadStores = findViewById(R.id.linearLayoutHeadStores);
    }
    private void showList() {
        for (ListItem item : database.GetStores()) {
            View view = getLayoutInflater().inflate(R.layout.note_item, linearLayoutHeadStores, false);
            TextView textViewNote = view.findViewById(R.id.textViewNote);
            textViewNote.setText(item.GetName());
            textViewNote.setOnClickListener(v -> {
                Intent intent = ViewContaktActivity.newIntent(ListStoresActivity.this,
                        item.GetName(),
                        item.GetImg(),
                        item.GetDescription());
                startActivity(intent);
            });

            linearLayoutHeadStores.addView(view);
        }
    }
}