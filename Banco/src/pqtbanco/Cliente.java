package pqtbanco;
/**
*
* @author Ana
*/

public class Cliente {
	private String nombre;
	private String direccion;
	private String apellido;
	private int nif;
	private int edad;
	private int saldo_medio;
	
	
	public Cliente(String nombre, String direccion, String apellido, int nif, int edad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.apellido = apellido;
		this.nif = nif;
		this.edad = edad;
	}


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
	
	/**
     * @return int saldo medio de este perfil de usuario durante los últimos 12 meses
     */
	public boolean calcularSaldoMedio() {
		boolean saldo_calculado = true;
		int saldo_total=0;
		saldo_total = (int) (100000*Math.random());
		saldo_total = Math.round(saldo_total);
		
		if(saldo_total>0) {
			int media=saldo_total/12;
			setSaldo_medio(media);
			return saldo_calculado;
		}
		else {
			saldo_calculado = false;
			return saldo_calculado;
		}
	}
}
