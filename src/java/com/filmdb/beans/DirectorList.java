package com.filmdb.beans;

import com.filmdb.db.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 
 * @author Andrew Karaushu <karandriy at gmail.com>
 *  I know, this code is piece of shit, but anyway, it works so i'm pleased
 */
public class DirectorList {
    private ArrayList<Director> directorList = new ArrayList<Director>();
    
    private ArrayList<Director> getDirectors() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Database.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from director order by name ");
                 while (rs.next())   {
                        Director director = new Director();
                        director.setName(rs.getString("name"));
                        directorList.add(director);
                    }
        } finally {
          //  if (conn!=null){conn.close();}
            if (stmt!=null){stmt.close();}
            if (rs!=null){rs.close();}
            
        }
        return directorList;
    }
    public ArrayList<Director> getDirectorsList() throws SQLException{
        if(!directorList.isEmpty()){
            return directorList;
        } else {
            return getDirectors();
        }
    }
}
