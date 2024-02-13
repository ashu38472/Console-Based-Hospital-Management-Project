package serviceOffer;

import java.util.*;

import hmLuncherAndHandler.UserHandler;
import input.Input;
import models.Doctor;
import notActive.NotActive;

public class Consultation {
	public static void getDocDetail(Scanner sc) {
		
		Input i = new Input();
		
		Doctor d1 = new Doctor("Hinata",500, "OPD");
		Doctor d2 = new Doctor("Sakura",650, "Physician");
		Doctor d3 = new Doctor("Kakashi",500, "Homoeopathy");
		
		List<Doctor> l = new LinkedList<Doctor>();
		
		l.add(d1);
		l.add(d2);
		l.add(d3);
		
		System.out.println("____________________________________\n");
		System.out.println(" Name Department Fee Status\n");
		
		Collections.sort(l);
		
		Iterator<Doctor> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("____________________________________\n");
		System.out.println("  Main Menu => 1   Appointment =>2  ");
		System.out.println("             Exit => 0              ");
		System.out.println("____________________________________\n");
		
		int e = i.input(sc, 2);
		
		switch(e) {
		case 0 : System.exit(0); break;
		case 1 : UserHandler.handle(sc);break;
		case 2 : NotActive.service(sc);
				 break;
		}
	}
}
