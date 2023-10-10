package ies.jakartawebstarter;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
    public class HelloServlet extends HttpServlet 
    {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String username = request.getParameter("username");
            if (username == null)
                throw new NullPointerException("Não foi fornecido um username!");

            try {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Rodrigo Initialization</title>");
                out.println("</head>");
                out.println("<body>");

                out.println("<h2>");
                switch (username.toLowerCase()) {
                    case "verstappen":
                        out.println("Max, Max, Max! Super Max, Max! Super, Super Max!");
                        break;
                    case "hamilton":
                        out.println("Through goes Hamilton! Unbelievable stuff!");
                        break;
                    case "vettel":
                        out.println("But here comes Sebastian Vettel!");
                        break;
                    case "leclerc":
                        out.println("He won in Spa, he wins in Monza!");
                        break;
                    default:
                        out.println("Username não encontrado!");
                }
                out.print("</h2>");

                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        }
    }