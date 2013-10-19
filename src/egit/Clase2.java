package egit;

public class Clase2 extends Clase1 {
	private float sueldo;

	public Clase2(int id, String nombre, float sueldo) {
		super(id, nombre);
		this.sueldo = sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public void aumentarSueldo(float aumento) {
		float nuevoSueldo;
		nuevoSueldo = getSueldo() + aumento;
		setSueldo(nuevoSueldo);
	}
}
