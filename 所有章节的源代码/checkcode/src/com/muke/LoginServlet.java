package com.muke;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		String piccode = (String) request.getSession().getAttribute("piccode");
		String checkcode = request.getParameter("checkcode");
		checkcode = checkcode.toUpperCase();
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		if(checkcode.equals(piccode)){
			out.println("��֤��������ȷ��");
		}else{
			out.println("��֤��������󣡣���");
		}
		out.flush();
		out.close();
		
	}
}
