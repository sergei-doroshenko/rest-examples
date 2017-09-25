package org.sergei.rest.swagger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sergei on 24.9.17.
 */
public class SwaggerUIServlet extends HttpServlet {

    private static Logger logger = Logger.getAnonymousLogger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            forward(req, resp);
        } catch (ServletException | IOException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    /* Redirect approach */
    private void redirect(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/docs/index.html");
    }

    /* Froward approach */
    private void forward(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI().substring(req.getServletPath().length() - "docs".length());
        if ("docs".equals(path)) {
            path = "docs" + "/index.html";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/" + path);
        dispatcher.forward(req, resp);
    }
}
