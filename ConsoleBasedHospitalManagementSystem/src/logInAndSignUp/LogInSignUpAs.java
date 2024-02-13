package logInAndSignUp;

import java.util.Scanner;
import input.Input;

public class LogInSignUpAs {
	private int e;
	public  int as(Scanner sc){
		
		Input i = new Input();
		
		System.out.println("____________________________________\n");
		System.out.println("   As Patient=>1     As dcotor=>2   ");
		System.out.println("               Exit=>0              ");
		System.out.println("____________________________________\n");
		
		e = i.input(sc, 2);
		return e;
	}
}
