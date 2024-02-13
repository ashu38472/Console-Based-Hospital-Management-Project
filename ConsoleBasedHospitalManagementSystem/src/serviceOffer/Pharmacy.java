package serviceOffer;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import hmLuncherAndHandler.UserHandler;
import input.Input;
import models.Medicine;
import notActive.NotActive;

public class Pharmacy {
	public static void getMedDetail(Scanner sc) {
		
		Input i = new Input();
		
		Medicine m1 = new Medicine("Paracetamol","In Fever",20);
		Medicine m2 = new Medicine("Ciprofloxacin", "Antibiotic",25);
		Medicine m3 = new Medicine("Omeprazole","Gas",20);
		Medicine m4 = new Medicine("Cetirizine","Allergy",15);
		Medicine m5 = new Medicine("Declofenac","High Blood Pressure",25);
		Medicine m6 = new Medicine("Azithromycin","Infection",50);
		
		List<Medicine> l = new LinkedList<Medicine>();
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		l.add(m6);
		
		Comparator<Medicine> c = (Medicine a,Medicine b)-> {//Implementation of comparator
			int x = a.name.compareTo(b.name);//We are using lambda expression because Comparator is a functional interface
			if(x>0)return 1;
			else return -1;
			};
		
		Collections.sort(l, c);
		
		System.out.println("____________________________________\n");
		System.out.println("   Name     Uses     Price    Status\n");
		
		Iterator<Medicine> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("____________________________________\n");
		System.out.println("  Main Menu =>1   Buy Medicine =>2  ");
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
