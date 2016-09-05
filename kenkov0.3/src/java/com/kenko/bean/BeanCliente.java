

package com.kenko.bean;

public class BeanCliente {
    
    private String dni;
    private String nombreCli;
    private String apellidoCli;
    private String domicilio;
    private String estadoCli;

    public BeanCliente(String dni, String nombreCli, String apellidoCli, String domicilio, String estadoCli) {
        this.dni = dni;
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.domicilio = domicilio;
        this.estadoCli = estadoCli;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstadoCli() {
        return estadoCli;
    }

    public void setEstadoCli(String estadoCli) {
        this.estadoCli = estadoCli;
    }
    
    
    
    
}
