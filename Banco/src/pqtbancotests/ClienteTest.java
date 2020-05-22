package pqtbancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pqtbanco.Cliente;

class ClienteTest {
	/**
	 * Test para probar el metodo calcularSaldoMedio de la clase Cliente
	 */
	@Test
	void testCalcularSaldoMedio() {
		
		Cliente cliente001 = new Cliente("Marta", "Calle Almería", "López", 001, 35);
		Cliente cliente002 = new Cliente("Luis", "Calle Río Jarama", "Pérez", 002, 19);
			
		int saldo1 = cliente001.getSaldo_medio();
		assertTrue(cliente001.calcularSaldoMedio());
		int saldo2 = cliente001.getSaldo_medio();
		assertNotEquals(saldo1, saldo2);
		
		int saldo3 = cliente002.getSaldo_medio();
		assertTrue(cliente002.calcularSaldoMedio());
		int saldo4 = cliente002.getSaldo_medio();
		assertNotEquals(saldo3, saldo4);
	}

}
