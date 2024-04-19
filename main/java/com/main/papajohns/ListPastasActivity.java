package com.main.papajohns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListPastasActivity extends AppCompatActivity {
    private Database database = new Database();
    private LinearLayout linearLayoutHeadPasta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pastas);

        initViews();
        showList();
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, ListPastasActivity.class);
    }
    private void initViews() {
        linearLayoutHeadPasta = findViewById(R.id.linearLayoutHeadPasta);
    }
    private void showList() {
        for (ListItem item : database.GetPastas()) {
            View view = getLayoutInflater().inflate(R.layout.note_item, linearLayoutHeadPasta, false);
            TextView textViewNote = view.findViewById(R.id.textViewNote);
            textViewNote.setText(item.GetName());
            textViewNote.setOnClickListener(v -> {
                Intent intent = ViewProductActivity.newIntent(ListPastasActivity.this,
                        item.GetName(),
                        item.GetImg(),
                        item.GetDescription());
                startActivity(intent);
            });

            linearLayoutHeadPasta.addView(view);
        }
    }
}