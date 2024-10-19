package cine;

public class Cinema {
int idp;
String nombre;
String pelicula;
int nobolad;
int noboln;
int total;
int cuantos;

public int getCuantos() {
	return cuantos;
}

public void setCuantos(int cuantos) {
	this.cuantos = cuantos;
}

DataCinema dc=null;

public Cinema() {
	dc=new DataCinema();
}

public boolean insertar() {
	if(dc.insertarCliente(this)) {
	return true;
}else {
	return false;
}
}



public boolean actualizar() {

if(dc.actualizarCliente(this)) {

return true;

}else {

return false;

}

}

public boolean consultar() {

if(dc.consultarCliente(this)) {

return true;

}else {

return false;

}

}



public boolean eliminar() {

if(dc.eliminarCliente(this)) {

return true;

}else {

return false;

}

}











public int getIdp() {
	return idp;
}

public void setIdp(int idp) {
	this.idp = idp;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPelicula() {
	return pelicula;
}

public void setPelicula(String pelicula) {
	this.pelicula = pelicula;
}

public int getNobolad() {
	return nobolad;
}

public void setNobolad(int nobolad) {
	this.nobolad = nobolad;
}

public int getNoboln() {
	return noboln;
}

public void setNoboln(int noboln) {
	this.noboln = noboln;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}



}