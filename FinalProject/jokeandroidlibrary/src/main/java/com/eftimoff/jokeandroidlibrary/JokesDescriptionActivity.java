package com.eftimoff.jokeandroidlibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesDescriptionActivity extends AppCompatActivity {

    private static final String EXTRA_JOKE = "extra_joke";

    public static void start(Context context, String joke) {
        Intent starter = new Intent(context, JokesDescriptionActivity.class);
        starter.putExtra(EXTRA_JOKE, joke);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_description);
        TextView jokeTextView = findViewById(R.id.joke);
        jokeTextView.setText(getJoke());
    }


    private String getJoke() {
        return getIntent().getStringExtra(EXTRA_JOKE);
    }
}
