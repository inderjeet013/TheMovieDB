package com.example.gurteksingh.themoviedb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cast {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("character")
    @Expose
    private String character;

    @SerializedName("profile_path")
    @Expose
    private String profilePath;

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String id) {
        this.character = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePath() {
        return "https://image.tmdb.org/t/p/w185"+ profilePath;
    }

    public void setProfilePath(String posterPath) {
        this.profilePath = posterPath;
    }
}
