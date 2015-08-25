package testjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class TestConnection {

    public void check() throws NamingException, SQLException {
        
            InitialContext inico = new InitialContext();
            DataSource ds =(DataSource) inico.lookup("jdbc/moviedb");
            Connection conn = ds.getConnection();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from movie");
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
            
        } 
        
    }
