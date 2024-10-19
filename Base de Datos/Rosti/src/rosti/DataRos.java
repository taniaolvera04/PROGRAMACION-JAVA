package rosti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class DataRos {
	private static final String controlador="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/rosti";
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
		DataRos dr=new DataRos();
		dr.conectar();
	}
	
	public int existeCliente(Rosticeria r) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		int cli=0;
		try {
			ps=conectar().prepareStatement("SELECT count(*) cuantos FROM compras WHERE id_c=?");
			ps.setInt(1, r.getIdc());
			rs=ps.executeQuery();
			
			if(rs.next()) {
				cli=(rs.getInt("cuantos"));
				System.out.println("Cuantos "+cli);
				r.setCuantos(cli);
			}
			return cli;
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
			
		}
	}





	public boolean insertarCliente(Rosticeria r) {
		PreparedStatement ps=null;
		try {
			ps=conectar().prepareStatement("INSERT INTO compras (id_c, nombre, producto, cantp, complemento, total, IVA) VALUES (?,?,?,?,?,?,?)");
			ps.setInt(1, r.getIdc());
			ps.setString(2, r.getNombre());
			ps.setString(3, r.getProducto());
			ps.setInt(4, r.getCantp());
			ps.setString(5, r.getComplemento());
			ps.setInt(6, r.getTotal());
			ps.setDouble(7, r.getIva());
			
		ps.executeUpdate();
		return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}


	
	public boolean consultarCliente(Rosticeria r) {

		PreparedStatement ps=null;
		ResultSet rs=null;
		DataRos dr=new DataRos ();

		dr.existeCliente(r);


		if(r.getCuantos()==1) {
		try {

		ps=conectar().prepareStatement("SELECT * FROM compras WHERE id_c=?");
		ps.setInt(1, r.getIdc());
		
		rs=ps.executeQuery();


		if(rs.next()) {
			
		r.setNombre(rs.getString("nombre"));
		r.setProducto(rs.getString("producto"));
		r.setCantp(rs.getInt("cantp"));
		r.setComplemento(rs.getString("complemento"));
		r.setTotal(rs.getInt("total"));
		r.setIva(rs.getDouble("IVA"));

		}

		return true;

		} catch (SQLException e) {
		
		return false;

		}

		}
		return false;
		}


	public boolean actualizarCliente(Rosticeria r) {
	PreparedStatement ps=null;
	DataRos dr=new DataRos ();
	dr.existeCliente(r);
	
	if(r.getCuantos()==1) {
	try {
	ps=conectar().prepareStatement("UPDATE compras SET nombre=?, producto=?, cantp=?, complemento=?, total=?, IVA=? WHERE id_c=?");
	ps.setString(1, r.getNombre());
	ps.setString(2, r.getProducto());
	ps.setInt(3, r.getCantp());
	ps.setString(4, r.getComplemento());
	ps.setInt(5, r.getTotal());
	ps.setDouble(6, r.getIva());
	ps.setInt(7, r.getIdc());
	ps.executeUpdate();
	return true;
	} catch (SQLException e) {
	return false;
	}
	}
	return false;
	}


	
	public boolean eliminarCliente(Rosticeria r) {

		PreparedStatement ps=null;
		DataRos dr=new DataRos();

		dr.existeCliente(r);

		if(r.getCuantos()==1) {

		try {

		ps=conectar().prepareStatement("DELETE FROM compras WHERE id_c=?");

		ps.setInt(1, r.getIdc());


		ps.executeUpdate();

		return true;

		} catch (SQLException e) {

		return false;

		}

		}
		return false;
		}

	
	
	
	

}
