package pqtbancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pqtbanco.CuentaBancaria;
import pqtbanco.TarjetaCredito;

class TarjetaCreditoTest {
	/**
	 * Test para probar el método pagarConTarjeta de la clase TarjetaCredito
	 */
	@Test
	void testPagarConTarjeta() {
		CuentaBancaria cuenta1 = new CuentaBancaria(001, 4000, 10000, 001, "05-06-2019");
		CuentaBancaria cuenta2 = new CuentaBancaria(002, 5000, 35000, 002, "25-02-2017");
		
		TarjetaCredito tarjeta1 = new TarjetaCredito(001, 001, 500, 1000);
		TarjetaCredito tarjeta2 = new TarjetaCredito(002, 002, 1500, 1500);
		
		assertTrue(tarjeta1.pagarConTarjeta(500, cuenta1));
		assertFalse(tarjeta1.pagarConTarjeta(500, cuenta1));
		assertFalse(tarjeta1.pagarConTarjeta(500, cuenta1));
		assertFalse(tarjeta1.pagarConTarjeta(500, cuenta1));
		
		assertTrue(tarjeta2.pagarConTarjeta(500, cuenta2));
		assertFalse(tarjeta2.pagarConTarjeta(500, cuenta2));
		assertFalse(tarjeta2.pagarConTarjeta(500, cuenta2));
		assertFalse(tarjeta2.pagarConTarjeta(500, cuenta2));
		
	}

}
