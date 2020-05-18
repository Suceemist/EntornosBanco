package pqtbanco;

public class Cliente {
	private String nombre;
	private String direccion;
	private String apellido;
	private int nif;
	private int edad;
	private int total_gasto_tarjetas;
	private int saldo_medio;
	private int[] saldo_ultimos12m = new int[12];
	
	public int calcularSaldoMedio() {
		int saldo_total=0;
		
		
		for (int i = 0; i < saldo_ultimos12m.length; i++) {
			saldo_total+= saldo_ultimos12m[i];
		}
		saldo_medio=saldo_total/12;
		return saldo_medio;
	}
}
