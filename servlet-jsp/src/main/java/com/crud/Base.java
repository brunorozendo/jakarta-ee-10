package com.crud;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Base extends HttpServlet {

	private static final long serialVersionUID = -6662457240855069965L;

	protected void view(String page, HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html; charset=utf-8");
			req.setAttribute("page", page);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/layout.jsp");
			requestDispatcher.forward(req, res);
		} catch (IOException | ServletException e) {
			res.setContentType("text/html; charset=utf-8");
			try (PrintWriter out = res.getWriter()) {
				out.println("<html><body>");
				out.println("<pre>");
				out.println(e.getLocalizedMessage());
				out.println("</pre>");
				out.println("</body></html>");
			} catch (IOException ex1) {
				ex1.printStackTrace();
			}

		}
	}

}
