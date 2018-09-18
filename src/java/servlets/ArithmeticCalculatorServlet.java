/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 738409
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int resultadd=0;
        int resultsub=0;
        int resultmul=0;
        int resultmod=0;
        String result="";
        
        String firstnumber = request.getParameter("first");
        String secondnumber = request.getParameter("second");
       if(firstnumber.equals("") && secondnumber.equals(""))
            {
            request.setAttribute("result", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
       if(firstnumber.equals(""))
            {
            request.setAttribute("result", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
       if(secondnumber.equals(""))
            {
            request.setAttribute("result", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
       try
       {
         resultadd = Integer.parseInt(firstnumber) + Integer.parseInt(secondnumber);
         resultsub = Integer.parseInt(firstnumber) - Integer.parseInt(secondnumber);
         resultmul = Integer.parseInt(firstnumber) * Integer.parseInt(secondnumber);
         resultmod = Integer.parseInt(firstnumber) % Integer.parseInt(secondnumber);
         result = "Result is: "+resultadd;
       }
       catch(RuntimeException e)
       {
                request.setAttribute("result", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return; 
       }
       
       
        
        
        if (request.getParameter("op").equals("+"))
        {
            

                     request.setAttribute("result", result);
                 request.setAttribute("first",firstnumber);
                request.setAttribute("second",secondnumber);
                     getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                
                     return;
        }
        if (request.getParameter("op").equals("-"))
        {
                        result = "Result is: "+resultsub;
                     request.setAttribute("result", result);
                     request.setAttribute("first",firstnumber);
                request.setAttribute("second",secondnumber);
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
        }
        if (request.getParameter("op").equals("*"))
        {
                        result = "Result is: "+resultmul;
                     request.setAttribute("result", result);
                     request.setAttribute("first",firstnumber);
                request.setAttribute("second",secondnumber);
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
        }
         if (request.getParameter("op").equals("%"))
        {
                     result = "Result is: "+resultmod;
                     request.setAttribute("result", result);
                     request.setAttribute("first",firstnumber);
                request.setAttribute("second",secondnumber);
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
        }
        
        
        
    //action for update here
} 
        
}
        
        
        
        
        
        
        
        
        
        
//        if (age == null || age.equals("")) {
//            request.setAttribute("message", "You must enter a number.");
//            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
//            return;
//        }
//       
//            int res = Integer.parseInt(age) +1;
//         
//            String result = "Your age next year is " + res;
//            request.setAttribute("result", result);
//            getServletContext().getRequestDispatcher("/WEB-INF/agecalculatorjsp.jsp").forward(request, response);
//            return;
        

        