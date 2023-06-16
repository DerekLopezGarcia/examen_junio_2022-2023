package com.iesam.openbank.domain.models;


public class PlazoFijo implements Producto{
    private String nombre;
    private Integer codigo;
    private String descripcion;
    private Integer duracionMeses;
    private Double interes;
    public Integer getDuracionMeses() {
        return duracionMeses;
    }
    public void setDuracionMeses(Integer duracionMeses) {
        this.duracionMeses = duracionMeses;
    }
    public Double getInteres() {
        return interes;
    }
    public void setInteres(Double interes) {
        this.interes = interes;
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
