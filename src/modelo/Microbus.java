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
public class Microbus extends VehiculoPersona{

    public Microbus(int plazas, String matricula) {
        super(plazas, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
      double base = 50 * dias;
      return base + 2 * getPlazas();
    }
    
}
