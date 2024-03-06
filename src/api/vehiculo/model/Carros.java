/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;
import api.vehiculo.domain.services.AccionesVehiculo;

public class Carros extends Vehiculo implements AccionesVehiculo {
    private String tipoTraccion;
    private String tipoFreno;
    private int aceleracion;
    private String estacionamiento;
    private String direccion;
    private String tipoCombustible;

    // Getters y setters

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(String estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Implementación de métodos de la interfaz AccionesVehiculo

    @Override
    public void acelerar() {
        // Implementación de la acción de acelerar para carros
    }

    @Override
    public void estacionar() {
        // Implementación de la acción de estacionar para carros
    }

    public void frenar() {
        // Implementación de la acción de frenar para carros
    }

    public void cambiarDireccion() {
        // Implementación de la acción de cambiar dirección para carros
    }

    @Override
    public void frena() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dirigir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
