package com.eftimoff.jokes.manager;

import java.util.List;

public interface JokesManager {

    List<String> loadJokes();

    String getRandomJoke();

}
