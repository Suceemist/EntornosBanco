package pqtbanco;

public class CuentaBancaria {
	private int nif_cliente;
	private int saldo;
	private int limite_max;
	private String fecha_apertura;
	private String nro_cuenta;
	
	public void ingresarDinero(){
		
	}
	
	public void retirarDinero() {
		
	}
	
	public boolean validarRetirada(int dinero) {
		boolean validarRetirada = true;
		int saldo_final = saldo - dinero;
		if (saldo_final <= 0) {
			validarRetirada = false;
		}
		return validarRetirada;
	}


}
