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
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanCelular.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

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
            String data = String.format("INSERT INTO planPostPagoMinutos (nombrePropietario,cedulaPropietario,"
                    + "ciudadPropietario,marcaCelular,modeloCelular,numeroCelular,minutosNacionales,costoMinutoNacional,"
                           + "minutosInternacionales,costoMinutoInternacional) values "
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
                    + "('%s', '%s', '%s', '%s', '%s', %d, %f, %f, %f, %f, %f)", 
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
                    + "gigasInternet,costoGiga) values "
                    + "('%s', '%s', '%s', '%s', '%s', %d, %f, %f, %f, %f)", 
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
    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas pm = new PlanPostPagoMegas();
                pm.establecerNombrePropietario(rs.getString("nombrePropietario"));
                pm.establecerCedulaPropietario(rs.getString("cedulaPropietario"));
                pm.establecerCiudadPropietario(rs.getString("ciudadPropietario"));
                pm.establecerMarcaCelular(rs.getString("marcaCelular"));
                pm.establecerModeloCelular(rs.getString("marcaCelular"));
                pm.establecerNumeroCelular(rs.getInt("numeroCelular"));
                pm.establecerGigasInternet(rs.getDouble("gigasInternet"));
                pm.establecerCostoGigasInternet(rs.getDouble("costoGigasInternet"));
                pm.establecerTarifaBase(rs.getDouble("tarifaBase"));
                pm.establecerPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos pm = new PlanPostPagoMinutos();
                pm.establecerNombrePropietario(rs.getString("nombrePropietario"));
                pm.establecerCedulaPropietario(rs.getString("cedulaPropietario"));
                pm.establecerCiudadPropietario(rs.getString("ciudadPropietario"));
                pm.establecerMarcaCelular(rs.getString("marcaCelular"));
                pm.establecerModeloCelular(rs.getString("marcaCelular"));
                pm.establecerNumeroCelular(rs.getInt("numeroCelular"));
                pm.establecerMinutosNacionales(rs.getDouble("minutosNacionales"));
                pm.establecerCostoMinutoInternacional(rs.getDouble("costoMinutoNacional"));
                pm.establecerMinutosInternacionales(rs.getDouble("minutosInternacionales"));
                pm.establecerCostoMinutoInternacional(rs.getDouble("costoMinutoInternacional"));
                pm.establecerPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {
        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegas pm = new PlanPostPagoMinutosMegas();
                pm.establecerNombrePropietario(rs.getString("nombrePropietario"));
                pm.establecerCedulaPropietario(rs.getString("cedulaPropietario"));
                pm.establecerCiudadPropietario(rs.getString("ciudadPropietario"));
                pm.establecerMarcaCelular(rs.getString("marcaCelular"));
                pm.establecerModeloCelular(rs.getString("marcaCelular"));
                pm.establecerNumeroCelular(rs.getInt("numeroCelular"));
                pm.establecerMinutosSaldo(rs.getDouble("minutosSaldo"));
                pm.establecerCostoMinutosSaldo(rs.getDouble("costoMinutosSaldo"));
                pm.establecerGigasInternet(rs.getDouble("gigasInternet"));
                pm.establecerCostoGiga(rs.getDouble("costoGiga"));
                pm.establecerPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }
        public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanPostPagoMinutosMegasEconomico() {
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico pm = new PlanPostPagoMinutosMegasEconomico();
                pm.establecerNombrePropietario(rs.getString("nombrePropietario"));
                pm.establecerCedulaPropietario(rs.getString("cedulaPropietario"));
                pm.establecerCiudadPropietario(rs.getString("ciudadPropietario"));
                pm.establecerMarcaCelular(rs.getString("marcaCelular"));
                pm.establecerModeloCelular(rs.getString("marcaCelular"));
                pm.establecerNumeroCelular(rs.getInt("numeroCelular"));
                pm.establecerMinutosSaldo(rs.getDouble("minutosSaldo"));
                pm.establecerCostoMinutosSaldo(rs.getDouble("costoMinutosSaldo"));
                pm.establecerGigasInternet(rs.getDouble("gigasInternet"));
                pm.establecerCostoGiga(rs.getDouble("costoGiga"));
                pm.establecerPorcentajeDescuento(rs.getDouble("porcentajeDescuento"));
                pm.establecerPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
