package sistema;

public class SignoUsuario {

int idusuario;

String nombre;

String apellido;

String mes;

int dia;

String signo;

int cuantos;



DataUsuario du=null;



public SignoUsuario(){

du=new DataUsuario();

}



public boolean insertar() {

if(du.insertarUsuario(this)) {

return true;

}else {

return false;

}

}

public boolean consultar() {

if(du.consultarUsuario(this)) {

return true;

}else {

return false;

}

}


public boolean eliminar() {

if(du.eliminarUsuario(this)) {

return true;

}else {

return false;

}

}


public boolean actualizar() {

if(du.actualizarUsuario(this)) {

return true;

}else {

return false;

}

}



public int getIdusuario() {

return idusuario;

}

public void setIdusuario(int idusuario) {

this.idusuario = idusuario;

}

public String getNombre() {

return nombre;

}

public void setNombre(String nombre) {

this.nombre = nombre;

}

public String getApellido() {

return apellido;

}

public void setApellido(String apellido) {

this.apellido = apellido;

}

public String getMes() {

return mes;

}

public void setMes(Object object) {

this.mes = (String) object;

}

public int getDia() {

return dia;

}

public void setDia(int dia) {

this.dia = dia;

}
 


public String getSigno() {
return signo;
}



public void setSigno(String signo) {
this.signo = signo;
}



public int getCuantos() {
	return cuantos;
}



public void setCuantos(int cuantos) {
	this.cuantos = cuantos;
}


}
