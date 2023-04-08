package labs.labs;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstTask")
public class FirstTask extends HttpServlet{

    @Serial
    private static final long serialVersionUID = 1L;
    private static final String CONTENT_TYPE =
            "text/html; charset=windows-1251";

    @Override
    public void init() throws ServletException {}

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>First Task</title></head>");
        out.println("<h1>First task</h1>");
        out.println("<p> Input field </p>");
        out.println("<input type=\"text\">");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public void destroy() {}
}
