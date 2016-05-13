package com.dainiak.servlets.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by adaynyak on 11.05.2016.
 */
public class FirstServlet extends HttpServlet {
   private static final Logger LOG = getLogger(FirstServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      LOG.debug("redirect to userList1");

//        request.getRequestDispatcher("/userList.jsp").forward(request, response);
        response.sendRedirect("index2.jsp");
    }
}
