package arrayList;

public class Mobile {
	private String brand;
	private int price;
	private String colour;
	private String model;
	private int edition;
	
	public Mobile(String brand, int price, String colour, String model, int edition) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.model = model;
		this.edition = edition;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String toString() {
		return "brand=" + brand + ", price=" + price + ", colour=" + colour + ", model=" + model + ", edition="
				+ edition;
	}
	
}
