
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
public class CountryList {
    private ArrayList<Country> countryList = new ArrayList<Country>();
    private ArrayList<Country> getCountrys() throws SQLException{
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Database.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from country order by name");
            while (rs.next()){
                Country country = new Country();
                country.setName(rs.getString("name"));
                countryList.add(country);
            }
        } finally {
            try{
            if (stmt!=null){stmt.close();}
            if (rs!=null){rs.close();}
           // if (conn!=null){conn.close();}
            } catch (SQLException ex) {
            }
        }
         return countryList; 
    }
}

