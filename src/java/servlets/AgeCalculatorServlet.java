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
public class AgeCalculatorServlet extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculatorjsp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String age = request.getParameter("age");
        
        int res=0;
        
        
        
        if (age == null || age.equals("")) 
        {
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculatorjsp.jsp").forward(request, response);
            return;
        }
        try{
            res = Integer.parseInt(age) +1;
        }
        catch(RuntimeException e)
        {
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculatorjsp.jsp").forward(request, response);
            return;
        }
            String result = "Your age next year is " + res;
            request.setAttribute("result", result);
            request.setAttribute("age",age);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculatorjsp.jsp").forward(request, response);
            return;
        

        
    }
}
