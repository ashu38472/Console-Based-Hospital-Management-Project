package logInAndSignUp;

import java.util.*;

import hmLuncherAndHandler.DocHandler;
import hmLuncherAndHandler.UserHandler;
import userAndDoc.Doc;
import userAndDoc.User;

public class LogIN {

	public void login(Scanner sc) {
		User user = new User();
		Doc doc = new Doc();
		
		LogInSignUpAs as = new LogInSignUpAs();
		int e = as.as(sc);
		
		System.out.println("____________________________________\n");
		System.out.print("           Username :");
		String u=sc.next();
		System.out.print("           Password :");
		String p=sc.next();
		System.out.println("____________________________________\n");
		
		Map<String, String> m =user.userInfo();
		Map<String, String> md =doc.docInfo();

		switch(e){
			case 0 : System.exit(0);break;
			case 2 : 
				if(user.CheckValidity(u,p,md)) {
					successful(0,u,sc);
				}
				else {
					System.out.println("Wrong Username or Password");
					login(sc);
				}
				break;
			case 1 : 
				if(user.CheckValidity(u,p,m)) {
					successful(1,u,sc);
				}
				else {
					System.out.println("Wrong Username or Password");
					login(sc);
				}
				break;
	    }
		
//		if(u.charAt(0)=='d') {
//			if(user.CheckValidity(u,p,md))successful(0,u);
//		}
//		else {
//			if(user.CheckValidity(u,p,m))successful(1,u);
//		}
	}
	
	public void successful(int k,String u,Scanner sc) {
		if(k==0) {DocHandler.hello(u); DocHandler.handle(sc);}
		else {UserHandler.about(u); UserHandler.handle(sc);}
	}

}
