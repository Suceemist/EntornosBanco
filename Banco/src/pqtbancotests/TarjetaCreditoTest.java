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
		//------------------------------------------id---saldo--lim--id2---fecha
		CuentaBancaria cuenta1 = new CuentaBancaria(001, 7000, 10000, 001, "05-06-2019");
		CuentaBancaria cuenta2 = new CuentaBancaria(002, 10000, 35000, 002, "25-02-2017");
		//------------------------------------------id---id2--limInt--limCajero
		TarjetaCredito tarjeta1 = new TarjetaCredito(001, 001, 500, 1000);
		TarjetaCredito tarjeta2 = new TarjetaCredito(002, 002, 2000, 1500);
		
		assertTrue(tarjeta1.pagarConTarjeta(500, cuenta1, 1));		//limite cajero ok & validar ok
		assertFalse(tarjeta1.pagarConTarjeta(1000, cuenta1, 1));	//limite cajero superado
		assertFalse(tarjeta1.pagarConTarjeta(7000, cuenta1, 1));	//validar retirada false
		assertTrue(tarjeta1.pagarConTarjeta(400, cuenta1, 2));		//limite internet ok & validar ok
		assertFalse(tarjeta1.pagarConTarjeta(500, cuenta1, 2));		//limite internet superado
		
		
		assertTrue(tarjeta2.pagarConTarjeta(1400, cuenta2, 1));		//limite cajero ok & validar ok
		assertFalse(tarjeta2.pagarConTarjeta(1500, cuenta2, 1));	//limite cajero superado
		assertFalse(tarjeta2.pagarConTarjeta(14000, cuenta2, 2));		//validar retirada false
		assertTrue(tarjeta2.pagarConTarjeta(1800, cuenta2, 2));		//limite internet ok & validar ok
		assertFalse(tarjeta2.pagarConTarjeta(2000, cuenta2, 2));	//limite internet superado
		
		assertFalse(tarjeta2.pagarConTarjeta(5, cuenta2, 5));	//escoger mal opción	
	}
}