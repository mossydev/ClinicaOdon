/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author moss_
 */
@WebServlet(name = "SvEditUsuarios", urlPatterns = {"/SvEditUsuarios"})
public class SvEditUsuarios extends HttpServlet {
    
    Controladora control = new Controladora();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Usuario usu=control.traerUsuario(id);
        
        HttpSession misession=request.getSession();
        misession.setAttribute("usuEditar", usu);
        
        System.out.println("El usuario es: "+ usu.getNombreUsuario());
        
        response.sendRedirect("editarUsuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreUsu= request.getParameter("nombreusu");
        String contrasenia=request.getParameter("contrasenia");
        String rol=request.getParameter("rol");
        
        Usuario usu=(Usuario)request.getSession().getAttribute("usuEditar");
        usu.setNombreUsuario(nombreUsu);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        control.editarUsuario(usu);
        response.sendRedirect("SvUsuario");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
