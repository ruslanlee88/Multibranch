package id.co.ant;

// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Map;

// Extend HttpServlet class
public class Welcome extends HttpServlet {
 
   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "ANT-Welcome to CI/CD course--Servlet";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");

      Map<String, String> env = System.getenv();
      for (String envName : env.keySet()) {
            out.println ("Environment name: " + envName + "Value: "+ env.get(envName) + "<BR>");
      }
   }
   public void destroy() {
      // do nothing.
   }
}