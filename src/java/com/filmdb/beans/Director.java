package com.filmdb.beans;

/**
 *
 * @author Andrew Karaushu <karandriy at gmail.com>
 * I know, this code is piece of shit, but anyway, it works so i'm pleased
 */
public class Director {

    private String name;

    public Director() {
    }

    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
