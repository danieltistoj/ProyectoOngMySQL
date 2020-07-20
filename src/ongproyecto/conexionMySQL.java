/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ongproyecto;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class conexionMySQL extends ConexionBD {

    public conexionMySQL(String puerto,String baseDatos,String usuario,String password){
        super("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost"+":"+puerto+"/"+baseDatos,usuario,password);
    }
    
    public conexionMySQL(String baseDatos,String usuario,String password){
        super("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost"+"/"+baseDatos);
    }
}
