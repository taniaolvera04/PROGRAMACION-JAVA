package proyecto;


public class Constructores {

	int idusuario;
	String nombre;
	int peso;
	int altura;
	double imc;
	String estado;
	int cuantos;
	
	
	Base dc=null;
	public Constructores() {
		dc=new Base();
	}
	
	public boolean insertarcliente() {

		if(dc.insertar(this)) {
		return true;
		}else {
		return false;
		}
		}

		  public boolean consultar() {
			  
		 if(dc.consultar(this)) {
		   return true;
		}else {
		   return false;
		}
		  }
		  
		  public boolean eliminar() {
			  
			  if(dc.eliminar1(this)) {
			    return true;
			 }else {
			    return false;
			 }
			   }
		  
		  public boolean actualizar() {
			  
			  if(dc.actualizar(this)) {
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
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCuantos() {
		return cuantos;
	}

	public void setCuantos(int cuantos) {
		this.cuantos = cuantos;
	}
	
	
	}
