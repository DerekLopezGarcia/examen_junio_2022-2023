package com.iesam.openbank.domain.models;

import java.util.Date;

public class Tarjeta implements Producto{
    private String nombre;
    private Integer codigo;
    private String descripcion;
    private Date fechaCaducidad;
    private Integer numTarjeta;
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public Integer getNumTarjeta() {
        return numTarjeta;
    }
    public void setNumTarjeta(Integer numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    @Override
    public Integer getCodigo() {
       return codigo;
    }
    @Override
    public void setCodigo(Integer codigo) {
        this.codigo=codigo;
    }
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }
    
}
