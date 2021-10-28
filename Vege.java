
public class Vege extends Food{

	private String vegeType, id;
	
	public String getVegeType() {
		return vegeType;
	}
	public void setVegeType(String vegeType) {
		this.vegeType = vegeType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Vege(String name, String dish, String type, Integer price, String vegeType, String id) {
		// TODO Auto-generated constructor stub
		super(name, dish, type, price);
		this.vegeType=vegeType;
		this.id=id;
	}
	
	void view() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+getName());
		System.out.println("Price: "+getPrice());
		System.out.println("Type: "+getType());
	}
	
	void calculate() {
		if(getDish().equalsIgnoreCase("Rice")) {
			if(vegeType.equalsIgnoreCase("Potato")) {
				super.setPrice(getPrice() + getName().length()*2000 + 5000);
			} else if(vegeType.equalsIgnoreCase("Tomato")) {
				super.setPrice(getPrice() + getName().length()*1000 + 5000);
			}
		} else if(getDish().equalsIgnoreCase("Noodle")) {
			if(vegeType.equalsIgnoreCase("Potato")) {
				super.setPrice(getPrice() + getName().length()*2000 + 3000);
			} else if(vegeType.equalsIgnoreCase("Tomato")) {
				super.setPrice(getPrice() + getName().length()*1000 + 3000);
			}
		}
	}

}
