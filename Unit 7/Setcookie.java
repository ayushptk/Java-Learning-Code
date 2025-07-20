import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SetServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        out.print("Welcome " + username + "<br>");

        // Create cookie with name="name" and value=username
        Cookie ck = new Cookie("name", n);

        // Set cookie expiry to 1 day (in seconds)
        ck.setMaxAge(60 * 60 * 24);
        response.addCookie(ck);

        // Create a form that submits to ReadServlet
        out.print("<form action='ReadServlet' method='POST'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");

        out.close();
    }
}
