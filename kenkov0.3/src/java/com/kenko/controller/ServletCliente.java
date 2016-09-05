/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenko.controller;

import com.kenko.bean.BeanCliente;
import com.kenko.modeller.ICliente;
import com.kenko.modeller.ImpCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LABF30
 */
@WebServlet(name = "ServletCliente", urlPatterns = {"/Cliente"})
public class ServletCliente extends HttpServlet {

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
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ICliente cliente = new ImpCliente();
        String accion="";
        accion=request.getParameter("accion");
        switch(accion){
            case "listar":
//                request.setAttribute("clientes", cliente.ListarCliente(bcliente));
                out.print(cliente.ListaCliente());
                break;
            case "listacliente":
                
                break;
            case "2":
                break;
            case "3":
                break;
        }
//        RequestDispatcher view = request.getRequestDispatcher("/frmListaCliente.jsp");
//        view.forward(request, response);
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
