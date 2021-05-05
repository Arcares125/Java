
public class Stationary extends Item{
	

	String color;
	String brand;

	public Stationary(String name, double price, String type, String color, String brand) {
		// TODO Auto-generated constructor stub
		super(name, price, type);
		this.color=color;
		this.brand=brand;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
