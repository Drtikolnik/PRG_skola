import java.util.Scanner;

public class Skola {
	private String nazevSkoly;
	private String mesto;
	private int pocetTrid;
	private Trida[] tridy;
	
	public static Scanner sc = new Scanner(System.in);
	
	public Skola(String nazevSkoly, String mesto, int pocetTrid) {
		this.nazevSkoly = nazevSkoly;
		this.mesto = mesto;
		this.pocetTrid = pocetTrid;
		tridy = new Trida[pocetTrid];
		for (int i = 0 ; i < pocetTrid; i++) {
			tridy[i] = pridejTridu(i);
		}
	}
	
	
	private Trida pridejTridu(int i) {
		System.out.println("Zadej n�zev " + (i+1) + ". tridy: " );
		String nazevTridy = sc.nextLine();
		System.out.println("Zadej po�et ��k� " + (i+1) + ". tridy: " );
		int pocetZaku = sc.nextInt();
		sc.nextLine();
		return new Trida(nazevTridy, pocetZaku);
	}
	
	public void vypis() {
		
		System.out.println("Zde bude vypis, ale jeste neni naimplementovann.");
		
	}
}
