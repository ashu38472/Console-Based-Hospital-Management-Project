package logInAndSignUp;

import java.util.Scanner;
//import input.Input;
//import userAndDoc.Doc;
//import userAndDoc.User;

import notActive.NotActive;

public class SignUP {

	public void signup(Scanner sc) {
		
		NotActive.service(sc,0);
		
//		LogInSignUpAs as = new LogInSignUpAs();
//		int e = as.as(sc);
//		System.out.println(e);
//		switch(e){
//		case 0 : System.exit(0);
//		case 2 : asDoc(sc);
//		case 1 : asUser(sc);
//		}
//	}
//	
//	private void asUser(Scanner sc) {
//		System.out.print("           Username :");
//		String u=sc.next();
//		System.out.print("           Password :");
//		String p=sc.next();
//		System.out.println("____________________________________\n");
//		setUserPass(u,p);
//		LogIN l = new LogIN();
//		l.login(sc);
//	}
//
//	private void asDoc(Scanner sc){
//		System.out.print("           Username :");
//		String u=sc.next();
//		System.out.print("           Password :");
//		String p=sc.next();
//		System.out.print("              OTP   :");
//		int o=sc.nextInt();
//		System.out.println("____________________________________\n");
//		setUserPass(u,p);
//		LogIN l = new LogIN();
//		l.login(sc);
//	}
//	
//	private void setUserPass(String u,String p) {
//		new User(u,p);
//		new Doc(u,p);
//		
//		
	}

}
