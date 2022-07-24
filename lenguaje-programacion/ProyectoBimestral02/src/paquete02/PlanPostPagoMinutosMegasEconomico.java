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
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private double minutosSaldo;
    private double costoMinutosSaldo;
    private double gigasInternet;
    private double costoGiga;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(double minutosSaldo, double costoMinutosSaldo, double gigasInternet, double costoGiga, double porcentajeDescuento, String nombrePropietario, String cadulaPropietario, String ciudadPropietario, String marcaCelular, String modeloCelular, int numeroCelular) {
        super(nombrePropietario, cadulaPropietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        this.minutosSaldo = minutosSaldo;
        this.costoMinutosSaldo = costoMinutosSaldo;
        this.gigasInternet = gigasInternet;
        this.costoGiga = costoGiga;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public PlanPostPagoMinutosMegasEconomico() {
    }
    
    public double obtenerMinutosSaldo() {
        return minutosSaldo;
    }

    public void establecerMinutosSaldo(double minutosSaldo) {
        this.minutosSaldo = minutosSaldo;
    }

    public double obtenerCostoMinutosSaldo() {
        return costoMinutosSaldo;
    }

    public void establecerCostoMinutosSaldo(double costoMinutosSaldo) {
        this.costoMinutosSaldo = costoMinutosSaldo;
    }

    public double obtenerGigasInternet() {
        return gigasInternet;
    }

    public void establcerGigasInternet(double gigasInternet) {
        this.gigasInternet = gigasInternet;
    }

    public double obtenerCostoGiga() {
        return costoGiga;
    }

    public void establecerCostoGiga(double costoGiga) {
        this.costoGiga = costoGiga;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutosSaldo * costoMinutosSaldo) + (gigasInternet * costoGiga)
                - (((minutosSaldo * costoMinutosSaldo) + (gigasInternet * costoGiga))
                * (porcentajeDescuento / 100));
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MINUTOS MEGAS ECONOMICO\n%s"
                + "Minutos de saldo: %.2f\n"
                + "Costo por minuto: %.2f\n"
                + "Gigas de integer: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Porcentaje de descuento %.2f\n"
                + "Pago mensual: %.2f\n",
                super.toString(), minutosSaldo, costoMinutosSaldo, gigasInternet,
                costoGiga, porcentajeDescuento, pagoMensual);
        return reporte;
    }
}
