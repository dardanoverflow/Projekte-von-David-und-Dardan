package Währungsrechner;
import java.util.Scanner;

public class Währungsrechner {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Möchten Sie die Umrechung in US-Dollar(1) oder Euro(2) umrechen?: ");
		int i; 
		i = sc.nextInt();
		if (i == 1) { 		// leitet die Umrechnung von Euro in Dollar ein
			System.out.println("Bitte geben sie Ihren Betrag in Euro ein: ");
			double t; 
			t = sc.nextDouble();
			System.out.println("Ihr angegebener Euro Wert entspricht " + t*1.18 + " US-Dollar.");
		} else if (i == 2) {		//leitet die Umrechnung von Dollar in Euro ein			
			System.out.println("Bitte geben sie Ihren Betrag in Dollar ein: ");
			double t;
			t = sc.nextDouble();
			System.out.println("Ihr Betrag entspricht "+ t/1.18+ "Euro.");
		} else {
			System.out.println("Bitte geben sie nur eine 1 oder 2 ein: "); //1 oder 2 als einzige Eingabemöglichkeiten
		}
            System.out.println("Möchten Sie nochmal eine Umrechung durchführen? J oder N "); //Schleife, wiederholen?
            String yes = "J";
            String no = "N";
            String a = sc.nextLine();
            if (a == no) {
            	System.out.print("Die Umrechnung wurde beendet.");
            }
            
		
            
            
	}
}