package Aplicacion;
import java.sql.*;

public class DBConexion {

	private String Usuario="root"; // usuario al cual se accede phpmyadmin
	private String Password=""; //clave al cual se accede phpmyadmin
	private static String NomBD="univsantotomas";
        static String Direccion="jdbc:mysql://localhost/"+NomBD;
	private Connection conexion=null;
	
	
	public DBConexion() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conexion= DriverManager.getConnection(Direccion,Usuario,Password);
			if (conexion!=null) {
				System.out.println("Conexion a BD  ..."+Direccion+" .... ok");
			}
			
		} catch (SQLException ex) {
			System.out.println("Conexion a BD  ..."+Direccion+" .... Failed");
			
		} catch (ClassNotFoundException e) {			
			System.out.println(e);
		}
	}
	
	//REALIZAR CONSULTAS SOBRE LA BD
	public ResultSet getQuery(String query){
		Statement Estado=null;
		ResultSet Resultado=null;
		try {
			Estado= conexion.createStatement();
			Resultado=Estado.executeQuery(query);
			
		} catch (SQLException ex) {
			
			ex.printStackTrace();
		}
				
		return Resultado;		
	}
	
	
	//Realizar modificaciones sobre la BD
	public void setquery(String Query){
		Statement estado=null;
		
		try {
			estado=conexion.createStatement();
			estado.execute(Query);
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
