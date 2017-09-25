package org.sergei.rest.swagger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sergei on 24.9.17.
 */
public class SwaggerUIServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/docs/index.html");

        /*RequestDispatcher rd = req.getRequestDispatcher("docs/index.html");
        rd.forward(req, resp);*/

//        String path = req.getRequestURI().substring(req.getContextPath().length());
//        String path = req.getRequestURI().substring("webapi/".length(), getReu)

//        req.getRequestDispatcher("/pages" + path).forward(req, resp);

    }
}
