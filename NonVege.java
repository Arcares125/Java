
public class NonVege extends Food{
	
	private String meat, addOns, id;

	public NonVege(String name, String dish, String type, Integer price, String meat, String addOns, String id) {
		// TODO Auto-generated constructor stub
		super(name, dish, type, price);
		this.meat=meat;
		this.addOns=addOns;
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
			if(meat.equalsIgnoreCase("Beef") && addOns.equalsIgnoreCase("Meatballs")) {
				super.setPrice(getPrice() + getName().length()*2500 + 4000+5000);
			} else if(meat.equalsIgnoreCase("Beef")  && addOns.equalsIgnoreCase("Fishballs")) {
				super.setPrice(getPrice() + getName().length()*2500 +3000+5000);
			} else if(meat.equalsIgnoreCase("Beef")  && addOns.equalsIgnoreCase("Fried Potato")) {
				super.setPrice(getPrice() + getName().length()*2500 +5000+5000);
			} 
			
			else if(meat.equalsIgnoreCase("Chicken") && addOns.equalsIgnoreCase("Meatballs")) {
				super.setPrice(getPrice() + getName().length()*1000 + 4000+5000);
			} else if(meat.equalsIgnoreCase("Chicken")  && addOns.equalsIgnoreCase("Fishballs")) {
				super.setPrice(getPrice() + getName().length()*1000 +3000+5000);
			} else if(meat.equalsIgnoreCase("Chicken")  && addOns.equalsIgnoreCase("Fried Potato")) {
				super.setPrice(getPrice() + getName().length()*1000 +5000+5000);
			} 
			
			if(meat.equalsIgnoreCase("Pork") && addOns.equalsIgnoreCase("Meatballs")) {
				super.setPrice(getPrice() + getName().length()*2000 + 4000+5000);
			} else if(meat.equalsIgnoreCase("Pork")  && addOns.equalsIgnoreCase("Fishballs")) {
				super.setPrice(getPrice() + getName().length()*2000 +3000+5000);
			} else if(meat.equalsIgnoreCase("Pork")  && addOns.equalsIgnoreCase("Fried Potato")) {
				super.setPrice(getPrice() + getName().length()*2000 +5000+5000);
			} 
			
		} else if(getDish().equalsIgnoreCase("Noodle")) {
			if(meat.equalsIgnoreCase("Beef") && addOns.equalsIgnoreCase("Meatballs")) {
				super.setPrice(getPrice() + getName().length()*2500 + 4000+3000);
			} else if(meat.equalsIgnoreCase("Beef")  && addOns.equalsIgnoreCase("Fishballs")) {
				super.setPrice(getPrice() + getName().length()*2500 +3000+3000);
			} else if(meat.equalsIgnoreCase("Beef")  && addOns.equalsIgnoreCase("Fried Potato")) {
				super.setPrice(getPrice() + getName().length()*2500 +5000+3000);
			} 
			
			else if(meat.equalsIgnoreCase("Chicken") && addOns.equalsIgnoreCase("Meatballs")) {
				super.setPrice(getPrice() + getName().length()*1000 + 4000+3000);
			} else if(meat.equalsIgnoreCase("Chicken")  && addOns.equalsIgnoreCase("Fishballs")) {
				super.setPrice(getPrice() + getName().length()*1000 +3000+3000);
			} else if(meat.equalsIgnoreCase("Chicken")  && addOns.equalsIgnoreCase("Fried Potato")) {
				super.setPrice(getPrice() + getName().length()*1000 +5000+3000);
			} 
			
			if(meat.equalsIgnoreCase("Pork") && addOns.equalsIgnoreCase("Meatballs")) {
				super.setPrice(getPrice() + getName().length()*2000 + 4000+3000);
			} else if(meat.equalsIgnoreCase("Pork")  && addOns.equalsIgnoreCase("Fishballs")) {
				super.setPrice(getPrice() + getName().length()*2000 +3000+3000);
			} else if(meat.equalsIgnoreCase("Pork")  && addOns.equalsIgnoreCase("Fried Potato")) {
				super.setPrice(getPrice() + getName().length()*2000 +5000+3000);
			} 
		}
	}
	

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getAddOns() {
		return addOns;
	}

	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
