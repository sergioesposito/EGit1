package egit;

public class Clase1 {
	private int id;
	private String nombre;

	public Clase1(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void dummy1() {

	}

	public void dummy2() {

	}

	@Override
	public String toString() {
		return "Clase1 [id=" + id + ", nombre=" + nombre + "]";
	}

}
