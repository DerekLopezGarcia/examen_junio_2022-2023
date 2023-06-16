package com.iesam.openbank.domain.models;

public class Person {
    private Integer DNI;
    private String nombre;
    private String apellidos;
    
    public Integer getDNI() {
        return DNI;
    }
    public void setDNI(Integer dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
