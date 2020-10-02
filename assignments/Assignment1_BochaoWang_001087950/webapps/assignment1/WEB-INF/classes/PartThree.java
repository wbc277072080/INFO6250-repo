import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import java.util.Enumeration;



public class PartThree extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        String passwordConfirmed = request.getParameter("PasswordConfirmed");
        String picPath = request.getParameter("PicPath");
        String gender = request.getParameter("Gender");
        String country = request.getParameter("Country");
        String hobby = request.getParameter("Hobby");
        String address = request.getParameter("Address");



        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Form Details");
        out.println("</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<p> Email is: "+email+"</p>");
        out.println("<p> Password is: "+password+"</p>");
        out.println("<p> Confirmed Password is: "+passwordConfirmed+"</p>");
        out.println("<p> Gender is: "+gender+"</p>");
        out.println("<p> Picture Path is: "+picPath+"</p>");
        out.println("<p> Country is: "+country+"</p>");
        out.println("<p> Hobby is: "+hobby+"</p>");
        out.println("<p> Address is: "+address+"</p>");

        out.println("</body>");

        out.println("</html>");
        out.close();
    }
}
