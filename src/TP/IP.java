package TP;

import java.util.Scanner;

public class IP {
	private String Pocteto;
	private String Socteto;
	private String Tocteto;
	private String Cocteto;
	
	public IP(String Po, String So, String To, String Co) {
		Pocteto = Po;
		Socteto = So;
		Tocteto = To;
		Cocteto = Co;
	}
	/*public void obtenerIP() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese primer octeto: ");
		Pocteto = s.nextLine();
		System.out.println("Ingrese segundo octeto: ");
		Socteto = s.nextLine();
		System.out.println("Ingrese tercer octeto: ");
		Tocteto = s.nextLine();
		System.out.println("Ingrese cuarto octeto: ");
		Cocteto = s.nextLine();
	}*/
	public void mostrar() {
		System.out.println(nombre);
	}
}
