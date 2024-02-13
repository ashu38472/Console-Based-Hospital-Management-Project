package models;

public class Medicine {
	public String name;
	private String use;
	private int price;
	private int status;
	public String getName() {
		return name;
	}
	public String getUse() {
		return use;
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
		return " " + name + 
				"   " + use +"       Rs." 
				+ price + "   Unavailable";
		else return " " + name + 
				"   " + use +"   Rs." 
				+ price + "   Available";
	}
	public Medicine(String name, String use, int price) {
		this.name = name;
		this.use = use;
		this.price = price;
		status = 1;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
