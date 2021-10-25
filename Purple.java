
public class Purple extends Artifact{
	
	private String bonus;

	public Purple(String name, String type, Integer baseAttack,Integer damage, String bonus, Integer chooseArte) {
		// TODO Auto-generated constructor stub
		super(name, type, baseAttack, damage, chooseArte);
		this.bonus = bonus;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	void view() {
		System.out.println("Name : "+getName());
		System.out.println("Type : "+getType());
		System.out.println("Base Atk: "+ getBaseAttack());
		System.out.println("Bonus Stat: "+bonus);
		System.out.println("Multiplier: -");
	}
}
