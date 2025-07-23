import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SetCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Cookie cookie = new Cookie("username", "Ayush");
        cookie.setMaxAge(3600); // 1 hour
        res.addCookie(cookie);

        out.println("Cookie set successfully!");
    }
}
