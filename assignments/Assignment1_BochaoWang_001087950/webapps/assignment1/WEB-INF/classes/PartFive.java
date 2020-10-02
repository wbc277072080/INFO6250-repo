import java.io.File;
import java.net.URL;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.lang.reflect.Method;
import java.util.*;

public class PartFive extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<BODY>");
        // create class object 
        Class classobj = HttpServlet.class; 
    

        out.println("All getX() methods(Include inherited methods) of HttpServlet class: ");
        Method[] methods = classobj.getMethods(); 
        for (Method method : methods) { 

            String MethodName = method.getName(); 
            if(MethodName.startsWith("get") && !MethodName.equals("getClass")){
                out.println("<p>"+ MethodName+"</p>");
                if(MethodName.equals("getInitParameterNames")){
                    out.println("<p>"+"output: "+ getInitParameterNames() +"</p>");
                }
                if(MethodName.equals("getInitParameter")){
                    out.println("<p>"+"output: "+ getInitParameter("util") +"</p>");
                }
                if(MethodName.equals("getServletName")){
                    out.println("<p>"+"output: "+ getServletName() +"</p>");
                }
                if(MethodName.equals("getServletContext")){
                    out.println("<p>"+"output: "+ getServletContext() +"</p>");
                }
                if(MethodName.equals("getServletContext")){
                    out.println("<p>"+"output: "+ getServletConfig() +"</p>");
                }
                if(MethodName.equals("getServletInfo")){
                    out.println("<p>"+"output: "+ getServletInfo() +"</p>");
                }
                if(MethodName.equals("getServletConfig")){
                    out.println("<p>"+"output: "+ getServletConfig() +"</p>");
                }



                
            }
            
                     
        }
        out.println("<br>");
        out.println("<br>");
        out.println("All Own getX() methods of HttpServlet class: ");
        
        
        Method[] methodsOwn = classobj.getDeclaredMethods();
        for (Method method : methodsOwn) { 

            String MethodName = method.getName(); 
            if(MethodName.startsWith("get") && !MethodName.equals("getAllDeclaredMethods")){
                out.println("<p>"+ MethodName+"</p>");   
            }
            if(MethodName.equals("getLastModified")){
                out.println("<p>"+"output: "+ getLastModified(request) +"</p>");
            }
                     
        } 

        out.println("</BODY>");
        out.println("</HTML>");
    
    }



}