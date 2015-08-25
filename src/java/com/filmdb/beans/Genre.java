package com.filmdb.beans;
/**
 * 
 * @author Andrew Karauhsu
 */
public class Genre {

    public Genre() {
    }
   private String name;
   
   public Genre(String name){
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
