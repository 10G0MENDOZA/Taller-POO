/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api.vehiculo;

import java.util.Scanner;
import api.vehiculo.model.Vehiculo;
import api.vehiculo.model.Carros;
import api.vehiculo.model.Motos;
/**
 *
 * @author 10GO
 */
 public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la marca de vehiculo:");
        String marca = entrada.nextLine();
        
        System.out.println("Ingrese modelo del vehiculo:");
        int modelo = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.println("Ingrese la placa de vehiculo:");
        String placa = entrada.nextLine();
        
        System.out.println("Ingrese la velocidad maxima del vehiculo:");
        int velocidadmaxima = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        
        Vehiculo vehiculo = new Vehiculo();
        
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setPlaca(placa);
        vehiculo.setVelocidadmaxima(velocidadmaxima);

        System.out.println("Ingrese el tipo de traccion del carro:");
        String tipoTraccion = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de freno del carro:");
        String freno = entrada.nextLine();
        
        System.out.println("Ingrese cuanto debe acelerar el carro:");
        int acelerar = entrada.nextInt();
        entrada.nextLine(); 
        
        System.out.println("Ingrese el estacionamiento del carro:");
        String estacionamiento = entrada.nextLine();
        
        System.out.println("Ingrese la direccion del carro:");
        String direccion = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de combustible del carro:");
        String tipoCombustible = entrada.nextLine();
        
        Carros carro = new Carros();
        
        carro.setAceleracion(acelerar);
        carro.setDireccion(direccion);
        carro.setEstacionamiento(estacionamiento);
        carro.setTipoFreno(freno);
        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setPlaca(placa);
        carro.setTipoCombustible(tipoCombustible);
        carro.setTipoTraccion(tipoTraccion);
        carro.setVelocidadmaxima(velocidadmaxima);
        
        System.out.println("Ingrese el cilindraje de la moto:");
        int cilindraje = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Ingrese el tipo de freno de la moto:");
        String frenoMoto = entrada.nextLine();
        
        System.out.println("Ingrese cuanto debe acelerar la moto:");
        int acelerarMoto = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese el estacionamiento de la moto:");
        String estacionamientoMoto = entrada.nextLine();
        
        System.out.println("Ingrese la direccion de la moto:");
        String direccionMoto = entrada.nextLine();
        
        Motos moto = new Motos();
        
        moto.setAcelerar(acelerarMoto);
        moto.setCilindraje(cilindraje);
        moto.setDireccion(direccionMoto);
        moto.setEstacionamiento(estacionamientoMoto);
        moto.setFreno(frenoMoto);

        
        entrada.close(); 
    }
}
