/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author mateovalarezoojeda
 */
public abstract class PlanCelular {

    protected String nombrePropietario;
    protected String cedulaPropietario;
    protected String ciudadPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String nombrePropietario, String cadulaPropietario, String ciudadPropietario, String marcaCelular, String modeloCelular, int numeroCelular) {
        this.nombrePropietario = nombrePropietario;
        this.cedulaPropietario = cadulaPropietario;
        this.ciudadPropietario = ciudadPropietario;
        this.marcaCelular = marcaCelular;
        this.modeloCelular = modeloCelular;
        this.numeroCelular = numeroCelular;
    }

    public PlanCelular() {
    }
    
    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public void establecerNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String obtenerCedulaPropietario() {
        return cedulaPropietario;
    }

    public void establecerCedulaPropietario(String cadulaPropietario) {
        this.cedulaPropietario = cadulaPropietario;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }

    public void establecerCiudadPropietario(String ciudadPropietario) {
        this.ciudadPropietario = ciudadPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public void establecerMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public void establecerModeloCelular(String modeloCelular) {
        this.modeloCelular = modeloCelular;
    }

    public int obtenerNumeroCelular() {
        return numeroCelular;
    }

    public void establecerNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public abstract void establecerPagoMensual();
    
    @Override
    public String toString(){
        String reporte = String.format("Nombre del propietario: %s\n"
                + "Cedula del propietario: %s\n"
                + "Ciudad del propietario: %s\n"
                + "Marca celular: %s\n"
                + "Modelo celular: %s\n"
                + "Número de celular: %d\n",
                nombrePropietario,cedulaPropietario,ciudadPropietario,
                marcaCelular,modeloCelular,numeroCelular);
        return reporte;
    }
}
