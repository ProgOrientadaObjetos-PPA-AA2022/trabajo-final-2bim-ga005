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
public class PlanPostPagoMinutos extends PlanCelular {

    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(double minutosNacionales, double costoMinutoNacional, double minutosInternacionales,
                               double costoMinutoInternacional, String nombrePropietario, String cadulaPropietario,
                               String ciudadPropietario, String marcaCelular, String modeloCelular, int numeroCelular) {
        super(nombrePropietario, cadulaPropietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutoNacional = costoMinutoNacional;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    public PlanPostPagoMinutos() {
    }
    
    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public void establecerMinutosNacionales(double minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void establecerCostoMinutoNacional(double costoMinutoNacional) {
        this.costoMinutoNacional = costoMinutoNacional;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void establecerMinutosInternacionales(double minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void establecerCostoMinutoInternacional(double costoMinutoInternacional) {
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacional);
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MINUTOS\n%s"
                + "Minutos nacionales: %.2f\n"
                + "Costo minutos nacionales: %.2f\n"
                + "Minutos internacionales: %.2f\n"
                + "Costo minutos internacionales: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(), minutosNacionales, costoMinutoNacional,
                minutosInternacionales, costoMinutoInternacional, pagoMensual);
        return reporte;
    }
}
