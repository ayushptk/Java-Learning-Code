import javax.servlet.*;
import java.io.*;

public class MyServlet implements Servlet {
    public void init(ServletConfig config) {}
    
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello Servlet");
    }

    public void destroy() {}
    public ServletConfig getServletConfig() { return null; }
    public String getServletInfo() { return null; }
}
