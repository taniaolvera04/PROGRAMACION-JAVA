package cine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cine.DataCinema;

public class DataCinema {

private static final String controlador="com.mysql.cj.jdbc.Driver";
private static final String url="jdbc:mysql://localhost:3306/cinema";
private static final String usuario="root";
private static final String password="";



static {
	try {
		Class.forName(controlador);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public Connection conectar() {
	Connection cx=null;
	try {
		cx=DriverManager.getConnection(url, usuario, password);
		System.out.println("Conexión exitosa");
	} catch (SQLException e) {
		System.out.println("Fallo");
		e.printStackTrace();
	}
	return cx;
}

public static void main(String[]args) {
	DataCinema dc=new DataCinema();
	dc.conectar();
}


public int existeCliente(Cinema c) {
	PreparedStatement ps=null;
	ResultSet rs=null;
	int cli=0;
	try {
		ps=conectar().prepareStatement("SELECT count(*) cuantos FROM cine WHERE id_p=?");
		ps.setInt(1, c.getIdp());
		rs=ps.executeQuery();
		
		if(rs.next()) {
			cli=(rs.getInt("cuantos"));
			System.out.println("Cuantos "+cli);
			c.setCuantos(cli);
		}
		return cli;
	}catch(SQLException e) {
		e.printStackTrace();
		return 0;
		
	}
}






public boolean insertarCliente(Cinema c) {
	PreparedStatement ps=null;
	try {
		ps=conectar().prepareStatement("INSERT INTO cine (id_p, nombre, pelicula, no_bolad, no_bol_n, total) VALUES (?,?,?,?,?,?)");
		ps.setInt(1, c.getIdp());
		ps.setString(2, c.getNombre());
		ps.setString(3, c.getPelicula());
		ps.setInt(4, c.getNobolad());
		ps.setInt(5, c.getNoboln());
		ps.setInt(6, c.getTotal());
		
	ps.executeUpdate();
	return true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	
}





public boolean eliminarCliente(Cinema c) {

PreparedStatement ps=null;
DataCinema dc=new DataCinema();

dc.existeCliente(c);

if(c.getCuantos()==1) {

try {

ps=conectar().prepareStatement("DELETE FROM cine WHERE id_p=?");

ps.setInt(1, c.getIdp());


ps.executeUpdate();

return true;

} catch (SQLException e) {

return false;

}

}
return false;
}


public boolean actualizarCliente(Cinema c) {
	DataCinema dc=new DataCinema();
PreparedStatement ps=null;
dc.existeCliente(c);

if(c.getCuantos()==1) {

try {

ps=conectar().prepareStatement("UPDATE cine SET nom=?, pelicula=?, no_bolad=?, no_bol_n=?, total=? WHERE id_p=?");


ps.setString(1, c.getNombre());

ps.setString(2, c.getPelicula());

ps.setInt(3, c.getNobolad());

ps.setInt(4, c.getNoboln());

ps.setInt(5, c.getTotal());

ps.setInt(6, c.getIdp());


ps.executeUpdate();

return true;

} catch (SQLException e) {

return false;

}

}
return false;
}






public boolean consultarCliente(Cinema c) {

PreparedStatement ps=null;
ResultSet rs=null;
DataCinema dc=new DataCinema();

dc.existeCliente(c);


if(c.getCuantos()==1) {
try {

ps=conectar().prepareStatement("SELECT * FROM cine WHERE id_p=?");

ps.setInt(1, c.getIdp());
rs=ps.executeQuery();


if(rs.next()) {
	
c.setNombre(rs.getString("nombre"));
c.setPelicula(rs.getString("pelicula"));
c.setNobolad(rs.getInt("no_bolad"));
c.setNoboln(rs.getInt("no_bol_n"));
c.setTotal(rs.getInt("total"));

}

return true;

} catch (SQLException e) {
	dc.eliminarCliente(c);

return false;

}

}
return false;
}










}
