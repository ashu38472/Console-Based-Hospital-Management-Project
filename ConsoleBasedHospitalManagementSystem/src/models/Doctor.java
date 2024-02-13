package models;

public class Doctor implements Comparable<Doctor> {
	String name;
	int fee;
	String specialisation;
	int availability;
	
	public String getName() {
		return name;
	}
	
	public Doctor( String name,int fee,String specialisation) {
		this.name = name;
		this.fee = fee;
		this.specialisation = specialisation;
		availability = 1;
	}

	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		if(availability==0)
			return " " + name  + "   " + specialisation+"  Rs."+fee
					+ "   Unavailable";
		else
			return " " + name  + "   " + specialisation+"  Rs."+fee
				+ "    Available";
	}
	
	
	@Override
	public int compareTo(Doctor o) {
		int x = this.name.compareTo(o.name);
		if(x>0)return 1;
		else return -1;
	}
	
}
