package rosti;

import rosti.DataRos;

public class Rosticeria {
int idc;
String nombre;
String producto;
int cantp;
String complemento;
int total;
double iva;
int cuantos;


DataRos dr=null;

public Rosticeria() {
	dr=new DataRos();
}

public boolean insertar() {
	if(dr.insertarCliente(this)) {
		return true;
	}else {
		return false;
	}
}




public boolean consultar() {
	if(dr.consultarCliente(this)) {
		return true;
	}else {
		return false;
	}
}


public boolean actualizar() {
	if(dr.actualizarCliente(this)) {
		return true;
	}else {
		return false;
	}
}


public boolean eliminar() {
	if(dr.eliminarCliente(this)) {
		return true;
	}else {
		return false;
	}
}








public int getIdc() {
	return idc;
}
public void setIdc(int idc) {
	this.idc = idc;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public int getCantp() {
	return cantp;
}
public void setCantp(int cantp) {
	this.cantp = cantp;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public double getIva() {
	return iva;
}
public void setIva(double iv) {
	this.iva = iv;
}
public int getCuantos() {
	return cuantos;
}
public void setCuantos(int cuantos) {
	this.cuantos = cuantos;
}
}
