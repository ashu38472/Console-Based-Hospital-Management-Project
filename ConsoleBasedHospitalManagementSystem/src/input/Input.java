package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	int i;
	public int input(Scanner s,int n) {
		
		while(true){
		try {
			i=s.nextInt();
			if(i<0|| i>n) {
				InputMismatchException e = new InputMismatchException();
				throw e;
			}else return i;
		}
		catch(InputMismatchException e) {
			System.out.println("____________________________________\n");
			System.out.println("Plz. Enter a valid key");
			System.out.println("____________________________________\n");
			s.nextLine();
		}}
	}

}
