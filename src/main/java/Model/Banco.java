/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Banco {

    public String nombre;
    public static ArrayList<Tarjeta> tarjetas = new ArrayList<>();

    public Banco(String nombre ,ArrayList<Tarjeta> tarjetas) {
        this.nombre = nombre;
        this.tarjetas = tarjetas;
    }

    
    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }

    public void mostrarTarjetas() {
        for (Tarjeta t : tarjetas) {
            System.out.println(t);
        }
    }
}