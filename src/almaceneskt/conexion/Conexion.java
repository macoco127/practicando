/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package almaceneskt.conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conexion {
Connection con;

public Conexion(){
try{
Class.forName("com.mysql.jdbc.Driver");
con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen","root","20072004No");
System.out.println("Conectado");
}catch(Exception e){
System.out.println(e);
}

}
public Connection GetConection(){
return con;
}
}
