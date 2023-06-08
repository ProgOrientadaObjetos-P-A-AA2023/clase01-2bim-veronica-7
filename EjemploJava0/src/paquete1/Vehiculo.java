/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String t, String m, double v){
        tipo = t;
        matricula = m;
        valor = v;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public void establecerMatricula(String m) {
        matricula = m;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double v) {
        valor = v;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Tipo vehiculo %s\nMatricula del vehiculo %s\n"
                + "\tEl costo del vehiculo es: %.2f", 
                tipo, 
                matricula,
                valor);
        return cadena;
    }
    
}
