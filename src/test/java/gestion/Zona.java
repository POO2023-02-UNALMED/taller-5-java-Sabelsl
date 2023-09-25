package gestion;

import java.util.ArrayList;

public class Zona {
	private String nombre;
	private static Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {
		
	}
	
	public Zona (String nombre,Zoologico zoo) {
		this.nombre = nombre;
		Zona.zoo = zoo;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		Zona.zoo = zoo;
	}
	public static Zoologico getzoo() {
		return zoo;
	}
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimal() {
		return animales.size();
	}

}
