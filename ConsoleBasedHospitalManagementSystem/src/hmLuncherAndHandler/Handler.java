package hmLuncherAndHandler;

import java.util.Scanner;

import input.Input;
import logInAndSignUp.LogIN;
import logInAndSignUp.SignUP;

public class Handler {
	public static void handle() {
		Scanner sc = new Scanner(System.in);
		Input i = new Input();
		LogIN l = new LogIN();
		SignUP s = new SignUP();
		
		System.out.println("____________________________________\n");
		System.out.println("\n    LogIn=>1           SignUP=>2    ");
		System.out.println("              Exit=>0               ");
		System.out.println("____________________________________\n");
		
		int e = i.input(sc,2);
		
		switch(e){
		case 0 : System.exit(0);break;
		case 1 : l.login(sc);break;
		case 2 : s.signup(sc);break;
		}
		
		
		sc.close();
	}
}
