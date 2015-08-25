package com.filmdb.beans;

import com.filmdb.db.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GenreList {

    private ArrayList<Genre> genreList = new ArrayList<Genre>();

    private ArrayList<Genre> getGenres() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Database.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from genre order by name");
            while (rs.next()) {
                Genre genre = new Genre();
                genre.setName(rs.getString("name"));
                genreList.add(genre);
            }

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
     //               if (conn != null) {
     //               conn.close();                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
            }

        }
        return genreList;
    }

    public ArrayList<Genre> getGenresList() throws SQLException {
        if (!genreList.isEmpty()) {
            return genreList;
        } else {
            return getGenres();
        }
    }
}
