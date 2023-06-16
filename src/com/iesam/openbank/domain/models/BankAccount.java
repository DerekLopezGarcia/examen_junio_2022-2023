package com.iesam.openbank.domain.models;

public class BankAccount {
    private String numCuenta;
    private Customer titularCuenta;
    private Movement[] transanciones;
    private Producto[] productosContratados;
    private Double saldo;
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public Customer getTitularCuenta() {
        return titularCuenta;
    }
    public void setTitularCuenta(Customer titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    public Movement[] getTransanciones() {
        return transanciones;
    }
    public void setTransanciones(Movement[] transanciones) {
        this.transanciones = transanciones;
    }
    public Producto[] getProductosContratados() {
        return productosContratados;
    }
    public void setProductosContratados(Producto[] productosContratados) {
        this.productosContratados = productosContratados;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
