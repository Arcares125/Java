
public class Item {

	String name;
	double price;
	String type;
	
	String color;
	String brand;
	
	String author;
	String category;
	Integer page;
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}


	public Item(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public Item(String name, double price, String type, String color, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.color = color;
		this.brand = brand;
	}
	
	public Item(String name, double price, String type, String author, String category, Integer page) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.author=author;
		this.category=category;
		this.page=page;
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


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Integer getPage() {
		return page;
	}


	public void setPage(Integer page) {
		this.page = page;
	}
	
}


