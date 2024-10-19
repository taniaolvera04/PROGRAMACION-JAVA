package Modelo;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.Statement;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

import Controlador.KirikoLRS;
import Vista.Login;


public class Conexion {
private static final String controlador="com.mysql.cj.jdbc.Driver";
private static final String url="jdbc:mysql://localhost:3306/kiriko";
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
		System.out.println("Se logró");
	} catch (SQLException e) {
		System.out.println("No se logró");
		e.printStackTrace();
	}
	return cx;
}


public static void main(String[]args) {
	Conexion c=new Conexion();
	c.conectar();
}

public int existe(KirikoLRS k) {
	PreparedStatement ps=null;
	ResultSet rs=null;
	int cli=0;
	try {
	ps= conectar().prepareStatement("SELECT COUNT(*) cuantos FROM usuario WHERE id_u=?");
	ps.setInt(1, k.getId());
	rs=ps.executeQuery();
	if(rs.next()) {
	cli=(rs.getInt("cuantos"));
	System.out.println("Cuantoossss "+ cli);
	k.setCuantos(cli);
	}
	return cli;
	 }catch (SQLException e) {
	e.printStackTrace();
	 }
	return 0;
	 }


public boolean insertarUsuario(KirikoLRS k) {
	PreparedStatement ps=null;
	try {
		ps=conectar().prepareStatement("INSERT INTO usuario(id_u, nombre, ap, ussername, password, tipo, codigo) VALUES(?, ?, ?, ?, ?, ?, ?)");
	ps.setInt(1, k.getId());
		ps.setString(2, k.getNombre());
		ps.setString(3, k.getAp());
		ps.setString(4, k.getNombreu());
		ps.setString(5, k.getContra());
		ps.setString(6, k.getTipo());
		ps.setString(7, k.getCodigo());
		ps.executeUpdate();
		return true;
		
	}catch(SQLException e) {
		return false;
		
	}
	
}


public boolean consultarUsuario(KirikoLRS k) {
	PreparedStatement ps=null;
	ResultSet rs=null;
	System.out.println("Entro");
	Conexion c=new Conexion();
	c.existe(k);
	
	if(k.getCuantos()==1)	{
	try {
	ps=conectar().prepareStatement("SELECT * FROM usuario WHERE id_u=?");
	ps.setInt(1, k.getId());
	rs=ps.executeQuery();
	if(rs.next()) {
		
		k.setId(rs.getInt("id_u"));
	
	}
	return true;
	}catch (Exception e2) {
	return false;
	}
	 }else {
	return false;
	 }
	 }

public boolean eliminarUsuario(KirikoLRS k) {
	PreparedStatement ps=null;
	Conexion c=new Conexion();
	c.existe(k);
	
	if(k.getCuantos()==1)	{
	try {
	ps=conectar().prepareStatement("DELETE FROM usuario WHERE id_u=?");
	ps.setInt(1, k.getId());
	ps.executeUpdate();
	return true;
	}catch (SQLException e) {
	return false ;
	}
	}else {
		return false;
	}
	 }
	 
	 
	 public boolean actualizarUsuario(KirikoLRS k) {
	 PreparedStatement ps=null;
	 System.out.println("Entro");
	 try {
		 System.out.println("Entro");
	 ps=conectar().prepareStatement("UPDATE usuario SET nombre=?, ap=?, ussername=?,password=?, WHERE id_u=?");
	 
	 ps.setInt(5, k.getId());
	 ps.setString(1, k.getNombre());
	 ps.setString(2, k.getAp());
	 ps.setString(3, k.getNombreu());
	 ps.setString(4, k.getContra());
	  ps.executeUpdate();
	  
	  return true;
	 }catch(SQLException e) {
	  return false;
	 }
	}

	 
	 
	 
	 
	 

	 public boolean insertarProducto(KirikoLRS k) {
			PreparedStatement ps=null;
			try {
				ps=conectar().prepareStatement("INSERT INTO producto(id_p, nombrep, precioc, preciov, cap, stock) VALUES(?, ?, ?, ?, ?, ?)");
			ps.setInt(1, k.getIdp());
				ps.setString(2, k.getNombrep());
				ps.setDouble(3, k.getPrecioc());
				ps.setDouble(4, k.getPreciov());
				ps.setDouble(5, k.getCapacidad());
				ps.setInt(6, k.getStock());
				ps.executeUpdate();
				return true;
				
			}catch(SQLException e) {
				return false;
				
			}
			
		}
	 
	 
	 public boolean actualizarProducto(KirikoLRS k) {
		 PreparedStatement ps=null;
		 System.out.println("Entro");
		 try {
			 System.out.println("Entro");
		 ps=conectar().prepareStatement("UPDATE producto SET nombrep=?, precioc=?, preciov=?, cap=?, stock=? WHERE id_p=?");
		 
		 
		 ps.setString(1, k.getNombrep());
		 ps.setDouble(2, k.getPrecioc());
		 ps.setDouble(3, k.getPreciov());
		 ps.setDouble(4, k.getCapacidad());
		 ps.setInt(5, k.getStock());
		 ps.setInt(6, k.getIdp());
		  ps.executeUpdate();
		  
		  return true;
		 }catch(SQLException e) {
		  return false;
		 }
		}
	 
	 
	 //////////////////////////////PROVEEDORES/////////////////////////////////////////////////
	 public boolean insertarProv(KirikoLRS kp) {
			PreparedStatement ps=null;
			try {
				System.out.println("Entro");
				ps=conectar().prepareStatement("INSERT INTO proveedores(id_prov, nombre_prov, tel) VALUES(?, ?, ?)");
			ps.setInt(1, kp.getIdprov());
			ps.setString(2, kp.getNombreprov());
				ps.setString(3, kp.getTel());
				ps.executeUpdate();
				return true;
				
			}catch(SQLException e) {
				return false;
				
			}
			
		}
	 public boolean actualizarProv(KirikoLRS kp) {
		 PreparedStatement ps=null;
		 System.out.println("Entro A");
		 try {
				ps=conectar().prepareStatement("UPDATE proveedores SET nombre_prov=?, tel=? WHERE id_prov=?");
			ps.setString(1, kp.getNombreprov());
				ps.setString(2,kp.getTel());
				 ps.setInt(3, kp.getIdprov());
				ps.executeUpdate();
				return true;
				
			}catch(SQLException e) {
return false;
}
	 
	 
	 }
	 
	 
	 
	 
	 public boolean insertarVentas(KirikoLRS k) {
			PreparedStatement ps=null;
			try {
				ps=conectar().prepareStatement("INSERT INTO ventas(id_u, total) VALUES(?, ?)");
			ps.setInt(1, k.getId());
				ps.setDouble(2, k.getTotal());
				ps.executeUpdate();
				return true;
				
			}catch(SQLException e) {
				return false;
				
			}
				
			}	
			
	 
	 public boolean insertarDetalleVentas(KirikoLRS k) {
			PreparedStatement ps=null;
			try {
				ps=conectar().prepareStatement("INSERT INTO detalle_ventas(id_p, cant) VALUES(?, ?)");
			ps.setInt(1, k.getIdp());
				ps.setInt(2, k.getCantidad());
				ps.executeUpdate();
				return true;
				
			}catch(SQLException e) {
				return false;
				
			}
				
			}	
			
			
	 
	 
	 
	 
	 
}
