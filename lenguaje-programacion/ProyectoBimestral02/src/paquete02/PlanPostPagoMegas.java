/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.PlanCelular;

/**
 *
 * @author mateovalarezoojeda
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double gigasInternet;
    private double costoGigasInternet;
    private double tarifaBase;
    public PlanPostPagoMegas(double gigasInternet, double costoGigasInternet, double tarifaBase, String nombrePropietario, String cadulaPropietario, String ciudadPropietario, String marcaCelular, String modeloCelular, int numeroCelular) {
        super(nombrePropietario, cadulaPropietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        this.gigasInternet = gigasInternet;
        this.costoGigasInternet = costoGigasInternet;
        this.tarifaBase = tarifaBase;
    }

    public PlanPostPagoMegas() {
    }
    
    public double obtenerGigasInternet() {
        return gigasInternet;
    }

    public void establecerGigasInternet(double gigasInternet) {
        this.gigasInternet = gigasInternet;
    }

    public double obtenerCostoGigasInternet() {
        return costoGigasInternet;
    }

    public void establecerCostoGigasInternet(double costoGigasInternet) {
        this.costoGigasInternet = costoGigasInternet;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (costoGigasInternet * gigasInternet) + tarifaBase;
    }
    @Override
    public String toString(){
        String reporte = String.format("PLAN POST PAGO MEGAS\n%s"
                + "Gigas de internet: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Pago mensual: %.2f\n",
                super.toString(),gigasInternet,costoGigasInternet,tarifaBase,pagoMensual);
        return reporte;
    }

}
