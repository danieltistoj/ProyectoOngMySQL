/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ongproyecto;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class OngProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // 1. Conectarse a la base de datos, esta linea registra el Driver, ya sea Oracle o ya sea MySQL, depende del caso. Se provee el localizador a la base de datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            /*2. En este paso hacemos uso de la clase "Connection" y lo que hace es la conexion con el gestor de base de datos al instanciar esta clase, 
            llevara la cadena de conexio, que es la informacion necesaria para conectarse: nombre de la ruta, contraseña y puerto.
            El DriverManager es una case de SQL, que nos permiten tomar la conexion. 
            */
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3305/basedatosong","root","xela2020");
            /*3. Esta linea donde ponemos es Statement, no permite enviar sentencias a la base de datos, como Query: INSERT, UPDATA, etc. 
            Y esta nos va a devolver un conjunto de datos.
            */
            Statement sentencia = conexion.createStatement();
            //Esto se utiliza para las instrucciones de modificacion. 
            //sentencia.executeUpdate(sql);
            //4.El ResultSet es el resultado de la sentencia en donde se hara el Query, recibe los datos de la sentecia. 
            ResultSet resultSet = sentencia.executeQuery("select * from familia");
            //5. Obtener los datos con el interador de ResultSet
            while(resultSet.next()){
                System.out.println(resultSet.getString("municipio"));
            }
            
            resultSet.close();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            
        }
    }
    
}
