package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

import com.eftimoff.jokeandroidlibrary.JokesDescriptionActivity;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {

//    private MyApiStrange myApiService;
    private Context context;

    public EndpointsAsyncTask(Context context) {
        this.context = context;
//        myApiService = new MyApiStrange.Builder(new NetHttpTransport(), new AndroidJsonFactory(), null)
//                .setRootUrl("https://lunchly-02107.appspot.com/_ah/api/")
//                .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
//                    @Override
//                    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
//                        abstractGoogleClientRequest.setDisableGZipContent(true);
//                    }
//                }).build();
    }

    @Override
    protected String doInBackground(Context... params) {
//        try {
//            return myApiService.tellJoke().execute().getData();
//        } catch (IOException e) {
            return null;
//        }
    }

    @Override
    protected void onPostExecute(String result) {
        JokesDescriptionActivity.start(context, result);
    }
}