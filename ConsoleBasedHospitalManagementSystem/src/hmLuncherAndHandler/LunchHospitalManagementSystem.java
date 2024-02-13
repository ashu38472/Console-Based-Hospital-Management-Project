package hmLuncherAndHandler;

import java.util.Calendar;
import java.util.Date;

public class LunchHospitalManagementSystem {

	public static void main(String[] args) {
		
		Date c = Calendar.getInstance().getTime();
		
		System.out.println("____________________________________");
		System.out.println("\n            Wellcome To             ");
		System.out.println("        VAIDYANATH HOSPITAL         ");
		System.out.println("------------------------------------");
		System.out.println("    "+c);
		
		Handler.handle();
	}

}
