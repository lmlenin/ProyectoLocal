/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenko.modeller;

import com.google.gson.Gson;
import com.kenko.bean.BeanCita;
import com.kenko.bean.BeanCliente;
import com.kenko.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ImpCita implements ICita{

    Connection xcon;
    public ImpCita(){
        xcon=Conexion.getConnection();
    }
    @Override
    public String BuscarCita(String dnicli) {
        ArrayList<BeanCita> citas = new ArrayList<>();
        try {
            PreparedStatement pst=xcon.prepareStatement(" select * from cita where dni = ? ");
            pst.setString(1, dnicli);
            ResultSet rs= pst.executeQuery();
             while (rs.next()) {
//                BeanCita cit = new BeanCita();
//                cit.setFechaCita(rs.getDate("fechaCita").toString());
//                cit.setDni(rs.getString("dni"));
//                cit.setDetalle(rs.getString("detalle"));
//                cit.setEstadoCit(rs.getString("estadoCit"));
//                citas.add(cit);
                citas.add(new BeanCita(rs.getString("fechaCita"), rs.getString("dni"), 
                        rs.getString("detalle"), rs.getString("estadoCit")));
               
                //JOptionPane.showMessageDialog(null, "erroR Mostrar Citas puerb");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "erroR Mostrar Citas "+e);
        }
        //new Gson().toJson(citas)
        return new Gson().toJson(citas);
    }

    @Override
    public String CambiarEstado(String estadoc,String dnic) {
        int x=0;
        //String d="";
        try {
            PreparedStatement ps=xcon.prepareStatement("update cita set estadoCit=? where dni=?");
            ps.setString(1, estadoc);
            ps.setString(2, dnic);
            x = ps.executeUpdate();
            //BuscarCita(dnic);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BuscarCita(dnic);
    }
    
    
}
