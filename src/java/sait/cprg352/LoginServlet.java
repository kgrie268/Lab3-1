package sait.cprg352;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domainclasses.User;
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

public class LoginServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String logout= request.getParameter("logout");
      if(logout!= null && logout.equals("true")){
        request.setAttribute("errorMessage", "Logged out");  
      }
        
    
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            // stop other execution of code
        
           
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
       
        User user = new User();
        
        user.setUserName(userName);
        user.setPassWord(passWord);
        
        //request.setAttribute("age2", age);
        // validation
        
       if (user.getUserName() == null || user.getUserName().isEmpty() || user.getPassWord()== null || user.getPassWord().isEmpty()) {
            // set error message
            request.setAttribute("errorMessage", "Both values are required");
            

            // forward the request back to index.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            // stop other execution of code
            return;
        }
        
        UserService userClass = new UserService();
        
        if(userClass.login(user.getUserName(), user.getPassWord())){
         //goes to main page
         request.setAttribute("user", user);
        
         getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
        }
        else{
        request.setAttribute("errorMessage", "Invaild username or password");
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
        
       
            // stop other execution of code
           
    }

}
