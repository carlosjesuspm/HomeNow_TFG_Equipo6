package ifp.homenow.bean;

import java.sql.Blob;

public class InmuebleBean {

	// Atributos
	private long idinmuebles;
	private String tipo;
	private int precio_inmueble;
	private int superficie;
	private DireccionBean direccion_inmueble;
	private int habitacion;
	private int bano;
	private Blob imagen_inmueble;
	private String descripcion_inmueble;
	
	
	public InmuebleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public InmuebleBean(long idinmuebles, String tipo, int precio_inmueble, int superficie, DireccionBean direccion_inmueble,
			int habitacion, int bano, Blob imagen_inmueble, String descripcion_inmueble) {
		super();
		this.idinmuebles = idinmuebles;
		this.tipo = tipo;
		this.precio_inmueble = precio_inmueble;
		this.superficie = superficie;
		this.direccion_inmueble = direccion_inmueble;
		this.habitacion = habitacion;
		this.bano = bano;
		this.imagen_inmueble = imagen_inmueble;
		this.descripcion_inmueble = descripcion_inmueble;
	}


	public long getIdinmuebles() {
		return idinmuebles;
	}


	public void setIdinmuebles(long idinmuebles) {
		this.idinmuebles = idinmuebles;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getPrecio_inmueble() {
		return precio_inmueble;
	}


	public void setPrecio_inmueble(int precio_inmueble) {
		this.precio_inmueble = precio_inmueble;
	}


	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}


	public DireccionBean getDireccion_inmueble() {
		return direccion_inmueble;
	}


	public void setDireccion_inmueble(DireccionBean direccion_inmueble) {
		this.direccion_inmueble = direccion_inmueble;
	}


	public int getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}


	public int getBano() {
		return bano;
	}


	public void setBano(int bano) {
		this.bano = bano;
	}


	public Blob getImagen_inmueble() {
		return imagen_inmueble;
	}


	public void setImagen_inmueble(Blob imagen_inmueble) {
		this.imagen_inmueble = imagen_inmueble;
	}


	public String getDescripcion_inmueble() {
		return descripcion_inmueble;
	}


	public void setDescripcion_inmueble(String descripcion_inmueble) {
		this.descripcion_inmueble = descripcion_inmueble;
	}


}
