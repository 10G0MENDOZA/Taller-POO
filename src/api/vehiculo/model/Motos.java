/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

import api.vehiculo.domain.services.AccionesVehiculo;

public class Motos extends Vehiculo implements AccionesVehiculo {
    private int cilindraje;
    private String frenoMoto;
    private int acelerarMoto;
    private String estacionamientoMoto;
    private String dirrecionMoto;

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getFreno() {
        return frenoMoto;
    }

    public void setFreno(String freno) {
        this.frenoMoto = freno;
    }

    public int getAcelerar() {
        return acelerarMoto;
    }

    public void setAcelerar(int acelerar) {
        this.acelerarMoto = acelerar;
    }

    public String getEstacionamiento() {
        return estacionamientoMoto;
    }

    public void setEstacionamiento(String estacionamiento) {
        this.estacionamientoMoto = estacionamiento;
    }

    public String getDireccion() {
        return dirrecionMoto;
    }

    public void setDireccion(String direccion) {
        this.dirrecionMoto = direccion;
    }

    @Override
    public void acelerar() {
        // Implementación de la acción de acelerar para motos
    }

    public void frenar() {
        // Implementación de la acción de frenar para motos
    }

    @Override
    public void estacionar() {
        // Implementación de la acción de estacionar para motos
    }

    @Override
    public void dirigir() {
        // Implementación de la acción de dirigir para motos
    }

    @Override
    public void frena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
