package hashMap;

public class Vehicle {
	private String name;
	private int price;
	private String colour;
	private int noOfWheels;
	private boolean isAc;

	public Vehicle(String name, int price, String colour, int noOfWheels, boolean isAc) {
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.noOfWheels = noOfWheels;
		this.isAc = isAc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean isAc() {
		return isAc;
	}

	public void setAc(boolean isAc) {
		this.isAc = isAc;
	}

	public String toString() {
		return "name=" + name + ", price=" + price + ", colour=" + colour + ", noOfWheels=" + noOfWheels + ", isAc="
				+ isAc;
	}

}
