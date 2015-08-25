package com.filmdb.beans;

import com.filmdb.db.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Andrew Karaushu
 */
public class MovieList {

    private ArrayList<Movie> movieList = new ArrayList<Movie>();

    private ArrayList<Movie> getMovies() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Database.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select m.id, m.name, m.year_id, m.starring, m.budget, m.about_movie, m.kino_mark, m.off_site, m.trailer, \n"
                    + "m.poster, m.watch, m.duration, d.name as director, g.name as genre, c.name as country\n"
                    + " from movie m, movie_director md, director d, genre g, movie_genre mg, movie_country mc, country c \n"
                    + "	where md.movie_director_id = m.id and md.director_id = d.id and mg.movie_id = m.id and mg.genre_id = g.id and mc.movie_country_id = m.id and mc.country_id = c.id\n"
                    + "	order by m.name");
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getLong("id"));
                movie.setName(rs.getString("name"));
                movie.setYear_id(rs.getInt("year_id"));
                movie.setStarring(rs.getString("starring"));
                movie.setDuration(rs.getString("duration"));
                movie.setBudget(rs.getInt("budget"));
                movie.setPoster(rs.getBytes("poster"));
                movie.setAbout_movie(rs.getString("about_movie"));
                movie.setKino_mark(rs.getString("kino_mark"));
                movie.setOff_site(rs.getString("off_site"));
                movie.setTrailer(rs.getString("trailer"));
                movie.setWatch(rs.getString("watch"));
                String director = rs.getString("director");
                String genre = rs.getString("genre");
                String country = rs.getString("country");
                if (movieList.contains(movie)) {
                    int index = movieList.indexOf(movie);
                    Movie exMovie = movieList.get(index);
                    if (!exMovie.getDirector().contains(director)) {
                        exMovie.getDirector().add(director);
                    }
                    if (!exMovie.getGenre().contains(genre)) {
                        exMovie.getGenre().add(genre);
                    }
                    if (!exMovie.getCountry().contains(country)) {
                        exMovie.getCountry().add(country);
                    }
                } else {
                    movieList.add(movie);
                    movie.getDirector().add(director);
                    movie.getGenre().add(genre);
                    movie.getCountry().add(country);
                }

            }
        } finally {
            //if (conn!=null){conn.close();}
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }

        }
        return movieList;
    }

    public ArrayList<Movie> getMoviesList() throws SQLException {
        if (!movieList.isEmpty()) {
            return movieList;
        } else {
            return getMovies();
        }
    }
}
