
package ejbpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
    
            /* TODO output your page here. You may use following sample code. */
           
          String i=request.getParameter("p");
                 String j=request.getParameter("r");
                      String k=request.getParameter("n");
                      String op=request.getParameter("op");
            NewSessionBean nb=new NewSessionBean();
            ArrayList<String> l1=new ArrayList<String>();
            try{
               l1 =nb.init(i,j,k,op);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            if("simple interest".equals(op))
            {
            out.println(rb.simpleinterest(p,r,n,op));
            }
              if("comund interest".equals(op))
            {
            out.println(rb.compundinterest(p,r,n,op));
            }
            
            
            out.println("</body>");
            out.println("</html>");
            }
            finally
        {
       out.close();
        }
        }
        
    }



