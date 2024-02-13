package notActive;

import java.util.Scanner;

import hmLuncherAndHandler.Handler;
import hmLuncherAndHandler.UserHandler;
import input.Input;

public class NotActive {
	public static void service(Scanner sc) {
		
		Input i = new Input();
		
		System.out.println("____________________________________\n");
		System.out.println("  This service will be active soon  ");
		System.out.println("____________________________________\n");
		System.out.println(" Plz. redirect to :- \n");
		System.out.println("      Home=>1     Main Menu=>2      ");
		System.out.println("               Exit=>0              ");
		System.out.println("____________________________________\n");
		
		int e = i.input(sc, 2);
		
		switch(e) {
		case 0 : System.exit(0); break;
		case 1 : Handler.handle();break;
		case 2 : UserHandler.handle(sc);
				 break;
		}
	}
	public static void service(Scanner sc,int x) {
		
		Input i = new Input();
		
		System.out.println("____________________________________\n");
		System.out.println("  This service will be active soon  ");
		System.out.println("____________________________________\n");
		System.out.println(" Plz. redirect to :- \n");
		System.out.println("       Exit=>0        Home=>1       ");
		System.out.println("____________________________________\n");
		
		int e = i.input(sc, 1);
		
		switch(e) {
		case 0 : System.exit(0); break;
		case 1 : Handler.handle();
				 break;
		}
	}
}
