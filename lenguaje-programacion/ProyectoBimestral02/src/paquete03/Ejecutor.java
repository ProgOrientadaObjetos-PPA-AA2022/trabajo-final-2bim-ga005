/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;
import paquete02.*;

/**
 *
 * @author mateovalarezoojeda
 */
public class Ejecutor {

    public static void main(String[] args) {
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);
        int op = 1, op2, numeroCelular;
        String nombre, cedula, ciudad, marca, modelo;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Ingresar PLAN CELULAR           [1]");
            System.out.println("Mostrar listas de PLAN CELULAR  [2]");
            System.out.println("Salir                           [0]");
            System.out.println("-----------------------------------");
            op = sc.nextInt();
            System.out.println("-----------------------------------");
            if (op == 1) {
                do {

                    op2 = menu();
                    System.out.println("Ingrese nombre del propietario:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese cedula del propietario:");
                    cedula = sc.nextLine();
                    System.out.println("Ingrese ciudad del propietario:");
                    ciudad = sc.nextLine();
                    System.out.println("Ingrese marca de celular:");
                    marca = sc.nextLine();
                    System.out.println("Ingrese modelo de celular:");
                    modelo = sc.nextLine();
                    System.out.println("Ingrese número de celular:");
                    numeroCelular = sc.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.println("Ingrese número de minutos Nacionales:");
                            double minutosNacionales = sc.nextDouble();
                            System.out.println("Ingrese costo de minuto Nacional:");
                            double costoMinutoNacional = sc.nextDouble();
                            System.out.println("Ingrese número de minutos Internacionales:");
                            double minutosInternacionales = sc.nextDouble();
                            System.out.println("Ingrese costo de minuto Internacional:");
                            double costoMinutoInternacional = sc.nextDouble();
                            PlanPostPagoMinutos pppm = new PlanPostPagoMinutos(minutosNacionales, costoMinutoNacional,
                                    minutosInternacionales, costoMinutoInternacional, nombre, cedula, ciudad, marca, modelo,
                                    numeroCelular);
                            c.insertarPlanPostPagoMinutos(pppm);
                            break;
                        case 2:
                            System.out.println("Ingrese el número de Gigas de internet:");
                            double gigaInternet = sc.nextDouble();
                            System.out.println("Ingrese el costo de la giga de internet:");
                            double costoGiga = sc.nextDouble();
                            System.out.println("Ingrese el valor de la tarifa base:");
                            double tarifaBase = sc.nextDouble();
                            PlanPostPagoMegas pppg = new PlanPostPagoMegas(gigaInternet, costoGiga,
                                    tarifaBase, nombre, cedula, ciudad, marca, modelo, numeroCelular);
                            c.insertarPlanPostPagoMegas(pppg);
                            break;
                        case 3:
                            System.out.println("Ingrese numero de minuto de de saldo:");
                            double minutosSaldo = sc.nextDouble();
                            System.out.println("Ingrese el costo de minuto de saldo:");
                            double costoMinutoSaldo = sc.nextDouble();
                            System.out.println("Ingrese el número de Gigas de internet:");
                            double gigaInternet2 = sc.nextDouble();
                            System.out.println("Ingrese el costo de la giga de internet:");
                            double costoGiga2 = sc.nextDouble();
                            PlanPostPagoMinutosMegas ppmg = new PlanPostPagoMinutosMegas(minutosSaldo,
                                    costoMinutoSaldo, gigaInternet2, costoGiga2, nombre, cedula, ciudad, marca,
                                    modelo, numeroCelular);
                            c.insertarPlanPostPagoMinutosMegas(ppmg);
                            break;
                        case 4:
                            System.out.println("Ingrese numero de minuto de de saldo:");
                            double minutosSaldo2 = sc.nextDouble();
                            System.out.println("Ingrese el costo de minuto de saldo:");
                            double costoMinutoSaldo2 = sc.nextDouble();
                            System.out.println("Ingrese el número de Gigas de internet:");
                            double gigaInternet3 = sc.nextDouble();
                            System.out.println("Ingrese el costo de la giga de internet:");
                            double costoGiga3 = sc.nextDouble();
                            System.out.println("Ingrese porcentaje de descuento:");
                            double porcentaje = sc.nextDouble();
                            PlanPostPagoMinutosMegasEconomico pppmme = new PlanPostPagoMinutosMegasEconomico(
                                    minutosSaldo2, costoMinutoSaldo2, gigaInternet3, costoGiga3, porcentaje,
                                    nombre, cedula, ciudad, marca, modelo, numeroCelular);
                            c.insertarPlanPostPagoMinutosMegasEconomico(pppmme);
                            break;
                        default:
                            break;
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("Desea ingresar otro PLAN ?? Si[1]No[0]");
                    System.out.println("--------------------------------------");
                    op2 = sc.nextInt();
                    System.out.println("--------------------------------------");
                } while (op2 != 0);
            }
            if (op == 2) {
                int op3 = menu2();
                switch (op3) {
                    case 1:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        break;
                    case 3:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegas().get(i));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                        }
                        break;
                    case 5:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                        }
                        break;
                    default:
                        break;
                }
            }
        } while (op != 0);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("SELECIONES EL TIPO DE PLAN QUE DESEE INGRESAR");
        System.out.println("---------------------------------------------");
        System.out.println("Plan post pago minutos                    [1]");
        System.out.println("Plan post pago megas                      [2]");
        System.out.println("Plan post pago minutos megas              [3]");
        System.out.println("Plan post pago minutos megas economico    [4]");
        System.out.println("---------------------------------------------");
        int  op = sc.nextInt();
        System.out.println("---------------------------------------------");
        return op;
    }

    public static int menu2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("SELECIONE EL TIPO DE PLAN que desee visualizar");
        System.out.println("----------------------------------------------");
        System.out.println("Plan post pago minutos                     [1]");
        System.out.println("Plan post pago megas                       [2]");
        System.out.println("Plan post pago minutos megas               [3]");
        System.out.println("Plan post pago minutos megas economico     [4]");
        System.out.println("TODOS                                      [5]");
        System.out.println("----------------------------------------------");
        int  op = sc.nextInt();
        System.out.println("----------------------------------------------");
        return op;
    }

}
