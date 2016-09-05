
package com.kenko.bean;


public class BeanCita {
    private String fechaCita;
    private String dni;
    private String detalle;
    private String estadoCit;

//    public BeanCita( int codigoCli,String fechaCita, String detalle, String estadoCit) {
//        this.fechaCita = fechaCita;
//        this.codigoCli = codigoCli;
//        this.detalle = detalle;
//        this.estadoCit = estadoCit;
//    }

    public BeanCita(String fechaCita, String dni, String detalle, String estadoCit) {
        this.fechaCita = fechaCita;
        this.dni = dni;
        this.detalle = detalle;
        this.estadoCit = estadoCit;
    }

    
    

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstadoCit() {
        return estadoCit;
    }

    public void setEstadoCit(String estadoCit) {
        this.estadoCit = estadoCit;
    }
    
    
}
