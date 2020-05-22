package pqtbancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pqtbanco.CuentaBancaria;

class TarjetaCreditoTest {
	CuentaBancaria cuenta_univeral = new CuentaBancaria(001, 4000, 10000, 001, "05-06-2019");
	CuentaBancaria cuenta_univeral2 = new CuentaBancaria(002, 5000, 35000, 002, "25-02-2017");
	/**
	 * Test para probar el método pagarConTarjeta de la clase TarjetaCredito
	 */
	@Test
	void testPagarConTarjeta() {
		
	}

}
