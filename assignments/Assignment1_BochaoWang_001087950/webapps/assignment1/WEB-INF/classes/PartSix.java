import java.io.File;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.lang.reflect.Method;
import java.util.*;

public class PartSix extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<BODY>");
        // create class object 
        Class classobj = HttpServletRequest.class; 
    

        out.println("All getX() methods(Include inherited methods) of HttpServlet class: ");
        Method[] methods = classobj.getMethods(); 
        for (Method method : methods) { 

            String MethodName = method.getName(); 
            if(MethodName.startsWith("get")){
                out.println("<p>"+ MethodName+"</p>");   
                if(MethodName.equals("getMethod")){
                    out.println("<p>"+"output: "+ request.getMethod() +"</p>");

                }
                if(MethodName.equals("getMethod")){
                    out.println("<p>"+"output: "+ request.getMethod() +"</p>");
                } 
                if(MethodName.equals("getHeader")){
                    out.println("<p>"+"output: "+ request.getHeader("local") +"</p>");
                } 
                if(MethodName.equals("getHeaders")){
                    out.println("<p>"+"output: "+ request.getHeaders("local") +"</p>");
                } 
                if(MethodName.equals("getCookies")){
                    out.println("<p>"+"output: "+ request.getCookies() +"</p>");
                }
                if(MethodName.equals("getTrailerFields")){
                    out.println("<p>"+"output: "+ request.getTrailerFields() +"</p>");
                }
                if(MethodName.equals("getAuthType")){
                    out.println("<p>"+"output: "+ request.getAuthType() +"</p>");
                }
                if(MethodName.equals("getContextPath")){
                    out.println("<p>"+"output: "+ request.getContextPath() +"</p>");
                }
                if(MethodName.equals("getDateHeader")){
                    out.println("<p>"+"output: "+ request.getDateHeader("localhost") +"</p>");
                }
                if(MethodName.equals("getHeaderNames")){
                    out.println("<p>"+"output: "+ request.getHeaderNames() +"</p>");
                }
                if(MethodName.equals("getIntHeader")){
                    out.println("<p>"+"output: "+ request.getIntHeader("x-forwarded-proto") +"</p>");
                }
                if(MethodName.equals("getHttpServletMapping")){
                    out.println("<p>"+"output: "+ request.getHttpServletMapping() +"</p>");
                }
                if(MethodName.equals("getPathInfo")){
                    out.println("<p>"+"output: "+ request.getPathInfo() +"</p>");
                }

                if(MethodName.equals("getPathTranslated")){
                    out.println("<p>"+"output: "+ request.getPathTranslated() +"</p>");
                }
                if(MethodName.equals("getRemoteUser")){
                    out.println("<p>"+"output: "+ request.getRemoteUser() +"</p>");
                }
                if(MethodName.equals("getRequestedSessionId")){
                    out.println("<p>"+"output: "+ request.getRequestedSessionId() +"</p>");
                }
                if(MethodName.equals("getRequestURI")){
                    out.println("<p>"+"output: "+ request.getRequestURI() +"</p>");
                    out.println("<p>"+"output: "+ request.getRequestURI() +"</p>");
                }
                // if(MethodName.equals("getParts")){
                //     out.println("<p>"+"output: "+ request.getParts() +"</p>");
                // }
                // if(MethodName.equals("getPart")){
                //     out.println("<p>"+"output: "+ request.getPart("part") +"</p>");
                // }
                if(MethodName.equals("getSession")){
                    out.println("<p>"+"output: "+ request.getSession() +"</p>");
                    out.println("<p>"+"output: "+ request.getSession(true) +"</p>");
                } 
                if(MethodName.equals("getQueryString")){
                    out.println("<p>"+"output: "+ request.getQueryString() +"</p>");
                }


                if(MethodName.equals("getProtocol")){
                    out.println("<p>"+"output: "+ request.getProtocol() +"</p>");
                }

                if(MethodName.equals("getScheme")){
                    out.println("<p>"+"output: "+ request.getScheme() +"</p>");
                }

                if(MethodName.equals("getInputStream")){
                    out.println("<p>"+"output: "+ request.getInputStream() +"</p>");
                }
                if(MethodName.equals("getLocalPort")){
                    out.println("<p>"+"output: "+ request.getLocalPort() +"</p>");
                }
                if(MethodName.equals("getLocale")){
                    out.println("<p>"+"output: "+ request.getLocale() +"</p>");
                }
                if(MethodName.equals("getContentLengthLong")){
                    out.println("<p>"+"output: "+ request.getContentLengthLong() +"</p>");
                }
                if(MethodName.equals("getContentType")){
                    out.println("<p>"+"output: "+ request.getContentType() +"</p>");
                }
                if(MethodName.equals("getLocalName")){
                    out.println("<p>"+"output: "+ request.getLocalName() +"</p>");
                }
                if(MethodName.equals("getServletContext")){
                    out.println("<p>"+"output: "+ request.getServletContext() +"</p>");
                }
                if(MethodName.equals("getRealPath")){
                    out.println("<p>"+"output: </p>");
                }
                if(MethodName.equals("getAttributeNames")){
                    out.println("<p>"+"output: "+ request.getAttributeNames() +"</p>");
                }
                if(MethodName.equals("getCharacterEncoding")){
                    out.println("<p>"+"output: "+ request.getCharacterEncoding() +"</p>");
                }
                if(MethodName.equals("getLocales")){
                    out.println("<p>"+"output: "+ request.getLocales() +"</p>");
                }
                if(MethodName.equals("getParameter")){
                    out.println("<p>"+"output: "+ request.getParameter("host") +"</p>");
                }
                if(MethodName.equals("getParameterMap")){
                    out.println("<p>"+"output: "+ request.getParameterMap() +"</p>");
                }
                if(MethodName.equals("getParameterNames")){
                    out.println("<p>"+"output: "+ request.getParameterNames() +"</p>");
                }
                if(MethodName.equals("getParameterValues")){
                    out.println("<p>"+"output: "+ request.getParameterValues("host") +"</p>");
                }
                // if(MethodName.equals("getReader")){
                //     out.println("<p>"+"output: "+ request.getReader() +"</p>");
                // }
                if(MethodName.equals("getRemoteAddr")){
                    out.println("<p>"+"output: "+ request.getRemoteAddr() +"</p>");
                }
                if(MethodName.equals("getRemoteHost")){
                    out.println("<p>"+"output: "+ request.getRemoteHost() +"</p>");
                }
                if(MethodName.equals("getRemotePort")){
                    out.println("<p>"+"output: "+ request.getRemotePort() +"</p>");
                }
                if(MethodName.equals("getLocalAddr")){
                    out.println("<p>"+"output: "+ request.getLocalAddr() +"</p>");
                }
                if(MethodName.equals("getRequestDispatcher")){
                    out.println("<p>"+"output: "+ request.getRequestDispatcher("servlet") +"</p>");
                }
                if(MethodName.equals("getServerName")){
                    out.println("<p>"+"output: "+ request.getServerName() +"</p>");
                }
                if(MethodName.equals("getServerPort")){
                    out.println("<p>"+"output: "+ request.getServerPort() +"</p>");
                }
                // if(MethodName.equals("getAsyncContext")){
                //     out.println("<p>"+"output: "+ request.getAsyncContext() +"</p>");
                // }
                if(MethodName.equals("getDispatcherType")){
                    out.println("<p>"+"output: "+ request.getDispatcherType() +"</p>");
                }
                if(MethodName.equals("getContentLength")){
                    out.println("<p>"+"output: "+ request.getContentLength() +"</p>");
                }
                if(MethodName.equals("getAttribute")){
                    out.println("<p>"+"output: "+ request.getAttribute(MethodName) +"</p>");
                }
            }
                     
        }
        out.println("<br>");
        out.println("<br>");
        out.println("All Own getX() methods of HttpServlet class: ");
        
        
        Method[] methodsOwn = classobj.getDeclaredMethods();
        for (Method method : methodsOwn) { 

            String MethodName = method.getName(); 
            if(MethodName.startsWith("get")){
                out.println("<p>"+ MethodName+"</p>");  
                if(MethodName.equals("getMethod")){
                    out.println("<p>"+"output: "+ request.getMethod() +"</p>");
                } 
                if(MethodName.equals("getCookies")){
                    out.println("<p>"+"output: "+ request.getCookies() +"</p>");
                }
                if(MethodName.equals("getSession")){
                    out.println("<p>"+"output: "+ request.getSession() +"</p>");
                    out.println("<p>"+"output: "+ request.getSession(true) +"</p>");
                } 
                if(MethodName.equals("getTrailerFields")){
                    out.println("<p>"+"output: "+ request.getTrailerFields() +"</p>");
                }
                if(MethodName.equals("getAuthType")){
                    out.println("<p>"+"output: "+ request.getAuthType() +"</p>");
                }
                if(MethodName.equals("getContextPath")){
                    out.println("<p>"+"output: "+ request.getContextPath() +"</p>");
                }
                if(MethodName.equals("getDateHeader")){
                    out.println("<p>"+"output: "+ request.getDateHeader("TEST_STRING") +"</p>");
                }
                if(MethodName.equals("getHeaderNames")){
                    out.println("<p>"+"output: "+ request.getHeaderNames() +"</p>");
                }
                if(MethodName.equals("getIntHeader")){
                    out.println("<p>"+"output: "+ request.getIntHeader("x-forwarded-proto") +"</p>");
                }
                if(MethodName.equals("getHttpServletMapping")){
                    out.println("<p>"+"output: "+ request.getHttpServletMapping() +"</p>");
                }
                if(MethodName.equals("getPathInfo")){
                    out.println("<p>"+"output: "+ request.getPathInfo() +"</p>");
                }

                if(MethodName.equals("getPathTranslated")){
                    out.println("<p>"+"output: "+ request.getPathTranslated() +"</p>");
                }
                if(MethodName.equals("getRemoteUser")){
                    out.println("<p>"+"output: "+ request.getRemoteUser() +"</p>");
                }
                if(MethodName.equals("getRequestedSessionId")){
                    out.println("<p>"+"output: "+ request.getRequestedSessionId() +"</p>");
                }
                if(MethodName.equals("getRequestURI")){
                    out.println("<p>"+"output: "+ request.getRequestURI() +"</p>");
                    out.println("<p>"+"output: "+ request.getRequestURI() +"</p>");
                }
                if(MethodName.equals("getServletPath")){
                    out.println("<p>"+"output: "+ request.getServletPath() +"</p>");
                }
                if(MethodName.equals("getUserPrincipal")){
                    out.println("<p>"+"output: "+ request.getUserPrincipal() +"</p>");
                }
                // if(MethodName.equals("getParts")){
                //     out.println("<p>"+"output: "+ request.getParts() +"</p>");
                // }
                // if(MethodName.equals("getPart")){
                //     out.println("<p>"+"output: "+ request.getPart("") +"</p>");
                // }
                if(MethodName.equals("getQueryString")){
                    out.println("<p>"+"output: "+ request.getQueryString() +"</p>");
                }

            }

                     
        } 

        out.println("</BODY>");
        out.println("</HTML>");
    
    }



}