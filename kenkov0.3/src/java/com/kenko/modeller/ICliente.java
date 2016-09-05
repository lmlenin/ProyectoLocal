/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenko.modeller;

import com.kenko.bean.BeanCliente;
import java.util.List;



/**
 *
 * @author LABF30
 */
public interface ICliente {
    public List<BeanCliente> ListarCliente(BeanCliente bcliente);//ver 0.1 listar
    public String ListaCliente();
}

