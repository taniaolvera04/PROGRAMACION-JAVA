package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Base {

	 private static final String controlador="com.mysql.cj.jdbc.Driver";
	 private static final String url="jdbc:mysql://localhost:3306/proyecto";
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
	  Connection CX=null;
	  try {
	   CX=DriverManager.getConnection(url,usuario,password);
	   System.out.println("Conexion exitosa ");
	   
	  } catch (SQLException e) {
	   System.out.println("Fallo en la conexion");
	   e.printStackTrace();
	   
	  }
	  return CX;
	 }
	 
	 public static void main(String []args ) {
	  Base dc=new Base();
	 dc.conectar();
	 }
	 
	 
	 public boolean insertar(Constructores ng) { 
		   
	  PreparedStatement PS=null;
	  
	  try {
		  
	   PS=conectar().prepareStatement("INSERT INTO cal2(nombre,peso,altura,imc,estado) VALUES(?,?,?,?,?)");
	   	   
	   PS.setString(1, ng.getNombre());
	   PS.setInt(2, ng.getPeso());
	   PS.setInt(3, ng.getAltura());
	   PS.setDouble(4,ng.getImc());
	   PS.setString(5, ng.getEstado());
	   System.out.println("entro");
	   
	  PS.executeUpdate();
	   
	   return true;
	  }catch(SQLException e) {
		  e.printStackTrace();
	   return false;
	  }
	 }
	 
	 
	public int existe(Constructores ng) {
	PreparedStatement PS=null;
	ResultSet rs=null;
	int cli=0;
	try {
	PS=conectar().prepareStatement("SELECT COUNT(*) cuantos FROM cal2 WHERE id=?");
	PS.setInt(1, ng.getIdusuario());
	rs=PS.executeQuery();
	if(rs.next()) {
	cli=(rs.getInt("cuantos"));
	System.out.println("Cuantoos "+ cli);
	ng.setCuantos(cli);
	}
	return cli;

	 }catch (SQLException e) {
	e.printStackTrace();
	return 0;
	 }
	 }
	 
	 
	 public boolean consultar(Constructores ng) {
	PreparedStatement PS=null;
	ResultSet rs=null;
	System.out.println("Entro");
	Base cn=new Base();
	cn.existe(ng);
	
	if(ng.getCuantos()==1)	{
	try {
	PS=conectar().prepareStatement("SELECT * FROM cal2 WHERE id=?");
	PS.setInt(1, ng.getIdusuario());
	rs=PS.executeQuery();
	if(rs.next()) {
		
	ng.setNombre(rs.getString("nombre"));
	ng.setPeso(rs.getInt("peso"));
	ng.setAltura(rs.getInt("altura"));
	ng.setEstado(rs.getString("estado"));
	ng.setImc(rs.getDouble("imc"));

	
	}
	return true;

	}catch (Exception e2) {
		e2.printStackTrace();
	return false;
	}
	 }else {
	return false;
	 }
	 }
	 
	 
	 

	 public boolean eliminar1(Constructores ng) {
	PreparedStatement ps=null;
	Base cn=new Base();
	cn.existe(ng);
	
	if(ng.getCuantos()==1)	{
	try {
	ps=conectar().prepareStatement("DELETE FROM cal2 WHERE id=?");
	ps.setInt(1, ng.getIdusuario());
	ps.executeUpdate();
	return true;
	}catch (SQLException e) {
	return false ;
	}
	}else {
		return false;
	}
	 }
	 
	 
	 public boolean actualizar(Constructores ng) {
	 PreparedStatement Ps=null;
	 
	// System.out.println("Entro");
	 try {
		 System.out.println("Entro");
	 Ps=conectar().prepareStatement("UPDATE cal2 SET nombre=?,altura=?,peso=?,imc=?,estado=? WHERE id=?");
	 
	  
	   Ps.setString(1, ng.getNombre());
	   Ps.setInt(2, ng.getAltura());
	   Ps.setInt(3, ng.getPeso());
	   Ps.setDouble(4, ng.getImc());
	   Ps.setString(5, ng.getEstado());
	   Ps.setInt(6, ng.getIdusuario());
	   
	  Ps.executeUpdate();
	  
	  return true;
	 }catch(SQLException e) {
	  return false;
	 }
	}


}
