/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excepciones.ExceptionTransporte;

/**
 *
 * @author DAM
 */
public abstract class VehiculoPersona extends Vehiculo{
    
    private int plazas;

    public VehiculoPersona(int plazas, String matricula) throws ExceptionTransporte {
        super(matricula);
        this.plazas = plazas;
    }
    
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

}
