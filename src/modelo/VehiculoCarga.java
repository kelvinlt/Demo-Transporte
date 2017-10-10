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
public abstract class VehiculoCarga extends Vehiculo{
    
    private int pma;

    public VehiculoCarga(int pma, String matricula) {
        super(matricula);
        this.pma = pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + 20 * pma;
    }

    
}
