
package conexionbasedatos;

import java.sql.*;


public class ConexionBaseDatos {


    public static void main(String[] args) {
        
        Connection conexion;
        Statement manipularBD;
        
        String hostname = "localhost";
        String puerto ="3306";
        String database_name = "app_java";
        String database_user = "root";
        String database_password =  "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try {
            conexion = DriverManager.getConnection(url, database_user, database_password);
            manipularBD = conexion.createStatement();
            System.out.println("conexion Exitosa a la base de datos"+database_name);
        }catch(SQLException e){
            System.err.println("Error en: "+e.getMessage() ) ;
            conexion = null;
            manipularBD = null;
        }
        
        if (conexion != null) {
            // extrayendo de la base de datos.
            
            try {
                String consulta = "SELECT * FROM personas";
                ResultSet registros = manipularBD.executeQuery(consulta);
                registros.next();
                if (registros.getRow()==1) {
                    
                    do {   
                        System.out.println("-----------------------------------------------------");
                        System.out.println("filas: "+registros.getRow());
                        System.out.println("cedula: "+registros.getString("cedula"));
                        System.out.println("nombres: "+registros.getString("nombres"));
                        System.out.println("apellidos: "+registros.getString("apellidos"));
                        System.out.println("telefono: "+registros.getString("telefono"));
                        System.out.println("direccion: "+registros.getString("direccion"));
                        System.out.println("email: "+registros.getString("email"));
                        System.out.println("-----------------------------------------------------");
                    } while (registros.next());
                    
                }else{
                    System.out.println("no hay personas registradas ");
                }
                
            } catch (SQLException e) {
                System.out.println("Errror en SELECT: "+e.getMessage());
            }
            
            //insertar una persona.
            String cedula = "108806";
            String nombres = "Francisco";
            String apellidos = "Ochoa";
            String telefono = "30006";
            String direccion = "Calle 06";
            String email = "fran@gmail.com";
            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, telefono, direccion, email)  VALUES  (' "+cedula+" ', ' "+nombres+" ', ' "+apellidos+" ', ' "+telefono+" ', ' "+direccion+" ', ' "+email+" ')";
            
            try {
                int respuesta = manipularBD.executeUpdate(consulta);
                if (respuesta > 0 ) {
                    System.out.println("resgistro inserta con exito");
                }
            } catch (SQLException e) {
                System.out.println("Errror en registar: "+e.getMessage());
            }
            
        }
        
    }
    
}
