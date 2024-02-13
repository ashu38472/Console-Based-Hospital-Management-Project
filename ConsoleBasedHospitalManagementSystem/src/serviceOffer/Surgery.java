package serviceOffer;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import hmLuncherAndHandler.UserHandler;
import input.Input;
import models.Doctor;
import notActive.NotActive;

public class Surgery {
	public static void getDocDetail(Scanner sc) {
		
		Input i = new Input();
		
		Doctor d1 = new Doctor("Tsunade",5999, "Neurological Surgeon");
		Doctor d2 = new Doctor("Orochimaru",4599, "Heart Surgeon");
		Doctor d3 = new Doctor("Sasori",3999, "Orthopedic Surgeon");
		
		List<Doctor> l = new LinkedList<Doctor>();
		
		l.add(d1);
		l.add(d2);
		l.add(d3);
		
		Collections.sort(l);
		
		System.out.println("____________________________________\n");
		System.out.println(" Name Department Fee Status\n");
		
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
