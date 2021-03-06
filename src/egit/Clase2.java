package egit;

public class Clase2 extends Clase1 {
	private float sueldo;
	private String observaciones;

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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void aumentarSueldo(float aumento, float porcBonificacion) {
		float nuevoSueldo;

		nuevoSueldo = getSueldo() + aumento * (1 + porcBonificacion / 100);
		setSueldo(nuevoSueldo);
	}

	@Override
	public String toString() {
		return "Clase2 es [sueldo=" + sueldo + ", observaciones=" + observaciones
				+ "]";
	}

}
