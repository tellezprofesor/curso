package mx.edu.itlapiedad;

public class Triangulo {
	private int base;
	private int altura;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public float getArea() {
		
		return base *  altura / 2;
	}
	
}
