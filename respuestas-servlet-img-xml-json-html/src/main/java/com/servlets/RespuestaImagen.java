package com.servlets;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespuestaImagen extends HttpServlet {
 
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	   response.setContentType("image/jpeg");

      //String pathToWeb = getServletContext().getRealPath(File.separator);
      String pathToWeb = getServletContext().getRealPath("/");
      System.out.println(pathToWeb);
      File f = new File(pathToWeb + "images/tomcat.jpg");
      BufferedImage bi = ImageIO.read(f);
      OutputStream out = response.getOutputStream();
      ImageIO.write(bi, "jpg", out);
      out.close();

   }
}

