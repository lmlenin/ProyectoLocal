/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenko.controller;

import com.kenko.bean.BeanUsuario;
import com.kenko.modeller.ImpUsuario;
import com.kenko.modeller.IUsuario;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author LABF30
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/Usuario"})
public class ServletUsuario extends HttpServlet {

    BeanUsuario busuario = new BeanUsuario();
//    IUsuario usuario; // bota error 
//    public ServletUsuario(){ crear u  proyecto con tomcat y lueego migrar a GLASSFLISH
//        usuario= new ImpUsuario();
//    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();

        String usu = "", cla = "";
        String ev = "";

        IUsuario musuario = new ImpUsuario();
        if (!request.getParameter("usuario").equals("") && !request.getParameter("clave").equals("")) {
            usu = request.getParameter("usuario");
            cla = request.getParameter("clave");
            busuario.setUsuario(usu);
            busuario.setClave(cla);
            ev = musuario.ValidarUsuario(busuario);
            //out.print("<script>alert('Bienvenido al sistema" + ev + "')</script>");
            if (!ev.equals("")) {
                //out.print("<script>alert('Bienvenido al sistema" + ev + "')</script>");
                //out.println("frmPrincipal.jsp");
                if ((sesion.getAttribute("usuario") != null) || (sesion.getAttribute("usuario") != "")) {
                    out.print(3);
                    sesion.setAttribute("usuario", ev);
                    sesion.setAttribute("perfil", musuario.ObtenerPerfil(busuario));
                    //request.setAttribute("perfil", musuario.ObtenerPerfil(busuario));
                    //response.sendRedirect("frmPrincipal.jsp");
                }else{
                    sesion.invalidate();
                    out.print("ssssd");
                }

                //RequestDispatcher view = request.getRequestDispatcher("/frmPrincipal.jsp");
                //view.forward(request, response);
                //response.sendRedirect("frmPrincipal.jsp");
            } else {
                //out.print("<script>alert('Error" + ev + "')</script>");
                out.print("1");
            }

        } else {
            //out.print("<script>alert('Complete todos los campos')</script>");
            out.print("2");
            //response.sendRedirect("frmIngreso.jsp");
        }

        //out.print("<script>alert('estas en el servlet+"+usu+cla+"');</script>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
