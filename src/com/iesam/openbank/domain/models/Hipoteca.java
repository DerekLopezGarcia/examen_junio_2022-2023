package com.iesam.openbank.domain.models;

import java.util.Date;

public class Hipoteca implements Producto {
    private String nombre;
    private Integer codigo;
    private String descripcion;
    private Date fechaInicio;
    private Double interes;
    private Date fechaFin;
    public Hipoteca (String nombre, Integer codigo, String descripcion, Date fechaInicio, Double interes, Date fechaFin){
        this.nombre=nombre;
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.fechaInicio=fechaInicio;
        this.interes=interes;
        this.fechaFin=fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
