package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
		listado.add(this);
	}
	public Pez(String nombre,int edad,String habitat, String genero,String colorEs, int canAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEs;
		this.cantidadAletas = canAletas;
		listado.add(this);
	}
	public void setColorEscamas(String colorEs) {
		this.colorEscamas = colorEs;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setCantidadAletas (int canAletas) {
		this.cantidadAletas = canAletas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public static int cantidadMamifero() {
		return listado.size();
	}
	
	@Override
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Mamifero bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}

}
