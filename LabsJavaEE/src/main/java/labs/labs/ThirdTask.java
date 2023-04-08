package labs.labs;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ThirdTask")
public class ThirdTask extends HttpServlet{
    int number=0;
    @Serial
    private static final long serialVersionUID = 1L;
    private static final String CONTENT_TYPE =
            "text/html; charset=windows-1251";

    @Override
    public void init() throws ServletException {}
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {


        number=number+1;
        String result= Integer.toString(number);


        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Third task</title></head>");
        out.println("<body>");
        out.println("<form method='post'>");
        out.println(result);
        out.println("<br><br>");
        out.println("<input type='submit' name='Submit' value='Submit'>");
        out.println("</form>");
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
