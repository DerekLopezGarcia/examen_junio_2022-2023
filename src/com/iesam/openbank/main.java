package com.iesam.openbank;

import java.util.Date;

import com.iesam.openbank.domain.models.BankAccount;
import com.iesam.openbank.domain.models.Customer;
import com.iesam.openbank.domain.models.Hipoteca;
import com.iesam.openbank.domain.models.Movement;

public class main {
    public static void main(String args[]) {

        Movement movement = new Movement();
        movement.setImporte(1000.0);
        movement.setDescripcion("cobro");

        Movement movement2 = new Movement();
        movement2.setImporte(1000.0);
        movement2.setDescripcion("pago");
        String nombre = "hipoteca";
        Integer codigo = 1;
        String descripcion = "hipoteca";
        Double interes = 0.5;
        Date fechaInicio = new Date();
        Date fechaFin = new Date();
        Hipoteca hipoteca = new Hipoteca(nombre, codigo, descripcion, fechaInicio, interes, fechaFin);
        Customer customer = new Customer("direccion", "poblacion", 1234, "dni", "nombre", "apellidos");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setTitularCuenta(customer);
        bankAccount.getTransanciones()[0] = movement;
        bankAccount.getTransanciones()[1] = movement2;
        bankAccount.getProductosContratados()[0] = hipoteca;
    
        System.out.println(bankAccount.getTitularCuenta().getNombre());
        System.out.println(bankAccount.getTransanciones()[0].getDescripcion()+ " " + bankAccount.getTransanciones()[0].getImporte());
        System.out.println(bankAccount.getTransanciones()[1].getDescripcion()+ " " + bankAccount.getTransanciones()[1].getImporte());
        System.out.println(bankAccount.getProductosContratados()[0].getNombre()+ " " + bankAccount.getProductosContratados()[0].getDescripcion());

    }
}
