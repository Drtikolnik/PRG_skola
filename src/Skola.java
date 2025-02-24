import java.util.Scanner;

public class Skola {
	private String nazevSkoly;
	private String mesto;
	private int pocetTrid;
	private Trida[] tridy;

	public String getNazevSkoly() {return nazevSkoly;}
	public String getMesto() {return mesto;}
	public int getPocetTrid() {return pocetTrid;}
	//public Trida[] getTridy() {return tridy;}

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
		System.out.println("Zadej nazev " + (i+1) + ". tridy: " );
		String nazevTridy = sc.nextLine();
		System.out.println("Zadej pocet zaku " + (i+1) + ". tridy: " );
		int pocetZaku = sc.nextInt();
		sc.nextLine();
		return new Trida(nazevTridy, pocetZaku);
	}
	
	public void vypis() {
		for (int i = 0 ; i < tridy.length; i++) {
			System.out.println(tridy[i].toString());
		}

		
	}
}
