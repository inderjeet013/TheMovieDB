package com.example.gurteksingh.themoviedb;

import java.util.List;

public interface OnGetMoviesCallback {

        void onSuccess(int page,List<Movie> movies);

        void onError();

}
