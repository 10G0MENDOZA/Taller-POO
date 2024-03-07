/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

import api.vehiculo.domain.services.AccionesVehiculo;

public class Motos extends Vehiculo {
    private String cilindraje;
    private String frenoMoto;
    private String acelerarMoto;
    private String estacionamientoMoto;
    private String direccionMoto;

    // Getters y setters

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getFrenoMoto() {
        return frenoMoto;
    }

    public void setFrenoMoto(String frenoMoto) {
        this.frenoMoto = frenoMoto;
    }

    public String getAcelerarMoto() {
        return acelerarMoto;
    }

    public void setAcelerarMoto(String acelerarMoto) {
        this.acelerarMoto = acelerarMoto;
    }

    public String getEstacionamientoMoto() {
        return estacionamientoMoto;
    }

    public void setEstacionamientoMoto(String estacionamientoMoto) {
        this.estacionamientoMoto = estacionamientoMoto;
    }

    public String getDireccionMoto() {
        return direccionMoto;
    }

    public void setDireccionMoto(String direccionMoto) {
        this.direccionMoto = direccionMoto;
    }

    // Implementación de métodos de la interfaz AccionesVehiculo

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La moto está frenando.");
    }

    @Override
    public void estacionar() {
        System.out.println("La moto está estacionada.");
    }

    @Override
    public void dirigir() {
        System.out.println("La moto está siendo dirigida.");
    }
}
