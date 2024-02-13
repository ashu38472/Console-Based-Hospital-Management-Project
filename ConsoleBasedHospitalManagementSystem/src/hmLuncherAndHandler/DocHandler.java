package hmLuncherAndHandler;

import java.util.Scanner;

import notActive.NotActive;

public class DocHandler {
	
	public static void hello(String u){
		System.out.println("           HELLO Dr. "+u.toUpperCase());
	}
	
	public static void handle(Scanner sc){
		NotActive.service(sc,1);
	}
}
