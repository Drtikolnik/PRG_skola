import java.util.Scanner;

public class Trida {
	String nazevTridy;
	int pocetZaku;
	Zak[] zaci;

	public String getNazevTridy() {return nazevTridy;}
	public int getPocetZaku() {return pocetZaku;}

	public static Scanner sc = new Scanner(System.in);

	public Trida(String nazevTridy, int pocetZaku){
		this.nazevTridy = nazevTridy;
		this.pocetZaku = pocetZaku;
		zaci = new Zak[pocetZaku];
		for (int i = 0 ; i < zaci.length; i++) {
			zaci[i] = pridejZaka(i);
		}
	}

	private Zak pridejZaka(int i) {
		System.out.println("Zadej jméno " + (i+1) + ". Žáka: " );
		String jmeno = sc.nextLine();
		System.out.println("Zadej přijmení " + (i+1) + ". Žáka: " );
		String prijmeni = sc.nextLine();
		System.out.println("Zadej email " + (i+1) + ". Žáka: " );
		String email = sc.nextLine();
		return new Zak(jmeno, prijmeni, email);
	}



	public String toString(){
		String s = "Třída:" +nazevTridy+ ", Počet žáků:"+pocetZaku;
		for (int i = 0 ; i < zaci.length; i++) {
			s =s+ zaci[i].toString();
		}
		return s;
	}











	
}