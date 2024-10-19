package Controlador;

import Modelo.Conexion;

public class KirikoLRS {
int id;
String nombreu;
String contra;
String codigo;
int cuantos;
String tipo;
String nombre;
String ap;

String nombrep;
double precioc;
double preciov;
double capacidad;
int stock;
int idp;


int foliov;

String nombreprov;
int idprov;
double total;



int cantidad;

double subtotal;
double iva;


String tel;


public int getFoliov() {
	return foliov;
}


public void setFoliov(int foliov) {
	this.foliov = foliov;
}


public double getTotal() {
	return total;
}


public void setTotal(double total) {
	this.total = total;
}

public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public double getSubtotal() {
	return subtotal;
}


public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
}


public double getIva() {
	return iva;
}


public void setIva(double iva) {
	this.iva = iva;
}

public String getTel() {
	return tel;
}


public void setTel(String tel) {
	this.tel = tel;
}


public String getNombreprov() {
	return nombreprov;
}


public void setNombreprov(String nombreprov) {
	this.nombreprov = nombreprov;
}


public int getIdprov() {
	return idprov;
}


public void setIdprov(int idprov) {
	this.idprov = idprov;
}

Conexion c=null;
public KirikoLRS() {
	c=new Conexion();
}


public boolean insertar() {
	if(c.insertarUsuario(this)) {
	return true;
	}else {
		return false;
	}
}
public boolean consultar() {
	  if(c.consultarUsuario(this)) {
	    return true;
	 }else {
	    return false;
	 }
	   }
public boolean eliminar() {
	  if(c.eliminarUsuario(this)) {
	    return true;
	 }else {
	    return false;
	 }
	   }
public boolean actualizar() {
	  if(c.actualizarUsuario(this)) {
	    return true;
	 }else {
	    return false;
	 }
	   }











public boolean insertarP() {
	if(c.insertarProducto(this)) {
	return true;
	}else {
		return false;
	}
}

public boolean insertarV() {
	if(c.insertarVentas(this)) {
	return true;
	}else {
		return false;
	}
}


public boolean actualizarP() {
	if(c.actualizarProducto(this)) {
	return true;
	}else {
		return false;
	}
}


public boolean insertarprov() {
	if(c.insertarProv(this)) {
	return true;
	}else {
		return false;
	}
}
public boolean actualizarprov() {
	  
	  if(c.actualizarProv(this)) {
	    return true;
	 }else {
	    return false;
	 }
	   }

public boolean insertarDV() {
	if(c.insertarDetalleVentas(this)) {
	return true;
	}else {
		return false;
	}
}










public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}

public int getIdp() {
	return idp;
}

public void setIdp(int idp) {
	this.idp = idp;
}

public String getNombrep() {
	return nombrep;
}

public void setNombrep(String nombrep) {
	this.nombrep = nombrep;
}

public double getPrecioc() {
	return precioc;
}

public void setPrecioc(double precioc) {
	this.precioc = precioc;
}

public double getPreciov() {
	return preciov;
}

public void setPreciov(double preciov) {
	this.preciov = preciov;
}

public double getCapacidad() {
	return capacidad;
}

public void setCapacidad(double capacidad) {
	this.capacidad = capacidad;
}


public String getNombre() { 
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getAp() {
	return ap;
}

public void setAp(String ap) {
	this.ap = ap;
}


public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNombreu() {
	return nombreu;
}


public void setNombreu(String nombreu) {
	this.nombreu = nombreu;
}


public String getContra() {
	return contra;
}


public void setContra(String contra) {
	this.contra = contra;
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public int getCuantos() {
	return cuantos;
}
public void setCuantos(int cuantos) {
	this.cuantos = cuantos;
}

}
