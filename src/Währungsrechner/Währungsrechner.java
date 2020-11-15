package Währungsrechner;
import java.util.Scanner;

public class Währungsrechner {

	static void Rechner() {
		Scanner sc = new Scanner(System.in);
		boolean invalidnum = false;
		double t;
		System.out.println("Möchten Sie die Umrechung in US-Dollar(1) oder Euro(2) umrechen?: ");
		do {
		int i = sc.nextInt();
		if (i == 1) { 															// leitet die Umrechnung von Euro in Dollar ein
			System.out.println("Bitte geben sie Ihren Betrag in Euro ein: ");
			t = sc.nextDouble();
			System.out.println("Ihr angegebener Euro Wert entspricht " + t*1.18 + " US-Dollar.");
			} else if (i == 2) {
			System.out.println("Bitte geben sie Ihren Betrag in Dollar ein: ");
			t = sc.nextDouble();				
			System.out.println("Ihr Betrag entspricht "+ t/1.18+ "Euro.");
			} else {
			invalidnum = true;
			System.out.println("Bitte geben sie nur eine 1 oder 2 ein: ");
			}
		} while (invalidnum = true);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rechner();
		boolean loop = true;
		while(loop) {
			System.out.print("Möchten Sie noch mal eine Umrechnung durchführen? ja oder nein?: ");
			String answer = " "; answer = sc.nextLine();	
			if (answer.equals("ja")) {
				Rechner();
			}
			else if (answer.equals("nein")) {
				loop = false;
				System.out.println("Sie haben den Währungsrechner beendet.");
			} else {
				System.out.println("Bitte wählen Sie nur zwischen ja und nein");
			}
		}
	}
}
 
            	
            
            
            