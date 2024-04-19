package com.main.papajohns;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewProductActivity extends AppCompatActivity {
    private TextView textViewHederProduct;
    private TextView textViewProduct;
    private ImageView imageViewProduct;
    private Button buttonProduction;
    private OrdeList orderList = OrdeList.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        initViews();
        showCard();

        buttonProduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderList.add(new ListItem(
                        orderList.getItems().size(),
                        getIntent().getStringExtra("HeaderName"),
                        getIntent().getIntExtra("Image", 0),
                        getIntent().getStringExtra("Description")));
            }
        });
    }

    public static Intent newIntent(Context context,
                                   String headerName,
                                   int image,
                                   String description) {
        Intent intent = new Intent(context, ViewProductActivity.class);
        intent.putExtra("HeaderName", headerName);
        intent.putExtra("Image", image);
        intent.putExtra("Description", description);

        return intent;
    }
    private void initViews() {
        textViewHederProduct = findViewById(R.id.textViewHederProduct);
        textViewProduct = findViewById(R.id.textViewProduct);
        imageViewProduct = findViewById(R.id.imageViewProduct);
        buttonProduction = findViewById(R.id.buttonProduction);
    }
    private void showCard() {
        textViewHederProduct.setText(getIntent().getStringExtra("HeaderName"));
        imageViewProduct.setImageResource(getIntent().getIntExtra("Image", 0));
        textViewProduct.setText(getIntent().getStringExtra("Description"));
    }
}