package fig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataFig {
	private static final String controlador="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/fig";
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
		System.out.println("Fallo en conexión");
			e.printStackTrace();
		}
		return cx;
	}
	
	
	public static void main(String[]args) {
		DataFig df=new DataFig();
		df.conectar();
	}
	
	public boolean insertarFigura(Figuras f) {
		PreparedStatement ps=null;
		try {
			ps=conectar().prepareStatement("INSERT INTO figura (id_f, nombref, a, b, c, area, peri) VALUES (?,?,?,?,?,?,?)");
			ps.setInt(1, f.getIdf());
			ps.setString(2, f.getNombref());
			ps.setDouble(3, f.getA());
			ps.setDouble(4, f.getB());
			ps.setDouble(5, f.getC());
			ps.setDouble(6, f.getArea());
			ps.setDouble(7, f.getPerimetro());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	
	public int existeFigura(Figuras f) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		int cli=0;
		try {
			ps=conectar().prepareStatement("SELECT count(*) cuantos FROM figura WHERE id_f=?");
			ps.setInt(1, f.getIdf());
			rs=ps.executeQuery();
			if(rs.next()) {
				cli=(rs.getInt("cuantos"));
				System.out.println("Cuantos " + cli);
				f.setCuantos(cli);
			}
			return cli;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	
	 
	 public boolean eliminarFigura(Figuras f) {
	PreparedStatement ps=null;
	DataFig df=new DataFig();
	df.existeFigura(f);
	if(f.getCuantos()==1) {
	try {
	ps=conectar().prepareStatement("DELETE FROM figura WHERE id_f=?");
	ps.setInt(1, f.getIdf());
	ps.executeUpdate();
	return true;
	
	
	
	}catch (SQLException e) {
	return false ;
	}
	}return false;
	 }
	
	
	 public boolean consultarFigura(Figuras f) {
			PreparedStatement ps=null;
			ResultSet rs=null;


			DataFig df=new DataFig();
			df.existeFigura(f);

			if(f.getCuantos()==1) {
			try {
			ps=conectar().prepareStatement("SELECT * FROM figura WHERE id_f=?");
			ps.setInt(1, f.getIdf());
			rs=ps.executeQuery();
			if(rs.next()) {
			f.setNombref(rs.getString("nombref"));
			f.setA(rs.getDouble("a"));
			f.setB(rs.getDouble("b"));
			f.setC(rs.getDouble("c"));
			f.setArea(rs.getDouble("area"));
			f.setPerimetro(rs.getDouble("peri"));
			}
			return true;

			}catch (Exception e2) {
			return false;
			}

			}
			return false;
			 }
			 
			 
	
	
	 public boolean actualizarFigura(Figuras f) {
		 PreparedStatement ps=null;
		 try {
		  ps=conectar().prepareStatement("UPDATE figura SET nombref=?, a=?, b=?, c=?, area=?, peri=? WHERE id_f=?");
		  ps.setInt(7, f.getIdf());
		  ps.setString(1, f.getNombref());
		 ps.setDouble(2, f.getA());
		 ps.setDouble(3, f.getB());
		 ps.setDouble(4, f.getC());
		 ps.setDouble(5, f.getArea());
		 ps.setDouble(6, f.getPerimetro());
		  ps.executeUpdate();
		 
		  return true;
		  
		 }catch(SQLException e) {
		  return false;
		 }
		}
		}
