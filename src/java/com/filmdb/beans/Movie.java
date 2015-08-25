package com.filmdb.beans;

import java.util.ArrayList;

/**
 *
 * @author Andrew Karaushu <karandiy at gmail.com>
 */
public class Movie {

    private long id;
    private String name;
    private int year_id;
    private String starring;
    private ArrayList<String> genre = new ArrayList<>();
    private ArrayList<String> director = new ArrayList<>();
    private ArrayList<String> country = new ArrayList<>();
    private int budget;
    private String about_movie;
    private String kino_mark;
    private String off_site;
    private String trailer;
    private String duration;
    private String watch;
    private byte[] poster;

    public void setCountry(ArrayList<String> country) {
        this.country = country;
    }

    public ArrayList<String> getCountry() {
        return country;
    }

    public void setWatch(String watch) {
        this.watch = watch;
    }

    public String getWatch() {
        return watch;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear_id() {
        return year_id;
    }

    public String getStarring() {
        return starring;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public ArrayList<String> getDirector() {
        return director;
    }

    public int getBudget() {
        return budget;
    }

    public String getAbout_movie() {
        return about_movie;
    }

    public String getKino_mark() {
        return kino_mark;
    }

    public String getOff_site() {
        return off_site;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getDuration() {
        return duration;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear_id(int year_id) {
        this.year_id = year_id;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public void setDirector(ArrayList<String> director) {
        this.director = director;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setAbout_movie(String about_movie) {
        this.about_movie = about_movie;
    }

    public void setKino_mark(String kino_mark) {
        this.kino_mark = kino_mark;
    }

    public void setOff_site(String off_site) {
        this.off_site = off_site;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
