package com.eftimoff.jokes.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesManagerImpl implements JokesManager {

    private List<String> jokes = new ArrayList<>();
    private Random random = new Random();

    public JokesManagerImpl() {
        jokes.add("My ex used to hit me with stringed instruments. If only I had known about her history of violins.");
        jokes.add("Did you hear about the 2 silk worms in a race? It ended in a tie!");
        jokes.add("Someone stole my toilet and the police have nothing to go on.");
    }

    @Override
    public List<String> loadJokes() {
        return jokes;
    }

    @Override
    public String getRandomJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}
