
public abstract class Food {
	
	private String name, dish, type;
	private Integer price;
	
	public Food(String name, String dish, String type, Integer price) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.dish=dish;
		this.type=type;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	abstract void view();
	abstract void calculate();
}
