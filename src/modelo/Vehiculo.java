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
public abstract class Vehiculo {
    
    private String matricula;

    public Vehiculo(String matricula) throws ExceptionTransporte {
        if(matricula.length() == 7){
            this.matricula = matricula;
        } else{
            throw new ExceptionTransporte("ERROR: Matricula incorrecta");
        }
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double calcularAlquiler(int dias){
    double base = 50 * dias;
    return base;
    };
    

    
}
