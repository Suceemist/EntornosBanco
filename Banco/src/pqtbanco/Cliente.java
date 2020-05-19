package pqtbanco;

public class Cliente {
	private String nombre;
	private String direccion;
	private String apellido;
	private int nif;
	private int edad;
	private int saldo_medio;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSaldo_medio() {
		return saldo_medio;
	}

	public void setSaldo_medio(int saldo_medio) {
		this.saldo_medio = saldo_medio;
	}

	public int calcularSaldoMedio() {
		int saldo_total=0;

		saldo_medio=saldo_total/12;
		return saldo_medio;
	}
	
}
