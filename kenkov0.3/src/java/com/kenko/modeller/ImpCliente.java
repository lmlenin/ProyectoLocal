
package com.kenko.modeller;

import com.google.gson.Gson;
import com.kenko.bean.BeanCliente;
import com.kenko.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ImpCliente implements ICliente{

    Connection xcon;
    public ImpCliente(){
        xcon=Conexion.getConnection();
    }
    
    @Override
    public List<BeanCliente> ListarCliente(BeanCliente bcliente) {
//        List<BeanCliente> clientes = new ArrayList<>();
//        try {
//            Statement statement=xcon.createStatement();
//            ResultSet rs= statement.executeQuery("select * from cliente");
//             while (rs.next()) {
//                //BeanCliente client = new BeanCliente();
//                bcliente.setCodigoCli(rs.getInt("codigoCli"));
//                bcliente.setNombreCli(rs.getString("nombreCli"));
//                bcliente.setApellidoCli(rs.getString("apellidoCli"));
//                bcliente.setDni(rs.getString("dni"));
//                bcliente.setDomicilio(rs.getString("domicilio"));
//                bcliente.setEstadoCli(rs.getString("estadoCli"));
//                clientes.add(bcliente);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }catch(Exception e){
//        JOptionPane.showMessageDialog(null, "erro Mostrar cliente "+e);
//        }
        return null;
    }

    @Override
    public String ListaCliente() {
        ArrayList<BeanCliente> bcliente = new ArrayList<BeanCliente>();
        try {
            PreparedStatement pst=xcon.prepareStatement("{call sp_ListaCliente(?)}");
            pst.setString(1, "Registrado");
            ResultSet rs= pst.executeQuery();
            
             while (rs.next()) {
                //BeanCliente client = new BeanCliente();
                bcliente.add(new BeanCliente(rs.getString("dni"), rs.getString("nombreCli"),rs.getString("apellidoCli")
                        ,  rs.getString("domicilio"), rs.getString("estadoCli")));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "erro Mostrar cliente "+e);
        }
        
        return new Gson().toJson(bcliente);
    }
    
    
}
