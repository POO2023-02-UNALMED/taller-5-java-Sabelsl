package zooAnimales;

import java.util.ArrayList;

public class Animal {
	public static int totalAnimales = 0;
	public static String nombre;
	public static int edad;
	public static String habitat;
	public static String genero;
	public List<Zona> zona = new ArrayList<Zona>();
	public Zoologico zoo;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad,String habitat, String genero) {
		Animal.nombre = nombre;
		Animal.edad = edad;
		Animal.habitat = habitat;
		Animal.genero = genero;
		totalAnimales++;
	}
	public void setToatalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public static int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	
	public static void setNombre(String nombre) {
		Animal.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public static void setEdad(int edad) {
		Animal.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public static void setHabitat(String habitat) {
		Animal.habitat = habitat;
	}
	public String getHabitat() {
		return habitat;
	}
	public static void setGenero(String genero) {
		Animal.genero = genero;	
	}
	public String getGenero() {
		return genero;
	}
	public String Movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAve: " + Ave.cantidadAves()+"\nReptiles: " + 
				"\nPeces: " + Pez.cantidadPeces()+ "\nAnfibios: "+Anfibio.cantidadAnfibios();
	}

	public String toString() {
		if (zoo = null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
		else {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+
		}
	}
	
}
