/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAM
 */
public class Camion extends VehiculoCarga{

    public Camion(int pma, String matricula) {
        super(pma, matricula);
    } 
    
    @Override
    public double calcularAlquiler(int dias) {
        double base = 50 * dias;
        double carga = 50 * getPma();
        return base + carga + 40;
    }
    
}
