package com.eftimoff.jokes.manager;

import com.eftimoff.jokes.models.Joke;

import java.util.List;

public interface JokesManager {

    List<Joke> loadJokes();
}
