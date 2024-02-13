package serviceOffer;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import hmLuncherAndHandler.UserHandler;
import input.Input;
import models.TestScan;
import notActive.NotActive;

public class TestAndScan {
	public static void getTestDetail(Scanner sc) {
		
		Input i = new Input();
		
		TestScan ts1 = new TestScan("X-ray",510);
		TestScan ts2 = new TestScan("Blood",1990);
		TestScan ts3 = new TestScan("Ultra-Sound",2899);
		TestScan ts4 = new TestScan("HIV",999);
		
		List<TestScan> l = new LinkedList<TestScan>();
		
		l.add(ts1);
		l.add(ts2);
		l.add(ts3);
		l.add(ts4);
		
		Comparator<TestScan> c = (TestScan a,TestScan b)-> {//Implementation of comparator
			int x = a.name.compareTo(b.name);//We are using lambda expression because Comparator is a functional interface
			if(x>0)return 1;
			else return -1;
			};
		
		Collections.sort(l, c);
		
		System.out.println("____________________________________\n");
		System.out.println("      Test       Price     Status   \n");
		
		Iterator<TestScan> itr = l.iterator();
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
