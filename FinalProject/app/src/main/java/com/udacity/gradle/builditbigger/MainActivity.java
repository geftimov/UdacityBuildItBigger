package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.eftimoff.jokes.manager.JokesManager;
import com.eftimoff.jokes.manager.JokesManagerImpl;
import com.eftimoff.jokes.models.Joke;

import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private JokesManager jokesManager;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokesManager = new JokesManagerImpl();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        List<Joke> jokes = jokesManager.loadJokes();
        Joke joke = jokes.get(random.nextInt(jokes.size()));

        Toast.makeText(this, joke.getDescription(), Toast.LENGTH_LONG).show();
    }


}
