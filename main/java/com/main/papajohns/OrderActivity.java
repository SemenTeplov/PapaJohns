package com.main.papajohns;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    private LinearLayout linearLayoutHeadPOrder;
    private OrdeList orderList = OrdeList.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        initViews();
        showList();
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, OrderActivity.class);
    }
    private void initViews() {
        linearLayoutHeadPOrder = findViewById(R.id.linearLayoutHeadPOrder);
    }
    private void showList() {
        linearLayoutHeadPOrder.removeAllViews();

        for (int i = 0; i < orderList.getItems().size(); i++) {
            String product = orderList.getItems().get(i).GetName();
            int index = i;

            View view = getLayoutInflater().inflate(R.layout.note_item, linearLayoutHeadPOrder, false);
            TextView textViewNote = view.findViewById(R.id.textViewNote);
            textViewNote.setText(product);

            textViewNote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    orderList.getItems().remove(index);
                    showList();
                }
            });

            linearLayoutHeadPOrder.addView(view);
        }
    }
}