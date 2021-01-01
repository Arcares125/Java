import java.util.Scanner;

public class View_Candid {
	Scanner scan = new Scanner(System.in);
	static Input candid = new Input();
	Integer choose=0;
	
	void menu() {
		System.out.println("Power Recruitment");
		System.out.println("--------------------");
		System.out.println("1. Input New Candidate");
		System.out.println("2. View Candidate's Data");
		System.out.println("3. Remove Candidates");
		System.out.println("4. Exit");
		System.out.println("Choose >> ...");
	}
	
	void input() {
		System.out.println("Candidates name 5 - 20 Char with at least 2 words & the space char must not be in the first or last char : ");
		candid.setName(scan.nextLine());
		if(candid.getName().length()<=4 || candid.getName().length()>=21) {
			do {
				System.out.println("Candidates name 5 - 20 Char :");
				candid.setName(scan.nextLine());
			}while(candid.getName().length()<=4 ||candid.getName().length()>=21);
		}
		
		else if (!candid.getName().contains(" ")) {
			do {
				System.out.println("Must contain space : ");
				candid.setName(scan.nextLine());
			}while(!candid.getName().contains(""));
		}
		
		else if(candid.getName().startsWith(" ") || candid.getName().endsWith(" ")) {
			do {
				System.out.println("Cannot starts with or ends with space : ");
				candid.setName(scan.nextLine());
			}while(candid.getName().startsWith(" ") || candid.getName().endsWith(" "));
		}
		
//		with at least 2 words & the space char must not be in the first or last char 
//		 || nama.contains(" ") || nama.startsWith(" ") || nama.endsWith(" ")
		candid.addName(candid.getName());
		
		System.out.println("Input gender : " );
		candid.setGender(scan.nextLine());
		if(!candid.getGender().equals("Male") && !candid.getGender().equals("Female")) {
			do {
				System.out.println("Must be male or Female : ");
				candid.setGender(scan.nextLine());
			}while(!candid.getGender().equals("Male") && !candid.getGender().equals("Female"));
		}
		candid.addGender(candid.getGender());
		
		System.out.println("Input address : ");
		candid.setAddress(scan.nextLine());
		if(!candid.getAddress().endsWith("Street")) {
			do {
				System.out.println("Input must be include Street : ");
				candid.setAddress(scan.nextLine());
			}while(!candid.getAddress().endsWith("Street"));
		}
		
		candid.addAddress(candid.getAddress());
		
		System.out.println("Input your age : ");
		candid.setAge(scan.nextInt());
		if(candid.getAge() < 17 || candid.getAge() > 30) {
			do {
				System.out.println("Must be 17 - 30");
				candid.setAge(scan.nextInt());
			}while(candid.getAge() < 17 || candid.getAge() > 30);
		}
		
		candid.addAge(candid.getAge());
		initial();
		for(int i = 0; i < candid.getName().length();i++) {
			if(candid.getName().charAt(i) == ' ') {
				String initial = candid.getName().substring(0,1).toUpperCase()+Character.toUpperCase(candid.getName().charAt(i+1));
				System.out.println("Thanks for registering -- your Initial is "+initial);
				break;
			}
		}

	}
	
	String initial() {
		for(int i = 0; i < candid.getName().length();i++) {
			if(candid.getName().charAt(i) == ' ') {
				String initial = candid.getName().substring(0,1).toUpperCase()+Character.toUpperCase(candid.getName().charAt(i+1));
				candid.addInitial(initial);
				break;
			}
		}
		return candid.getName();
	}
	
	String a = "No. ", b="Name", c="Initial", d="Gender", e="Age",f="Address";
	void view() {
		if(candid.getNames().isEmpty()) {
			System.out.println("No data !!!");
		} else {
			System.out.println("========================================================================");
			System.out.printf("|%-3s |%-15s |%-7s |%-9s |%-10s|%-17s|\n",a,b,c,d,e,f);
			System.out.println("========================================================================");
			for(int i=0; i<candid.getNames().size();i++) {
				System.out.printf("|%-5d|%-16s|%-8s|%-10s|%-10d|%-17s|\n",i+1,candid.getNames().get(i), candid.getInitials().get(i), candid.getGenders().get(i), candid.getAges().get(i), candid.getAddresses().get(i));
			}
			System.out.println("========================================================================");
		}
	}
	
	Integer hapus=0;
	void remove() {
		if(candid.getNames().isEmpty()) {
			System.out.println("No Data");
		} else {
		sort();
		view();
		System.out.printf("Input index to delete [1 - %d] - 0 to cancel\n", candid.getNames().size());
		hapus=scan.nextInt();scan.nextLine();
		if(hapus > candid.getNames().size()) {
			do {
				System.out.println("Input cant be more than the list : ");
				hapus=scan.nextInt();scan.nextLine();
			}while(hapus > candid.getNames().size());
			
			candid.removeAddress(candid.getAddress());
			candid.removeAge(candid.getAge());
			candid.removeGender(candid.getGender());
			candid.removeInitial(initial());
			candid.removeName(candid.getName());
		} else if (hapus == 0) {
			System.out.println("Back to menu");
			scan.nextLine();
			
		} else {
			candid.removeAddress(candid.getAddress());
			candid.removeAge(candid.getAge());
			candid.removeGender(candid.getGender());
			candid.removeInitial(initial());
			candid.removeName(candid.getName());
		}
	}
	}
	void sort() {
		for(int i=0; i<candid.getNames().size(); i++) {
			for(int j=0; j<candid.getNames().size()-1; j++) {
				if(candid.getNames().get(j).compareToIgnoreCase(candid.getNames().get(j+1))>0) {
					String temp = candid.getNames().get(j);
					candid.setName(j, candid.getNames().get(j+1));
					candid.setName(j+1, temp);
					
					String temp2 = candid.getGenders().get(j);
					candid.setGender(j, candid.getGenders().get(j+1));
					candid.setGender(j+1, temp2);
					
					
					Integer temp3 = candid.getAges().get(j);
					candid.setAge(j, candid.getAges().get(j+1));
					candid.setAge(j+1, temp3);
					
					String temp4 = candid.getAddresses().get(j);
					candid.setAddress(j, candid.getAddresses().get(j+1));
					candid.setAddress(j+1, temp4);
					
					String temp5 = candid.getInitials().get(j);
					candid.setInitial(j, candid.getAddresses().get(j+1));
					candid.setInitial(j+1, temp5);

					
				}
			}
		}
	}
	
	void exit() {
		System.out.println("Bye");
		System.exit(0);
	}
	
	
	private View_Candid() {
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
				remove();
				break;
				
			case 4:
				exit();
				break;
			}
		}while(choose !=4);
	}
	
	
	public static void main (String[] args) {
		new View_Candid();
		
//		Scanner scan = new Scanner(System.in);
//		
//		Input candid = new Input();
//		for(int j = 0; j<2; j++) {
//		System.out.println("Input name : ");
//		candid.setName(scan.nextLine());
//		System.out.println("Input Gender : ");
//		candid.setGender(scan.nextLine());
//		System.out.println("Input Age : ");
//		candid.setAge(scan.nextInt());
//		System.out.println("Input Address : ");
//		candid.setAddress(scan.nextLine());
//		
//		
//		
//		candid.adds(candid.getName());
//		candid.adds3(candid.getGender());
//		candid.adds2(candid.getAge());
//		candid.adds4(candid.getAddress());
//		}
//		
//		for(int i = 0; i<candid.getNames().size(); i++) {
//			System.out.println("Name : "+candid.getNames());
//			System.out.println("Gender : "+candid.getGenders());
//			System.out.println("Age : "+candid.getAges());
//			System.out.println("Address : "+candid.getAddresses());
//		}
	}
}
