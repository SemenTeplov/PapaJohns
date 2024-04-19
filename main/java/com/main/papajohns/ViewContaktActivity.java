package com.main.papajohns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewContaktActivity extends AppCompatActivity {
    private TextView textViewHederCotntact;
    private TextView textViewCotntact;
    private ImageView imageViewCotntact;
    private OrdeList orderList = OrdeList.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contakt);

        initViews();
        showCard();
    }

    public static Intent newIntent(Context context,
                                   String headerName,
                                   int image,
                                   String description) {
        Intent intent = new Intent(context, ViewContaktActivity.class);
        intent.putExtra("HeaderName", headerName);
        intent.putExtra("Image", image);
        intent.putExtra("Description", description);

        return intent;
    }
    private void initViews() {
        textViewHederCotntact = findViewById(R.id.textViewHederCotntact);
        textViewCotntact = findViewById(R.id.textViewCotntact);
        imageViewCotntact = findViewById(R.id.imageViewCotntact);
    }
    private void showCard() {
        textViewHederCotntact.setText(getIntent().getStringExtra("HeaderName"));
        imageViewCotntact.setImageResource(getIntent().getIntExtra("Image", 0));
        textViewCotntact.setText(getIntent().getStringExtra("Description"));
    }
}