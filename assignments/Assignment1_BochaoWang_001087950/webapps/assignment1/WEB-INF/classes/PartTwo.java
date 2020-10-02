import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;

public class PartTwo extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Enumeration<String> e = request.getHeaderNames();

        out.println("<HTML>");
        out.println("<BODY>");
        out.println("Headers"+"\n");
        
        while(e.hasMoreElements()){
            String param = (String) e.nextElement();
            out.println("<p>"+param+" : "+request.getHeader(param)+"</p>");
        }

        out.println("</BODY>");
        out.println("</HTML>");
    }
}