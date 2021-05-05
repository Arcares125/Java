import java.util.*;
public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<Item> nItem = new Vector<>();
	
	String pName;
	Integer pPrice, page;
	String pType, color, brand, author, category;
	Double fPrice=0.0;
	
	void Reset() {
		pName="";
		pPrice = 0;
		page = 0;
		pType="";
		color ="";
		brand = "";
		author = "";
		category ="";
		fPrice = 0.0;
	}
	
	void menu() {
		System.out.println("=============================");
		System.out.println("1. Item Menu");
		System.out.println("2. Store Menu");
		System.out.println("3. Exit");
		System.out.println("=============================");
		System.out.println("Your Choice : ");
	}
	
	void view() {
		String a = "No. ", b = "Prodcut's Name", c = "Product's Type", d = "Product's Price", e="Product's Color", f = "Product's Brand", g= "Product's Author", h="Product's Category";
		System.out.println("===========================================================");
		System.out.printf("|%-4s |%-20s |%-20s |%-20s |%-20s|%-20s |%-20s |%-20s|\n",a,b,c,d,e,f,g,h);
		System.out.println("===========================================================");
		for(int i=0; i<nItem.size();i++) {
			System.out.printf("|%-4d|%-20s|%-20s|%-20f|%-20s|%-20s|%-20s|%-20s|\n",i+1, nItem.get(i).name, nItem.get(i).type, nItem.get(i).price, nItem.get(i));
		}
		System.out.println("===========================================================");
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int pilih = 0;
		do {
			menu();
			pilih=scan.nextInt();scan.nextLine();
			switch (pilih) {
			case 1:
				int choose1=0;

	
				System.out.println("Item Menu");
				System.out.println("=========================");
				System.out.println("1. Create New Item");
				System.out.println("2. View All Item");
				System.out.println("3. Exit");
				System.out.println("=============================");
				System.out.println("Your Choice : ");
				choose1=scan.nextInt();scan.nextLine();
				if(choose1 == 1) {
					do {
						System.out.println("Input Product's Name[5-25 char]");
						pName = scan.nextLine();
					}while(pName.length() < 5 || pName.length() > 25);
					
					do {
						System.out.println("Input Price: [5000 - 500000]");
						pPrice = scan.nextInt();scan.nextLine();
					}while(pPrice < 5000 || pPrice > 500000);
					
					do {
						System.out.println("Input Product's Type: [Book || Stationary]");
						pType = scan.nextLine();
					}while(!(pType.equalsIgnoreCase("Book") || pType.equalsIgnoreCase("Stationery")));
					
					if(pType.equalsIgnoreCase("Stationary")) {
						do {
							System.out.println("Input Product's Color: ");
							color = scan.nextLine();
						}while(color.length() < 3 || color.length() > 15);
						
						do {
							System.out.println("Input product's brand: ");
							brand = scan.nextLine();
						}while(brand.length() < 3 || brand.length() > 15);
						fPrice = pPrice*1.5;
						nItem.add(new Stationary(pName, fPrice, pType, color, brand));
						Reset();
						
					} else if(pType.equalsIgnoreCase("Book")) {
						do {
							System.out.println("Book's Author: ");
							author = scan.nextLine();
						}while(author.length() < 3 || author.length() > 25);
						
						do {
							System.out.println("Product's category [Soft Cover || Hard Cover] Case-Sesnitive: ");
							category = scan.nextLine();
						}while(!(category.equals("Soft Cover") || category.equals("Hard Cover")));
						
						do {
							System.out.println("Input Product's Page: ");
							page = scan.nextInt();scan.nextLine();
						}while(page < 1 || page > 5000);
						
						if(category.equals("Soft Cover")) {
							fPrice = (pPrice/3.0)+(page*100);
							nItem.add(new Book(pName, fPrice, pType, author, category, page));
							Reset();
							
						} else if(category.equals("Hard Cover")) {
							fPrice = (pPrice/2.0)+(page*200);
							nItem.add(new Book(pName, fPrice, pType, author, category, page));
							Reset();
						}
					}
				} else if (choose1 == 2) {
					if(nItem.isEmpty()) {
						System.out.println("JeHamedia Still doesn't have any product...");
					} else {
						view();
					}
				}
				
				break;

			default:
				break;
			}
			
		}while(pilih != 3);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
