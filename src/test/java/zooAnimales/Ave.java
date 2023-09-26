package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;

	public Ave() {
		listado.add(this);
	}
	public Ave(String nombre,int edad,String habitat, String genero,String colPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colPlumas;
		listado.add(this);
	}
	
	public void setColorPlumas (String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public static int cantidadAves() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	public static Ave  crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave (nombre, edad, "selva", genero, "blanco y amarilo");
		aguilas++;
		return aguila;
	}
	

}
