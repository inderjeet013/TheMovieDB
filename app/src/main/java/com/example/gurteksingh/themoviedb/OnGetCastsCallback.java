package com.example.gurteksingh.themoviedb;

import java.util.List;

public interface OnGetCastsCallback {
    void onSuccess(List<Cast> casts);

    void onError();
}
