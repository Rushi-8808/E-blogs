package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

import com.DAO.PostDAO;
@WebServlet("/AddBlogServlet")
public class AddBlogServlet extends HttpServlet{
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		     int uid= Integer.parseInt(req.getParameter("uid"));
		     String title =req.getParameter("title");
		     String content= req.getParameter("content");
		     
		     
		     
		     int f=PostDAO.AddBlog(title,content,uid);
		     
		     
		     
		     if(f > 0)
			   {
				  System.out.println("data insert successfully..");
				  resp.sendRedirect("showBlog.jsp");
			   }
			   else
			   {
				   System.out.println("data not inserted..");
			   }
		     
		     
		     
	}

}
