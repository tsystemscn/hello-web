package com.tsystems.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public String sayHi(String message) {
        LOG.info( "sayHi -> Hello " + message);
        return "Hello " + message;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<title>Index</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World.</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    public static void main( String[] args ) {
        App app = new App();
        app.sayHi("Maven");
    }
}
