import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Main {

	List<Footwear> f1 = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	void menu() {
		System.out.println("Just DU It!!");
		System.out.println("===============");
		System.out.println("1. Add Footwear");
		System.out.println("2. View Footwear");
		System.out.println("3. Update Footwear");
		System.out.println("4. Delete Footwear");
		System.out.println("5. Exit");
		System.out.print(">> ");
	}
	
	
	String name, type;
	Long price, wheel;
	Double height;
	
	void add() {
		do {
			System.out.println("Footwear name [3 - 25 characters]: ");
			name = scan.nextLine();
		}while(name.length() < 3 || name.length() > 25);
		
		do {
			System.out.println("Footwear Price [more than 10000]: ");
			price = scan.nextLong();scan.nextLine();
		}while(price <= 10000);
		
		do {
			System.out.println("Footwear Type [Heels / RollerSkate]: ");
			type = scan.nextLine();
		}while(!type.equals("Heels") && !type.equals("RollerSkate"));
		
		if(type.equals("Heels")) {
			do {
				System.out.println("Footwear height [1.0 - 9.0]: ");
				height = scan.nextDouble();scan.nextLine();
			}while(height < 1.0 || height > 9.0);
			f1.add(new Footwear(name, price, type, height));
			System.out.println("Footwear added succesfully!!");
		} else {
			do {
				System.out.println("Footwear total wheel [2 - 4]: ");
				wheel = scan.nextLong();scan.nextLine();
			}while(wheel < 2 || wheel > 4);
			f1.add(new Footwear(name, price, type, wheel));
			System.out.println("Footwear added succesfully!!");
		}
	}
	
	void view() {
		if(f1.isEmpty()) {
			System.out.println("No footwear to display!!!");
		} else {
			for(int i = 0; i < f1.size(); i++) {
				System.out.println(i+1);
				System.out.println("Name: "+f1.get(i).getfName());
				System.out.println("Price: "+f1.get(i).getfPrice());
				if(f1.get(i).getfHeight() == null) {
					System.out.println((f1.get(i).getfHeight() == null) ? "-" : "Height : "+f1.get(i).getfHeight());
					System.out.println("Total Wheel: "+f1.get(i).getfWheel());
				} else if(f1.get(i).getfWheel() == null) {
					System.out.println("Height : "+f1.get(i).getfHeight());
					System.out.println((f1.get(i).getfWheel() == null) ? "-" : "Total Wheel: "+f1.get(i).getfWheel());
				}
				System.out.println();
			}
		}
	}
	
	Integer index;
	void update() {
		view();
		do {
			System.out.println("Input footwear index to update: ");
			index = scan.nextInt();scan.nextLine();
		}while(index <= 0 || index > f1.size());
		
		do {
			System.out.println("Footwear name [3 - 25 characters]: ");
			name = scan.nextLine();
		}while(name.length() < 3 || name.length() > 25);
		
		do {
			System.out.println("Footwear Price [more than 10000]: ");
			price = scan.nextLong();scan.nextLine();
		}while(price <= 10000);
		
		do {
			System.out.println("Footwear Type [Heels / RollerSkate]: ");
			type = scan.nextLine();
		}while(!type.equals("Heels") && !type.equals("RollerSkate"));
		
		if(type.equals("Heels")) {
			do {
				System.out.println("Footwear height [1.0 - 9.0]: ");
				height = scan.nextDouble();scan.nextLine();
			}while(height < 1.0 || height > 9.0);
			f1.get(index-1).setfName(name);
			f1.get(index-1).setfHeight(height);
			f1.get(index-1).setfPrice(price);
			f1.get(index-1).setfType(type);
			f1.get(index-1).setfWheel(null);
			System.out.println("Footwear updated succesfully!!");
		} else {
			do {
				System.out.println("Footwear total wheel [2 - 4]: ");
				wheel = scan.nextLong();scan.nextLine();
			}while(wheel < 2 || wheel > 4);
			f1.get(index-1).setfName(name);
			f1.get(index-1).setfWheel(wheel);
			f1.get(index-1).setfPrice(price);
			f1.get(index-1).setfType(type);
			f1.get(index-1).setfHeight(null);
			System.out.println("Footwear updated succesfully!!");
		}
	}
	
	Integer delete;
	void delete() {
		if(f1.isEmpty()) {
			System.out.println("There are no footwear to delete!");
		} else {
			view();
			do {
				System.out.println("Input footwear index to delete");
				delete = scan.nextInt();scan.nextLine();
			}while(delete <= 0 || delete > f1.size());
			
			f1.remove(delete-1);
		}
	}
	
	void exit() {
		String a = "Thanks for using Just DU It Program!. . . ";
		for(int i = 0; i < a.length(); i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception

			}
			System.out.print(a.charAt(i));
		}
		System.exit(0);
	}
	
	Integer choose;
	public Main() {
		// TODO Auto-generated constructor stub
		do {
			menu();
			choose = scan.nextInt();scan.nextLine();
			switch (choose) {
			case 1:
				add();
				break;

			case 2:
				view();
				break;
				
			case 3:
				update();
				break;
				
			case 4:
				delete();
				break;
				
			case 5:
				exit();
				break;
			}
		}while(choose != 5);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
