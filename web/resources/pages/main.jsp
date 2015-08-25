<%@page import="com.filmdb.servlets.ShowPoster"%>
<%@page import="com.filmdb.beans.Movie"%>
<%@page import="com.filmdb.beans.Movie"%>
<%@page import="com.filmdb.beans.MovieList"%>
<%@page import="com.filmdb.beans.Genre"%>
<%@page import="com.filmdb.beans.GenreList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>

        <title>FilmDB</title>
        <link rel="stylesheet" href="../styles/stule_main_test_1.css"/>
        <link rel="stylesheet" href="../styles/style_movie_list.css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" type="text/css" href="../styles/normalize.css" />
        <link rel="stylesheet" type="text/css" href="../styles/search_style.css" />
        <link rel="stylesheet" type="text/css" href="../styles/style_genres.css" />
        <script src="../js/modernizr.custom.js"></script>
        <script src="../js/button_tralier.js"></script>
    </head>
    <body>
        <ul class="menu">
            <li title="home"><a href="#" class="menu-button home">Home</a></li>
            <li title="search"><a id="trigger-search" href="#" class="search">search</a></li>
            <li title="genres"><a id="trigger-genres" href="#" class="genres">genres</a></li>
            <li title="ratting"><a href="#" class="ratting">ratting</a></li>
            <li title="settings"><a href="#" class="settings">settings</a></li>
            <li title="about us"><a href="#" class="about_us">about us</a></li>
        </ul>
        <div class="body_container">
            <section class="list-container">
               
                <ul class="movies_list">
                    <%MovieList movieList = new MovieList();
                    for(Movie movie: movieList.getMoviesList()){ %>
                    <li class="poster_container">
                        <div class="film">
                            <h3><%=movie.getName()%></h3>
                            <h4>Режиссер:</h4>
                            <%String directors = movie.getDirector().toString();%>
                            <p><%=directors.substring(1, directors.length()-1)%></p>
                            <h4>Жанр:</h4>
                            <%String genres = movie.getGenre().toString();%>
                            <p><%=genres.substring(1, genres.length()-1)%></p>
                            <h4>Год:</h4>
                            <p><%=movie.getYear_id()%></p>
                            <h4>Страна:</h4>
                            <%String countries = movie.getCountry().toString();%>
                            <p><%=countries.substring(1, countries.length()-1)%></p>

                            <a href="<%=movie.getTrailer()%>" target="_blank" class="pcv_button">Трейлер</a>
                            <a href="#" class="pcv_button">Детали</a>
                        </div>
                            <img src="<%=request.getContextPath()%>/ShowPoster=<%=movie.getPoster()%>" />
                    </li>
                    <%}%>
                    <li class="poster_container">
                        <div class="film">
                            <h3>500 Дней лета</h3>
                            <h4>Режиссер:</h4>
                            <p>Василев Василий</p>
                            <h4>Жанр:</h4>
                            <p>Комедия, мелодрама</p>
                            <h4>Год:</h4>
                            <p>2009</p>
                            <h4>Страна:</h4>
                            <p>США</p>

                            <a href="https://www.youtube.com/embed/PsD0NpFSADM" target="_blank" class="pcv_button">Трейлер</a>
                            <a href="#" class="pcv_button">Детали</a>
                        </div>
                        <img src="../images/500daysummer.jpg" />
                    </li>
                    <li class="poster_container">
                        <div class="film">
                            <h3>500 Дней лета</h3>
                            <h4>Режиссер:</h4>
                            <p>Василев Василий</p>
                            <h4>Жанр:</h4>
                            <p>Комедия, мелодрама</p>
                            <h4>Год:</h4>
                            <p>2009</p>
                            <h4>Страна:</h4>
                            <p>США</p>
                        </div>
                        <img src="../images/the-intouchables-movie-poster1.jpg" />
                    </li>
                    <li class="poster_container">
                        <div class="film">
                            <h3>500 Дней лета</h3>
                            <h4>Режиссер:</h4>
                            <p>Василев Василий</p>
                            <h4>Жанр:</h4>
                            <p>Комедия, мелодрама</p>
                            <h4>Год:</h4>
                            <p>2009</p>
                            <h4>Страна:</h4>
                            <p>США</p>
                            <div class="loadiframe">
                                <button id="b1" data-src="https://www.youtube.com/embed/PsD0NpFSADM" data-width="560" data-height="315">Button 1</button>
                            </div>

                        </div>
                        <img src="../images/wall_e.jpg" />
                    </li>
                    <li class="poster_container">
                        <div class="film">
                            <h3>500 Дней лета</h3>
                            <h4>Режиссер:</h4>
                            <p>Василев Василий</p>
                            <h4>Жанр:</h4>
                            <p>Комедия, мелодрама</p>
                            <h4>Год:</h4>
                            <p>2009</p>
                            <h4>Страна:</h4>
                            <p>США</p>
                        </div>
                        <img src="../images/wallefinal.jpg" />
                    </li>
                    <li class="poster_container">
                        <div class="film">
                            <h3>Мартовкие иды</h3>
                            <h4>Режиссер:</h4>
                            <p>Иванов Иван</p>
                            <h4>Жанр:</h4>
                            <p>Драма, Криминал</p>
                            <h4>Год:</h4>
                            <p>2011</p>
                            <h4>Страна:</h4>
                            <p>США, Канада</p>
                        </div>
                        <img src="../images/fracture.jpg" />
                    </li>
                    <li class="poster_container">
                        <div class="film">
                            <h3>Мартовкие иды</h3>
                            <h4>Режиссер:</h4>
                            <p>Иванов Иван</p>
                            <h4>Жанр:</h4>
                            <p>Драма, Криминал</p>
                            <h4>Год:</h4>
                            <p>2011</p>
                            <h4>Страна:</h4>
                            <p>США, Канада</p>
                        </div>
                        <img src="../images/idesofmarch.jpg" />
                    </li>
                    <li class="poster_container">
                        <div class="film">
                            <h3>Мартовкие иды</h3>
                            <h4>Режиссер:</h4>
                            <p>Иванов Иван</p>
                            <h4>Жанр:</h4>
                            <p>Драма, Криминал</p>
                            <h4>Год:</h4>
                            <p>2011</p>
                            <h4>Страна:</h4>
                            <p>США, Канада</p>
                        </div>
                        <img src="../images/idesofmarch.jpg" />
                    </li>

                </ul><!-- Конец .movies_list -->
            </section><!-- Конец .list-container -->

        </div>

        <iframe id='frame' frameborder="0" scrolling="no" width="560" height="315" allowfullscreen></iframe>
        <a href="#" class="back-to-top" style="display: inline;">
            <i class="fa fa-arrow-circle-up"></i>
        </a>
        <div class="overlay overlay-slidedown">
            <button type="button" class="overlay-close">Close</button>
            <nav>
                <form class="search-form">
                    <input class="search-input" type="search" placeholder="Search..."/>
                    <button class="search-submit" type="submit">Search</button>
                    <ul><li><select name="search_option">
                                <option>Movie</option>
                                <option>Genre</option>
                                <option>Director</option>
                                <option>Year</option>
                                <option>Country</option>
                            </select>
                        </li>	
                    </ul>
                </form>

            </nav>
        </div>
        <div class="overlay-genres overlay-slide-genres">
            <button type="button" class="overlay-close">Close</button>
            <nav>			
                <ul><%GenreList genreList = new GenreList();
                            for (Genre genre : genreList.getGenresList()){
                        %>        
                            
                        <li class='has-sub'><a href='#'><span><%=genre.getName()%></span></a>
                                <%}%></li>	
                </ul>


            </nav>
        </div>

        <script src="../js/classie.js"></script>
        <script src="../js/search_btn.js"></script>
        <script src="../js/genres_btn.js"></script>
    </body>
</html>