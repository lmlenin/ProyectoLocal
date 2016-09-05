
package com.kenko.modeller;

import com.kenko.bean.BeanUsuario;
import com.kenko.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ImpUsuario implements IUsuario {

    private Connection cnn;

    public ImpUsuario() {
        cnn = Conexion.getConnection();
    }

    @Override
    public String ValidarUsuario(BeanUsuario busuario){
        //ArrayList<BeanUsuario> datos = new ArrayList<BeanUsuario>();
        String res = "",x="";
        try {
        CallableStatement cs = cnn.prepareCall("{call sp_ValidarUsuario(?,?)}");
        cs.setString(1, busuario.getUsuario());
        cs.setString(2,busuario.getClave());
        ResultSet rs = cs.executeQuery();
        while(rs.next()){
            res=rs.getString(1)+" " +rs.getString(2);
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+"SQLERROR \n al consultar db"+busuario.getUsuario());
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR \n al consultar db"+busuario.getUsuario());
        }
        return res;
    }

    @Override
    public String ObtenerPerfil(BeanUsuario bsuario) {
        String res = "",x="";
        try {
        CallableStatement cs = cnn.prepareCall("{call sp_ObtenerPerfil(?)}");
        cs.setString(1, bsuario.getUsuario());
        ResultSet rs = cs.executeQuery();
        while(rs.next()){
            res=rs.getString(1);
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+"SQLERROR \n al consultar db"+bsuario.getUsuario());
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR \n al consultar db"+bsuario.getUsuario());
        }
        return res;
    }

}
