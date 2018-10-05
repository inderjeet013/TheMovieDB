package com.example.gurteksingh.themoviedb;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}
