/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.*;

/**
 *
 * @author mateovalarezoojeda
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {
        try {
            String url = "";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Connection obtenerConexion(){
        return conn;
    }
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas p1) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMegas (nombrePropietario,cedulaPropietario,"
                    + "ciudadPropietario,marcaCelular,modeloCelular,numeroCelular,gigasInternet,"
                    + "costoGigasInternet,tarifaBase) values "
                    + "('%s', '%s', '%s', '%s', '%s', %d, %f, %f, %f)", 
                    p1.obtenerNombrePropietario(),p1.obtenerCedulaPropietario(),p1.obtenerCiudadPropietario(),
                    p1.obtenerMarcaCelular(),p1.obtenerModeloCelular(),p1.obtenerNumeroCelular(),
                    p1.obtenerGigasInternet(),p1.obtenerCostoGigasInternet(),p1.obtenerTarifaBase());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
        public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos p1) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMegas (nombrePropietario,cedulaPropietario,"
                    + "ciudadPropietario,marcaCelular,modeloCelular,numeroCelular,minutosNacionales,costoMinutoNacional,minutosInternacionales,costoMinutoInternacional) values "
                    + "('%s', '%s', '%s', '%s', '%s', %d, %f, %f, %f, %f)", 
                    p1.obtenerNombrePropietario(),p1.obtenerCedulaPropietario(),p1.obtenerCiudadPropietario(),
                    p1.obtenerMarcaCelular(),p1.obtenerModeloCelular(),p1.obtenerNumeroCelular(),p1.obtenerMinutosNacionales(),
                    p1.obtenerCostoMinutoNacional(),p1.obtenerMinutosInternacionales(),p1.obtenerCostoMinutoInternacional());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico p1) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico (nombrePropietario,cedulaPropietario,"
                    + "ciudadPropietario,marcaCelular,modeloCelular,numeroCelular,minutosSaldo,costoMinutosSaldo,"
                    + "gigasInternet,costoGiga,porcentajeDescuento) values "
                    + "('%s', '%s', '%s', '%s', '%s', %d, %f, %f, %f)", 
                    p1.obtenerNombrePropietario(),p1.obtenerCedulaPropietario(),p1.obtenerCiudadPropietario(),
                    p1.obtenerMarcaCelular(),p1.obtenerModeloCelular(),p1.obtenerNumeroCelular(),p1.obtenerMinutosSaldo(),
                    p1.obtenerCostoMinutosSaldo(),p1.obtenerGigasInternet(),p1.obtenerCostoGiga(),p1.obtenerPorcentajeDescuento());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas p1) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegas (nombrePropietario,cedulaPropietario,"
                    + "ciudadPropietario,marcaCelular,modeloCelular,numeroCelular,minutosSaldo,costoMinutosSaldo,"
                    + "gigasInternet,costoGiga,porcentajeDescuento) values "
                    + "('%s', '%s', '%s', '%s', '%s', %d, %f, %f, %f)", 
                    p1.obtenerNombrePropietario(),p1.obtenerCedulaPropietario(),p1.obtenerCiudadPropietario(),
                    p1.obtenerMarcaCelular(),p1.obtenerModeloCelular(),p1.obtenerNumeroCelular(),p1.obtenerMinutosSaldo(),
                    p1.obtenerCostoMinutosSaldo(),p1.obtenerGigasInternet(),p1.obtenerCostoGiga());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
}
