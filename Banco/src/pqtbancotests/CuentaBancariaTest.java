package pqtbancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pqtbanco.CuentaBancaria;

class CuentaBancariaTest {
	CuentaBancaria cuenta_univeral = new CuentaBancaria(001, 4000, 10000, 001, "05-06-2019");
	CuentaBancaria cuenta_univeral2 = new CuentaBancaria(002, 5000, 35000, 002, "25-02-2017");
	/**
	 * Test para probar el método ingresarDinero de la clase CuentaBancaria
	 */
	@Test
	void testIngresarDinero() {
		assertEquals(cuenta_univeral.ingresarDinero(1000), 5000);
		assertNotEquals(cuenta_univeral.ingresarDinero(1000), 5000);
		
		assertEquals(cuenta_univeral2.ingresarDinero(1000), 6000);
		assertNotEquals(cuenta_univeral2.ingresarDinero(1000), 6000);
		
	}
	/**
	 * Test para probar el método retirarDinero de la clase CuentaBancaria
	 */
	@Test
	void testRetirarDinero() {
		assertEquals(cuenta_univeral.retirarDinero(1000), 3000);
		assertNotEquals(cuenta_univeral.retirarDinero(1000), 4000);
		//Si retiramos todo el dinero debería no poderse, y la cuenta 1 quedaría con su saldo actual, 2000€.
		assertEquals(cuenta_univeral.retirarDinero(2000), 2000);
		
		assertEquals(cuenta_univeral2.retirarDinero(1000), 4000);
		assertNotEquals(cuenta_univeral2.retirarDinero(1000), 5000);
		//Si retiramos todo el dinero debería no poderse, y la cuenta 1 quedaría con su saldo actual, 2000€.
		assertEquals(cuenta_univeral2.retirarDinero(3000), 3000);
		
		
		
		
		
	}
	/**
	 * Test para probar el método validarRetirada de la clase CuentaBancaria
	 */
	@Test
	void testValidarRetirada() {
		assertTrue(cuenta_univeral.validarRetirada(3500));
		assertFalse(cuenta_univeral.validarRetirada(4000));
		assertFalse(cuenta_univeral.validarRetirada(4001));
		
		assertTrue(cuenta_univeral2.validarRetirada(4000));
		assertFalse(cuenta_univeral2.validarRetirada(5000));
		assertFalse(cuenta_univeral2.validarRetirada(5001));
		
	}
}
