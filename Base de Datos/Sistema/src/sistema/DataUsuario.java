package sistema;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.remote.SubjectDelegationPermission;



public class DataUsuario {



private static final String controlador="com.mysql.cj.jdbc.Driver";

private static final String url="jdbc:mysql://localhost:3306/signo305";

private static final String usuario="root";

private static final String password="";


static {

try {

Class.forName(controlador);

} catch (ClassNotFoundException e) {

e.printStackTrace();

}

}



public Connection conectar() {

Connection cx=null;

try {

cx=DriverManager.getConnection(url, usuario, password);

System.out.println("Conexión exitosa");

} catch (SQLException e) {

System.out.println("Fallo en Conexión");

e.printStackTrace();

}

return cx;

}


public int existeUsuario(SignoUsuario su) {
	PreparedStatement ps=null;
	ResultSet rs=null;
	int cli=0;
	try {
		ps=conectar().prepareStatement("SELECT count(*) cuantos FROM usuario WHERE id_u=?");
		ps.setInt(1, su.getIdusuario());
		rs=ps.executeQuery();
		
		if(rs.next()) {
			cli=(rs.getInt("cuantos"));
			System.out.println("Cuantos "+cli);
			su.setCuantos(cli);
		}
		return cli;
	}catch(SQLException e) {
		e.printStackTrace();
		return 0;
		
	}
}




public boolean insertarUsuario(SignoUsuario su) {

PreparedStatement ps=null;

try {

ps=conectar().prepareStatement("INSERT INTO usuario (id_u, nom_u, ap_u, mes, dia, signo) VALUES (?,?,?,?,?,?)");

ps.setInt(1, su.getIdusuario());

ps.setString(2, su.getNombre());

ps.setString(3, su.getApellido());

ps.setString(4, su.getMes());

ps.setInt(5, su.getDia());

ps.setString(6, su.getSigno());

ps.executeUpdate();

return true;

} catch (SQLException e) {

return false;

}

}



public boolean actualizarUsuario(SignoUsuario su) {

PreparedStatement ps=null;
DataUsuario du=new DataUsuario();
du.existeUsuario(su);

if(su.getCuantos()==1) {

try {

ps=conectar().prepareStatement("UPDATE usuario SET nom_u=?, ap_u=?, mes=?, dia=?, signo=? WHERE id_u=?");


ps.setString(1, su.getNombre());

ps.setString(2, su.getApellido());

ps.setString(3, su.getMes());

ps.setInt(4, su.getDia());

ps.setString(5, su.getSigno());

ps.setInt(6, su.getIdusuario());

ps.executeUpdate();

return true;

} catch (SQLException e) {

return false;

}

}
return false;
}







public boolean eliminarUsuario(SignoUsuario su) {

PreparedStatement ps=null;

DataUsuario du=new DataUsuario();
du.existeUsuario(su);

if(su.getCuantos()==1) {

try {

ps=conectar().prepareStatement("DELETE FROM usuario WHERE id_u=?");

ps.setInt(1, su.getIdusuario());


ps.executeUpdate();

return true;

} catch (SQLException e) {

return false;

}

}
return false;
}



public boolean consultarUsuario(SignoUsuario su) {

PreparedStatement ps=null;
ResultSet rs=null;
DataUsuario du=new DataUsuario();
du.existeUsuario(su);


if(su.getCuantos()==1) {
try {

ps=conectar().prepareStatement("SELECT * FROM usuario WHERE id_u=?");

ps.setInt(1, su.getIdusuario());


rs=ps.executeQuery();

if(rs.next()) {
su.setNombre(rs.getString("nom_u"));
su.setApellido(rs.getString("ap_u"));
su.setMes(rs.getString("mes"));
su.setDia(rs.getInt("dia"));
su.setSigno(rs.getString("signo"));
}

return true;

} catch (SQLException e) {

return false;

}

}
return false;
}






}


