package pqtbanco;

public class TarjetaCredito {
	private int nro_tarjeta;
	private int nro_cuenta;
	private int limite_internet;
	private int limite_cajero;
	CuentaBancaria cuenta = new CuentaBancaria();
	
	public void pagarConTarjeta(int dinero) {
		
		boolean pago_validado = cuenta.validarRetirada(dinero);
		
	}
	
}
