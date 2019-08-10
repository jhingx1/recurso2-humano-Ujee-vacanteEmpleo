package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Comentarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
    public Comentarios() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String perfil = request.getParameter("perfil");
		String id= request.getParameter("id");
		
		
		System.out.println("Nombre : " + name + " perfil : " + perfil + " id : " +id);
		
		PrintWriter out = response.getWriter();
		
		if(perfil.equals("admin")){
			
			response.setContentType("text/html;charset=UTF-8");			
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Catalogo de productos</title>");
			out.println("<meta charset='UTF-8'>");
			out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h3>Accesos concedido</h3>");			
			out.println("</body>");
			out.println("</html>");

		}else{
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Catalogo de productos</title>");
			out.println("<meta charset='UTF-8'>");
			out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h3>Accesos denegado</h3>");			
			out.println("</body>");
			out.println("</html>");
		}
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String grado= request.getParameter("grado");
		String comentarios= request.getParameter("comentarios");
		
		System.out.println(nombre);
		System.out.println(email);
		System.out.println(grado);
		System.out.println(comentarios);
					
		response.setContentType("text/html;charset=UTF-8");			
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Catalogo de productos</title>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Datos procesados</h3>");			
		out.println("</body>");
		out.println("</html>");

		
	}

}
