package models;

public class TestScan {
	public String name;
	int price;
	int status;
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStatus() {
		return status;
	}
	@Override
	public String toString() {
		if(status==0)
		return "  " + name +"       Rs." 
				+ price + "   Unavailable";
		else return " " + name +"     Rs." 
				+ price + "   Available";
	}
	public TestScan(String name, int price) {
		this.name = name;
		this.price = price;
		status = 1;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
