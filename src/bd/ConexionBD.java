/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
//PASO 10 - Necesario para conexion con MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 ***Alicia Villarroel Astudillo
 * @author LP 13
 * Fecha:Noviembre 10 de 20017
 * Programa: pruebajava3
 * Responsabilidad: esta   clase  es para   declarar  los  objetos  de la coneccion con  el 
 * constructor  y  su  metodo iniciar  los  metodos y  su  definicionn  d e  esta 
 * para  realizar  la  coneccion  con bd 
 * @author sala306
 */
public class ConexionBD 
{
    //PASO 11 - DECLARANDO OBJETOS PARA LA CONEXION
    private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/conexion";
    
    //PASO 12 - COSTRUCTOR DE LA CLASE
    public ConexionBD()
    {
        conex = null;//Inicializar la variable 
        
        //Metodo para manejar excepciones
        try
        {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USER, PASS);
            if (conex != null) 
            {
             System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
         System.out.println("Error en la Conexion");
        }
    }
    
    //PASO 13 - DEFINICION METODOS PARA CONECTAR Y DESCONECTAR
    public Connection conectar()
    {
        return conex;//Retorna el objeto conex  
    }
    
    public void desconectar()
    {
      conex=null;
        if (conex==null) 
        {
          System.out.println("Conexion Finalizada");
        }
    }
}
