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

	public void ingresarDinero(int cantidad){
		
	}
	
	public boolean retirarDinero(int cantidad) {
		boolean validarRetirada = validarRetirada(cantidad);
		if(validarRetirada) {
			saldo = saldo - cantidad;
		}
		
		return true;
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
