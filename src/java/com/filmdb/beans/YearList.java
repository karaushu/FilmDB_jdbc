
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
public class YearList {
    private ArrayList<Year> yearList = new ArrayList<Year>();
    
    private ArrayList<Year> getYears() throws SQLException {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try{
            conn = Database.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from year order by yaer");
            while (rs.next()) {
                Year year = new Year();
                year.setYear(rs.getInt("year"));
                yearList.add(year);
            }
        } finally {
            try{
                if (stat!=null){stat.close();}
                if (rs!=null){rs.close();}
            //  if (conn!=null){conn.close();}
            } catch (SQLException ex) {
            }
        }
        return yearList;
    }  

}
