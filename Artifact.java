
public abstract class Artifact {
	private String name, type;
	private Integer baseAttack, damage, chooseArte;
	public Artifact(String name, String type, Integer baseAttack, Integer damage, Integer chooseArte) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.type = type;
		this.baseAttack = baseAttack;
		this.damage=damage;
		this.chooseArte = chooseArte;
	}
	
	public Integer getChooseArte() {
		return chooseArte;
	}

	public void setChooseArte(Integer chooseArte) {
		this.chooseArte = chooseArte;
	}

	abstract void view();
	
	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getBaseAttack() {
		return baseAttack;
	}
	public void setBaseAttack(Integer baseAttack) {
		this.baseAttack = baseAttack;
	}

}
