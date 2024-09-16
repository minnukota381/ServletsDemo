package com.halcyon;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Helcy")
public class HalcyonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

//Step1
//		pw.println("<h1>Hello, World</h1>");

//Step2
//		String name = req.getParameter("name");
//		pw.println("Hello, " + name);

//Step3
//		res.sendRedirect("https://www.example.com");

//Step4
//		ServletConfig sf = getServletConfig();
//		String you = sf.getInitParameter("name");
//
//		pw.println("<h1>" + you + "</h1>");

//Step5
//		ServletContext SerC = getServletContext();
//		String youu = SerC.getInitParameter("namee");
//		pw.println("<h1>" + youu + "</h1>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

//Step6
		String name = req.getParameter("name");
		pw.println("<h1>Welcome, " + name + "!</h1>");

		req.setAttribute("username", name);
		RequestDispatcher reqDis = req.getRequestDispatcher("/index.jsp");
		reqDis.forward(req, res);
	}
}
