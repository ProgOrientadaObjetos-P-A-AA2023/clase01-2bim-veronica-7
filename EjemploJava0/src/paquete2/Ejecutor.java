/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        edf1.establecerCostosPredio();
        
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        edf2.establecerCostosPredio();
        
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        edf3.establecerCostosPredio();
        
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        edf4.establecerCostosPredio();
        
        Edificio [] listaEdificios = {edf1, edf2, edf3, edf4};
        
        Vehiculo vehiculo1= new Vehiculo("Chevrolet", "LBD-2020", 20000);
        Vehiculo vehiculo2= new Vehiculo("Nissan", "PQA-2516", 25000);
        Vehiculo vehiculo3= new Vehiculo("Volkswagen", "CDD-2510", 150000);
        Vehiculo vehiculo4= new Vehiculo("Mitsubishi", "SPH-3521", 35000);
        
        Vehiculo [] listaVehiculos = {vehiculo1, vehiculo2, vehiculo3, vehiculo4};
        
        // double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerVehiculo(listaVehiculos);
        miempresa.establecerCostosVehiculos();
        miempresa.establecerCostosBienesInmuebles();
        miempresa.establecerCostosTotalPredio();
        miempresa.establecerCostosTotales();
        // Imprimir el costo de los bienes inmuebles de la empresa  
        // System.out.printf("%.2f\n", miempresa.obtenerCostosBienesInmuebles());
        System.out.printf("%s\n", miempresa);
    }
}
