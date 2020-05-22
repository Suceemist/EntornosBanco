package pqtbanco;
/**
* @author Ana
*/

public class TarjetaCredito {
	private int nro_tarjeta;
	private int nro_cuenta;
	private int limite_internet;
	private int limite_cajero;
	 
	public TarjetaCredito(int nro_tarjeta, int nro_cuenta, int limite_internet, int limite_cajero) {
		super();
		this.nro_tarjeta = nro_tarjeta;
		this.nro_cuenta = nro_cuenta;
		this.limite_internet = limite_internet;
		this.limite_cajero = limite_cajero;
	}

	public int getNro_tarjeta() {
		return nro_tarjeta;
	}

	public void setNro_tarjeta(int nro_tarjeta) {
		this.nro_tarjeta = nro_tarjeta;
	}

	public int getNro_cuenta() {
		return nro_cuenta;
	}

	public void setNro_cuenta(int nro_cuenta) {
		this.nro_cuenta = nro_cuenta;
	}

	public int getLimite_internet() {
		return limite_internet;
	}

	public void setLimite_internet(int limite_internet) {
		this.limite_internet = limite_internet;
	}

	public int getLimite_cajero() {
		return limite_cajero;
	}

	public void setLimite_cajero(int limite_cajero) {
		this.limite_cajero = limite_cajero;
	}

	/**
     * @param  dinero - cantidad que se quiere pagar con tarjeta de cr�dito
     * @param  cuenta - cuenta de la que se quiere comprobar y retirar el dinero para pagar
     */
	public boolean pagarConTarjeta(int dinero, CuentaBancaria cuenta) {
		boolean pago_hecho = true;
		pago_hecho = cuenta.validarRetirada(dinero);
		int saldo = cuenta.getSaldo();
		
		if (pago_hecho==true) {
			if (dinero >= limite_internet || dinero >= limite_cajero) {
				pago_hecho = false;
			}
			else {
				int saldo_nuevo = saldo - dinero;
				cuenta.setSaldo(saldo_nuevo);
			}
		}
		else {
			pago_hecho = false;
		}
		return pago_hecho;
	}
}