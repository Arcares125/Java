
public class Item {

	String name;
	double price;
	String type;
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}


	public Item(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
}


