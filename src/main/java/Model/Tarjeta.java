/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.Operation;

/**
 *
 * @author ignac
 */
public class Tarjeta implements Operation {
    protected String numero;
    protected String titular;
    protected double saldo = 0;

    public Tarjeta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public void recargar(double monto) {
        saldo += monto;
    }

    @Override
    public String toString() {
        return numero + " - " + titular + " - Saldo: " + saldo;
    }
    
}

