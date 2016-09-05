/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenko.modeller;

//import com.kenko.bean.BeanCita;


public interface ICita {
    public String BuscarCita(String codigocli);
    public String CambiarEstado(String estadoCi,String dnic);
}
