package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;

	public Reptil() {
		listado.add(this);
	}
	public Reptil(String nombre,int edad,String habitat, String genero,String coEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = coEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public void setColorEscamas (String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public static int cantidadReptiles() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return"reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde",3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil (nombre, edad, "jungla", genero, "blanco",1);
		serpientes++;
		return serpiente;
	}
	
}
