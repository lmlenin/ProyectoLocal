/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenko.modeller;

import com.kenko.bean.BeanUsuario;
import java.util.ArrayList;

/**
 *
 * @author LABF30
 */
public interface IUsuario {
    public String ValidarUsuario(BeanUsuario busuario);
    public String ObtenerPerfil(BeanUsuario busuario);
}
