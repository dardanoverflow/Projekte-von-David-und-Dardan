package Währungsrechner;
import java.util.Scanner;

public class Währungsrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do {
		
		System.out.println("Möchten Sie die Umrechung in US-Dollar(1) oder Euro(2) umrechen? ");
		int i; 
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Bitte geben sie Ihren Betrag in Euro ein ");
			double t; 
			t = sc.nextDouble(); // für die Umrechunug
			t = t * 1.18;
			System.out.println("Somit haben sie " + t + " Us-Dollar"); //Ausgabe 
		} else if (i == 2) {
			System.out.println("Bitte geben sie Ihren Betrag in Dollar ein ");
			double t;
			t = sc.nextDouble();
			t = t / 1.18; //Aktueller Umrechnungswert

		} else {
			System.out.println("Bitte geben sie nur eine 1 oder 2 ein "); //Damit die nur eine 1 oder 2 eingeben werden kann.
		}
            System.out.println("Möchten Sie nochmal eine umrechung durchführen? J/N ");
            char J;
            char N; 
            i = sc.next();
		} while ( J );
			System.out.println("Danke das Sie uns gewählt haben. Schönen Tag ");
		
		}
		
	}

//Währungsrechner
//1€ = 1.34$ von € in $ umrechnen
// wir rechnen den € Wert mal den $ wert und erhalten $
// David stinkt