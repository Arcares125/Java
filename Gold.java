
public class Gold extends Artifact{
	
	private Double multi;

	public Gold(String name, String type, Integer baseAttack,Integer damage, Double multi, Integer chooseArte) {
		// TODO Auto-generated constructor stub
		super(name, type, baseAttack, damage, chooseArte);
		this.multi=multi;
	}

	public Double getMulti() {
		return multi;
	}

	public void setMulti(Double multi) {
		this.multi = multi;
	}
	
	void view() {
		System.out.println("Name : "+getName());
		System.out.println("Type : "+getType());
		System.out.println("Base Atk: "+ getBaseAttack());
		System.out.println("Bonus Stat: -");
		System.out.println("Multiplier: "+multi);
	}
}
