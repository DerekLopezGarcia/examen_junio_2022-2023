package com.iesam.openbank.domain.models;

public class Person {
    private String DNI;
    private String nombre;
    private String apellidos;
    
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dni) {
        DNI = dni;
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
