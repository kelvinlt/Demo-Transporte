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
public class Coche extends VehiculoPersona{

    public Coche(int plazas, String matricula) {
        super(plazas, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        double base = 50 * dias;
        double alquiler = base + (1.5 * getPlazas() * dias);
        return alquiler;
    }
    
}
