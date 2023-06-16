package com.iesam.openbank.domain.models;

public class Customer extends Person{
    private String direccion;
    private String poblacion;
    private Integer CodPostal;
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public Integer getCodPostal() {
        return CodPostal;
    }
    public void setCodPostal(Integer codPostal) {
        CodPostal = codPostal;
    }

}
