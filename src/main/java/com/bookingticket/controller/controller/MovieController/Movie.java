package com.bookingticket.controller.controller.MovieController;

import com.bookingticket.controller.dao.MovieDao;
import com.bookingticket.controller.service.Impl.MovieServiceImpl;
import com.bookingticket.controller.service.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/movie")
public class Movie extends HttpServlet {
    MovieService movieService;
    MovieDao movieDao;

    public Movie() {
        this.movieDao = movieDao;
        this.movieService = new MovieServiceImpl(movieDao);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test");
    }
}
