/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos; // tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalPredio;
    private double costoTotalBienes;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    public void establecerVehiculo(Vehiculo[] m){
        vehiculos = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerCostosBienesInmuebles(){
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
        // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }
        
        costoBienesInmuebles = suma;
    }
    
    public void establecerCostosTotalPredio(){
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
        // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + edificios[i].obtenerCostoPredio();
        }
        
        costoTotalPredio = suma;
    }
    
    public void establecerCostosVehiculos(){
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
        // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }
        
        costoVehiculos = suma;
    }
     
    public void establecerCostosTotales(){
        double suma = 0, suma2 = 0;
        for (int i = 0; i < vehiculos.length; i++) {
        // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }
        for (int i = 0; i < edificios.length; i++) {
        // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma2 = suma2 + edificios[i].obtenerCosto();
        }
        
        costoTotalBienes = suma2 + suma;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculo(){
        return vehiculos;
    }
    
    public double obtenerCostosBienesInmuebles(){
        return costoBienesInmuebles;
    }
    
    @Override
    public String toString(){
        /*
        Empresa de Hojas
        Lista de Edificios
        1. EDIFICIO CENTRAL (20000)
        2. EDIFICIO NORTE (30000)
        3. EDIFICIO SUR (10000)
        4. EDIFICIO SECUNDARIO (5000)
        Total de inmuebles: 65000
        
        Lista de Vehiculos
        1. Auto, LBB0011 (10000)
        2. Camioneta, LCB0011 (20000)
        3. Auto, LBD0012 (6000)
        4. Camioneta, LCC0011 (10000)
        5. Camioneta, LDC0011 (25000)
        Total de inmuebles: 71000
        
        Total bienes: 136000
        */
        
        String reporte = String.format("%s\nLista de Edificio:\n", 
                obtenerNombre());
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s (%.2f)\n", 
                    reporte, 
                    i+1,
                    edificios[i].obtenerNombre().toUpperCase(), 
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%s\nLista de Vehiculos:\n", reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d)%S\n\t%s\n\t(%.2f)\n", 
                    reporte, 
                    i+1,
                    vehiculos[i].obtenerTipo(), 
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }
        
        reporte = String.format("%sTotal de bienes inmuebles: %.2f\n"
                + "Total de costo vehiculos: %.2f\n"
                + "Costo total bienes: %.2f\n"
                + "Costo total del predio: %.2f\n", 
                reporte,
                costoBienesInmuebles,
                costoVehiculos,
                costoTotalBienes, 
                costoTotalPredio);
        
        return reporte;
    }
}
