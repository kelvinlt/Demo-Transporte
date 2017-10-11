/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import java.util.ArrayList;
import modelo.Camion;
import modelo.Coche;
import modelo.Furgoneta;
import modelo.Microbus;
import modelo.Vehiculo;

/**
 *
 * @author DAM
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Furgoneta f = new Furgoneta(true, 2500, "1234AAA");
            Camion ca = new Camion(8000, "5678BBB");
            Coche co = new Coche(5, "9999CCC");
            Microbus b = new Microbus(25, "6666DDD");
            ArrayList<Vehiculo> flota = new ArrayList<>();
            flota.add(f);
            flota.add(ca);
            flota.add(co);
            flota.add(b);

            System.out.println("Listado de vehiculos y precios alquiler 8 dias");
            for (Vehiculo v : flota) {
                System.out.println("Matricula:" + v.getMatricula() + " | Alquiler:" + v.calcularAlquiler(8));

            }

            System.out.println("Todos los datos de cada Vehiculo");
            for (Vehiculo v : flota) {
                System.out.println("Matricula:" + v.getMatricula() + " | Alquiler:" + v.calcularAlquiler(8));
                if (v instanceof Furgoneta) {
                    Furgoneta aux = (Furgoneta) v;
                    System.out.println("Es una furgoneta");
                    System.out.println("Refrigeracion:" + aux.isRefrigeracion());
                    System.out.println("PMA:" + aux.getPma());
                }
            }
        } catch (Exception e) {
            
        }
    }
}
