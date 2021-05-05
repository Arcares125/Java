import java.util.*;
public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<Item> nItem = new Vector<>();
	Vector<Store> nStore = new Vector<>();
	
	String pName;
	Integer pPrice, page;
	String pType, color, brand, author, category;
	Double fPrice=0.0;
	//-------------------
	String store, address;
	
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
		System.out.println("================================================================================================================================================================");
		System.out.printf("|%-4s|%-20s |%-20s |%-20s |%-20s|%-20s |%-20s |%-20s|\n",a,b,c,d,e,f,g,h);
		System.out.println("================================================================================================================================================================");
		for(int i=0; i<nItem.size();i++) {
			System.out.printf("|%-4d|%-21s|%-22s|%-20f|%-22s|%-22s|%-21s|%-20s|\n",i+1, nItem.get(i).getName(), nItem.get(i).getType(), nItem.get(i).getPrice(), nItem.get(i).getColor(), nItem.get(i).getBrand(), nItem.get(i).getAuthor(), nItem.get(i).getCategory());
		}
		System.out.println("=================================================================================================================================================================");
	}
	
	void view2() {
		String a = "No. ", b = "Store's Name", c = "Store's Address";
		System.out.println("===========================================================");
		System.out.printf("|%-4s |%-20s |%-20s|\n",a,b,c);
		System.out.println("===========================================================");
		for(int i=0; i<nStore.size();i++) {
			System.out.printf("|%-4d|%-20s|%-20s|\n",i+1, nStore.get(i).getStore(), nStore.get(i).getAddress());
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
				do {


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
					}while(!(pType.equalsIgnoreCase("Book") || pType.equalsIgnoreCase("Stationary")));
					
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
				} else if(choose1 == 3) {
					System.out.println();
				}
				}while(choose1 !=3);
				
				break;

			case 2:
				int choose2=0;
				int index=0;
				int choose3=0;
				int update=0;
				int quantity=0;
				do {
					System.out.println("Store Menu");
					System.out.println("=========================");
					System.out.println("1. Create New Store");
					System.out.println("2. View All Store");
					System.out.println("3. Exit");
					System.out.println("=============================");
					System.out.println("Your Choice : ");
					choose2 = scan.nextInt();scan.nextLine();
					if(choose2 == 1) {
						do {
							System.out.println("Input Store Name");
							store = scan.nextLine();
						}while(store.length() < 5 || store.length() > 25);

						do {
							System.out.println("Input Store Address: [10-35]: ");
							address = scan.nextLine();
						}while(address.length() < 10 || address.length() > 35);
						
						nStore.add(new Store(store, address));
						store="";
						address="";
					} else if(choose2 == 2) {
						if(nStore.isEmpty()) {
							System.out.println("JeHamedia still doesn't have any store...");
						} else {
							view2();
							for(int k = 1; k <= nStore.size(); k++) {
								if(k == nStore.size()) {
									do {
										System.out.printf("Input Store index [1-%d]: \n", k);	
										index=scan.nextInt();scan.nextLine();
									}while(index < 1 || index > k);
									
									do {
										System.out.println("Inventory Menu");
										System.out.println("=========================");
										System.out.println("1. View Store Inventory");
										System.out.println("2. Update Store Inventory");
										System.out.println("3. Exit");
										System.out.println("=============================");
										System.out.println("Your Choice : ");
										choose3 = scan.nextInt();scan.nextLine();
										if(choose3 == 1) {
											if(nItem.isEmpty()) {
												System.out.printf("%s 's inventory is still empty", nStore.get(k).getStore());
												System.out.printf("Press anything to continue...\n");
												scan.next();
											} else {
												view();
											}
										} else if(choose3 == 2) {
											if(nItem.isEmpty()) {
												System.out.printf("%s 's inventory is still empty", nStore.get(k).getStore());
												System.out.printf("Press anything to continue...\n");
												scan.next();
											} else {
												view();
												do {
													System.out.printf("Input your product's index [1-%d]\n", nItem.size());
													update = scan.nextInt();scan.nextLine();
												}while(update < 1 || update > nItem.size());	
												
												System.out.println("Input your product's quantity update[(-500) - (+500) and quantity after update must be at least 0: ");
												quantity = scan.nextInt();scan.nextLine();
												
											}
										} else if(choose3 == 3) {
											System.out.println();
										}
										
									}while(choose3 != 3);
								}
							}

						}
					} else if(choose2 == 3) {
						System.out.println();
					}
					

				}while(choose2 != 3);
				break;
				
			case 3:
				System.out.println("Goodbye....");
				System.exit(0);
			}
			
			
		}while(pilih != 3);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
