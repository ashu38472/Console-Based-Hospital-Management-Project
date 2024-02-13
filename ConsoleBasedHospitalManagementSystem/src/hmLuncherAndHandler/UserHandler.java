package hmLuncherAndHandler;

import java.util.Scanner;

import input.Input;
import serviceOffer.Consultation;
import serviceOffer.Pharmacy;
import serviceOffer.RehabilitationAndMentalService;
import serviceOffer.Surgery;
import serviceOffer.TestAndScan;

public class UserHandler {
	
	public static void about(String u) {
		System.out.println("             HELLO "+u.toUpperCase());
		System.out.println("____________________________________\n");
		System.out.println("About us : We are one of the leading");
		System.out.println("hospital in the country. We provide");
		System.out.println("many services. As you can see...");
	}
	
	public static void handle(Scanner sc) {
		
		Input i = new Input();
		
		System.out.println("____________________________________\n");
		System.out.println("Doctor Consultation=>1\n"
				+ "Pharmacy Service=>2\n"
				+ "Tests and Scans=>3\n"
				+ "Surgery=>4\n"
				+ "Rehabilitaion and Mental Service=>5\n"
				+ "Home=>6\n"
				+ "Exit=>0");
		System.out.println("____________________________________\n");
		System.out.println("    What would you like to attend   ");
		System.out.println("____________________________________\n");
		
		int e = i.input(sc, 6);
		
		switch(e) {
		
		case 0 : System.exit(0);break;
		case 1 : Consultation.getDocDetail(sc);break;
		case 2 : Pharmacy.getMedDetail(sc); break;
		case 3 : TestAndScan.getTestDetail(sc); break;
		case 4 : Surgery.getDocDetail(sc); break;
		case 5 : RehabilitationAndMentalService.getDocDetail(sc);break;
		case 6 : Handler.handle();break;
		
		}
		
	}
}
