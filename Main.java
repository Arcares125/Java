import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
public class Main {
	
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	Vector<Food> myFood = new Vector<>();

	int hitung=1;

	void menu() {
		System.out.println("Five Food Street");
		System.out.println("=================");
		System.out.println("1. Insert New Menu");
		System.out.println("2. View All Menu");
		System.out.println("3. Sell Menu item");
		System.out.println("4. Exit");
		System.out.print(">> ");
	}
	
	String name, dish, type, vegType, meatType, meatOns;
	Integer price;
	String id;
	void input() {
		do {
			System.out.println("Input Food Name: ");
			name = scan.nextLine();
		}while(name.length() < 8 || name.length() > 20);
		
		do {
			System.out.println("Main dish [Rice or Noodle]: ");
			dish = scan.nextLine();
		}while(!(dish.equalsIgnoreCase("Rice") || dish.equalsIgnoreCase("Noodle")));
		
		do {
			System.out.println("Menu type [Vege or Non-Vege]: ");
			type = scan.nextLine();
		}while(!(type.equals("Vege") || type.equals("Non-Vege")));
		
		do {
			System.out.println("input price 5000-25000 multiple 1000:");
			price = scan.nextInt();scan.nextLine();
		}while(price < 5000 || price > 25000 || price%1000 != 0);
		
		if(type.equals("Vege")) {
			do {
				System.out.println("Input Vegetable Potato or Tomato: ");
				vegType = scan.nextLine();
			}while(!(vegType.equals("Potato") || vegType.equals("Tomato")));
			if(hitung < 10) {
				id = "VV" + "0"+"0"+ hitung;
			} else if (hitung >=10 && hitung <= 99) {
				id = "VV" + "0"+ hitung;
			} else if (hitung >= 100 && hitung <= 999) {
				id = "VV"+ hitung;
			}

			
			
			hitung++;
			myFood.add(new Vege(name, dish, type, price, vegType, id));
			
		} else if(type.equals("Non-Vege")){
			do {
				System.out.println("Meat Beef or Chichken or Pork: ");
				meatType = scan.nextLine();
			}while(!(meatType.equalsIgnoreCase("Beef") || meatType.equalsIgnoreCase("Chicken") || meatType.equalsIgnoreCase("Pork")));
			
			do {
				System.out.println("Add-ons must be Meatballs or Fishballs or Fried Potato: ");
				meatOns = scan.nextLine();
			}while(!(meatOns.equalsIgnoreCase("Meatballs") || meatOns.equalsIgnoreCase("Fishballs") ||meatOns.equalsIgnoreCase("Fried Potato")));
			
			if(hitung < 10) {
				id = "NV" + "0"+"0"+ hitung;
			} else if (hitung >=10 && hitung <= 99) {
				id = "NV" + "0"+ hitung;
			} else if (hitung >= 100 && hitung <= 999) {
				id = "NV"+ hitung;
			}
			hitung++;
			myFood.add(new NonVege(name, dish, type, price, meatType, meatOns, id));
		}
	}
	
	Integer nomor = 1;
	
	void view() {
		if(myFood.isEmpty()) {
			System.out.println("No menu available");
		} else {
			for(Food cekFood : myFood) {
				if(cekFood instanceof Vege) {
					System.out.println("Nomor. "+nomor);
					cekFood.calculate();
					cekFood.view();
					System.out.println();
					nomor++;
				} else if(cekFood instanceof NonVege) {
					System.out.println("Nomor. "+nomor);
					cekFood.calculate();
					cekFood.view();
					nomor++;
					System.out.println();
				}
			}
			nomor = 1;
		}
	}
	
	int pilihMenu=0;
	int quantity = 0;
	void delete() {
		if(myFood.isEmpty()) {
			System.out.println("No Menu available");
		} else {
			for(Food cekFood : myFood) {
				if(cekFood instanceof Vege) {
					System.out.println("Nomor. "+nomor);
					cekFood.view();
					System.out.println();
					nomor++;
				} else if(cekFood instanceof NonVege) {
					System.out.println("Nomor. "+nomor);
					cekFood.view();
					nomor++;
					System.out.println();
				}
			}
			do {
				System.out.println("Pilih: ");
				pilihMenu = scan.nextInt();
				scan.nextLine();
			}while(pilihMenu < 1 || pilihMenu > myFood.size());
			
			do {
				System.out.println("Input Quantity");
				quantity = scan.nextInt();scan.nextLine();
			}while(quantity <= 0);
			
			System.out.println();
			if(myFood.get(pilihMenu-1) instanceof Vege) {
				System.out.println("ID: "+((Vege)myFood.get(pilihMenu-1)).getId());
			} else if(myFood.get(pilihMenu-1) instanceof Vege) {
				System.out.println("ID: "+((NonVege)myFood.get(pilihMenu-1)).getId());
			}
			System.out.println("Nama: "+myFood.get(pilihMenu-1).getName());
			System.out.println("Main Dish: "+myFood.get(pilihMenu-1).getDish());
			System.out.println("Price: "+myFood.get(pilihMenu-1).getPrice());
			System.out.println("Grand Total: "+ myFood.get(pilihMenu-1).getPrice()*quantity);
			
			System.out.println();
			System.out.println("Food Sold");
			System.out.println();
			
			myFood.remove(pilihMenu-1);
		}
	}
	
	int choose;
	
	public Main() {
		// TODO Auto-generated constructor stub
		do {
			menu();
			choose = scan.nextInt();scan.nextLine();
			switch (choose) {
			case 1:
				input();
				break;

			case 2:
				view();
				break;
				
			case 3:
				delete();
				break;
				
			case 4:
				System.exit(0);
				break;
			}
		}while(choose != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
