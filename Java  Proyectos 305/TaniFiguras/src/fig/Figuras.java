package fig;

public class Figuras {
	int idf;
	String nombref;
	double a;
	double b;
	double c;
	double area;
	double perimetro;
	int cuantos;
	
	DataFig df=null;
	public Figuras() {
		df=new DataFig();
	}
	
	public boolean insertar() {
		if(df.insertarFigura(this)) {
			return true;
		}else {
		return false;
		}
	}
	
	public boolean consultar() {
		if(df.consultarFigura(this)) {
			return true;
		}else {
		return false;
		}
	}
	
	
	public boolean actualizar() {
		if(df.actualizarFigura(this)) {
			return true;
		}else {
		return false;
		}
	}
	
	public boolean eliminar() {
		if(df.eliminarFigura(this)) {
			return true;
		}else {
		return false;
		}
	}
	
	public int getIdf() {
		return idf;
	}
	public void setIdf(int idf) {
		this.idf = idf;
	}
	public String getNombref() {
		return nombref;
	}
	public void setNombref(String nombref) {
		this.nombref = nombref;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public int getCuantos() {
		return cuantos;
	}
	public void setCuantos(int cuantos) {
		this.cuantos = cuantos;
	}
	

}
