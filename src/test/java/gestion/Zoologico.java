package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String ubicacion;
	private	String nombre;
	private List<Zona> zonas = new ArrayList<Zona> ();
	private int sumaAnimalesZonas = 0;
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void agregarZonas (Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		for (int i=0; i<zonas.size();i++) {
			sumaAnimalesZonas += zonas.get(i).cantidadAnimales();
		}
		return sumaAnimalesZonas;
	}
	public List<Zona> getZona(){
		return zonas;
		
	}
}
