/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenko.controller;

import com.kenko.bean.BeanCita;
import com.kenko.modeller.ICita;
import com.kenko.modeller.ImpCita;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Cita", urlPatterns = {"/Cita"})
public class ServletCita extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        response.setContentType("application/json;charset=UTF-8");
        //response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ICita cita = new ImpCita();
        String accion = request.getParameter("accionc");
        String dnicli = request.getParameter("dnic");
        //BeanCita bcita= new BeanCita(codigocli, "", "", "");
        switch (accion) {
            case "BuscarCita":
                //response.setContentType("application/json;charset=UTF-8");
                out.print(cita.BuscarCita(dnicli));
                break;
            case "CambiarEstado":
                //response.setContentType("text/html;charset=UTF-8");
                String estadoCi = request.getParameter("estadoc");
                out.print(cita.CambiarEstado(estadoCi, dnicli));
                //out.print(estadoCi+dnicli);
                break;
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
