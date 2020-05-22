package pqtbanco;

public class CuentaBancaria {
	private int nif_cliente;
	private int saldo;
	private int limite_max;
	private int nro_cuenta;
	private String fecha_apertura;
	
	public CuentaBancaria(int nif_cliente, int saldo, int limite_max, int nro_cuenta, String fecha_apertura) {
		super();
		Cliente cliente = new Cliente();
		this.nif_cliente = cliente.getNif();
		this.saldo = saldo;
		this.limite_max = limite_max;
		this.nro_cuenta = nro_cuenta;
		this.fecha_apertura = fecha_apertura;
	}
	
	/**
     * 
     * @param cantidad Cantidad de dinero a ingresar en la cuenta bancaria 
     * 
     */

	public void ingresarDinero(int cantidad){
		saldo +=cantidad;
	}
	
	/**
     * 
     * @param cantidad Cantidad de dinero a retirar de la cuenta bancaria 
     * 
     */
	public void retirarDinero(int cantidad) {
		boolean validar_retirada = validarRetirada(cantidad);
		if(validar_retirada==true) {
			saldo = saldo - cantidad;
		}
	}
	
	/**
     * 
     * @param dinero Cantidad de dinero para validar su retirada en la cuenta bancaria 
     * @return boolean validacion de la retirada cuando la cuenta no se queda a 0
     */
	public boolean validarRetirada(int dinero) {
		boolean validarRetirada = true;
		int saldo_final = saldo - dinero;
		if (saldo_final <= 0) {
			validarRetirada = false;
		}
		return validarRetirada;
	}
}