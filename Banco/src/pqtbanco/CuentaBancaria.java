package pqtbanco;

/**
*
* @author Ana
*/
public class CuentaBancaria {
	private int nif_cliente;
	private int saldo;
	private int limite_max;
	private int nro_cuenta;
	private String fecha_apertura;
	
	public CuentaBancaria(int nif_cliente, int saldo, int limite_max, int nro_cuenta, String fecha_apertura) {
		super();
		this.nif_cliente = nif_cliente;
		this.saldo = saldo;
		this.limite_max = limite_max;
		this.nro_cuenta = nro_cuenta;
		this.fecha_apertura = fecha_apertura;
	}
	
	public int getNif_cliente() {
		return nif_cliente;
	}

	public void setNif_cliente(int nif_cliente) {
		this.nif_cliente = nif_cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getLimite_max() {
		return limite_max;
	}

	public void setLimite_max(int limite_max) {
		this.limite_max = limite_max;
	}

	public int getNro_cuenta() {
		return nro_cuenta;
	}

	public void setNro_cuenta(int nro_cuenta) {
		this.nro_cuenta = nro_cuenta;
	}

	public String getFecha_apertura() {
		return fecha_apertura;
	}

	public void setFecha_apertura(String fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}

	/**
     * @param cantidad Cantidad de dinero a ingresar en la cuenta bancaria 
     */

	public int ingresarDinero(int cantidad){
		saldo +=cantidad;
		return saldo;
	}
	
	/**
     * @param cantidad Cantidad de dinero a retirar de la cuenta bancaria 
     */
	public int retirarDinero(int cantidad) {
		boolean validar_retirada = validarRetirada(cantidad);
		if(validar_retirada==true) {
			saldo = saldo - cantidad;
		}
		return saldo;
	}
	
	/**
     * @param dinero Cantidad de dinero para validar su retirada en la cuenta bancaria 
     * @return boolean validacion de la retirada cuando la cuenta no se queda a 0
     */
	public boolean validarRetirada(int dinero) {
		boolean validar_retirada = true;
		int saldo_final = saldo - dinero;
		if (saldo_final <= 0) {
			validar_retirada = false;
		}
		return validar_retirada;
	}
}