
public class Cucumber extends Plant implements Eatable, SecondEatInterface{

	public Cucumber() {
		// TODO Auto-generated constructor stub
	}
	
	//override : timpa function dr parent
	public void information() {
//		super.information();
		System.out.println("Cucumber Information");
	}

	@Override
	void grow() {
		// TODO Auto-generated method stub
		System.out.println("Cucumber is growing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating cucumber");
		Eatable.super.eat();
		SecondEatInterface.super.eat();
	}
	public void heal() {
		Eatable.super.heal();
	}
}
