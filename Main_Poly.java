import java.util.*;
public class Main_Poly {
	Scanner scan = new Scanner(System.in);
	public Main_Poly() {
		// TODO Auto-generated constructor stub
		
		//Upcasting
		Plant pla = new Cucumber();
		//------------
		pla.information();
		pla.information(10);
		pla.information(10, "kaktus");
		pla.information("mawar", 10);
		//downcasting->solving
		((Cucumber)pla).eat();
		System.out.println(Eatable.sound);
		
		PlantStrategy stra = null;
		System.out.println("1. Summer");
		System.out.println("2. Spring");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			stra = new SummerPlanStrategy();
			break;

		case 2:
			stra = new SpringPlantStrategy();
			break;
		}
		stra.showAvailableCrops();
		
	}

	public static void main(String[] args) {
		new Main_Poly();
	}
	
}
