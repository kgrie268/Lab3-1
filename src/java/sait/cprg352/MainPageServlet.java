package sait.cprg352;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 742227
 */

public class MainPageServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String userName= (String)request.getAttribute("userName");
       request.setAttribute("name", userName);
       
       
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
            // stop other execution of code
        
           
    }
   
    
    

}
//request.setAttribute("errorMessage", "Invaild username or password");