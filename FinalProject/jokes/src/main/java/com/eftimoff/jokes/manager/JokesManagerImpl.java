package com.eftimoff.jokes.manager;

import com.eftimoff.jokes.models.Joke;

import java.util.ArrayList;
import java.util.List;

public class JokesManagerImpl implements JokesManager {

    private List<Joke> jokes = new ArrayList<>();

    public JokesManagerImpl() {
        jokes.add(new Joke("String Fight", "My ex used to hit me with stringed instruments. If only I had known about her history of violins."));
        jokes.add(new Joke("Silk Ties", "Did you hear about the 2 silk worms in a race? It ended in a tie!"));
        jokes.add(new Joke("Police Investigation", "Someone stole my toilet and the police have nothing to go on."));
    }

    @Override
    public List<Joke> loadJokes() {
        return jokes;
    }
}
