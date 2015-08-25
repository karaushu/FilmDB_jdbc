<%-- 
    Document   : trailer
    Created on : 28.04.2015, 20:09:56
    Author     : andy
--%>
<%@page import="com.filmdb.beans.Movie"%>
<%@page import="com.filmdb.beans.MovieList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <ul>
                        <%MovieList movieList = new MovieList();
                            for (Movie movie : movieList.getMoviesList()){
                        %>        
                            
                        <li class='has-sub'><a href='#'><span><%=movie.getName()%></span></a>
                            <iframe width="560" height="315" src="<%=movie.getTrailer()%>" frameborder="0" allowfullscreen></iframe>
                                <%}%>
                </li>
            </ul>
       
    </body>
</html>
