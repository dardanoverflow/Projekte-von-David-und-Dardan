package W�hrungsrechner;
import java.util.Scanner;

public class W�hrungsrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("M�chten Sie die Umrechung in US-Dollar(1) oder Euro(2) umrechen?: ");
		int i; 
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Bitte geben sie Ihren Betrag in Euro ein: ");
			double t; 
			t = sc.nextDouble(); // f�r die Umrechunug
			System.out.println("Ihr angegebener Euro Wert entspricht " + t*1.18 + " US-Dollar."); //Ausgabe 
		} else if (i == 2) {
			System.out.println("Bitte geben sie Ihren Betrag in Dollar ein: ");
			double t;
			t = sc.nextDouble();
			System.out.println("Ihr Betrag entspricht "+ t/1.18+ "Euro.");
		} else {
			System.out.println("Bitte geben sie nur eine 1 oder 2 ein: "); //Damit die nur eine 1 oder 2 eingeben werden kann.
		}
            System.out.println("M�chten Sie nochmal eine umrechung durchf�hren? J oder N ");
	}
}