import java.util.Scanner;
import java.util.ArrayList;

public class View2 {
	Scanner scan = new Scanner(System.in);
	static ArrayList<Input> input2 = new ArrayList<>();
	String nama, gender, address;
	Integer age;
	
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
		System.out.println("Input name ");
		nama = scan.nextLine();
		if(nama.length()<=4 || nama.length()>=21) {
			do {
				System.out.println("Candidates name 5 - 20 Char :");
				nama = scan.nextLine();
			}while(nama.length()<=4 || nama.length()>=21);
		}
		
		else if (!nama.contains(" ")) {
			do {
				System.out.println("Must contain space : ");
				nama = scan.nextLine();
			}while(!nama.contains(""));
		}
		
		else if(nama.startsWith(" ") || nama.endsWith(" ")) {
			do {
				System.out.println("Cannot starts with or ends with space : ");
				nama = scan.nextLine();
			}while(nama.startsWith(" ") || nama.endsWith(" "));
		}
		
		System.out.println("Input gender : " );
		gender = scan.nextLine();
		if(!gender.equals("Male") && !gender.equals("Female")) {
			do {
				System.out.println("Must be male or Female : ");
				gender = scan.nextLine();
			}while(!gender.equals("Male") && !gender.equals("Female"));
		}
		
		System.out.println("Input address : ");
		address=scan.nextLine();
		if(!address.endsWith("Street")) {
			do {
				System.out.println("Input must be include Street : ");
				address=scan.nextLine();
			}while(!address.endsWith("Street"));
		}
		
		System.out.println("Input your age : ");
		age=scan.nextInt();scan.nextLine();
		if(age < 17 || age > 30) {
			do {
				System.out.println("Must be 17 - 30");
				age=scan.nextInt();scan.nextLine();
			}while(age < 17 || age > 30);
		}
		
		for(int i = 0; i < nama.length();i++) {
			if(nama.charAt(i) == ' ') {
				String initial = nama.substring(0,1).toUpperCase()+Character.toUpperCase(nama.charAt(i+1));
				System.out.println("Thanks for registering -- your Initial is "+initial);
				break;
			}
		}
		String initial=initial();
		Input arr = new Input(nama, gender, address, age, initial);
		input2.add(arr);
	}
	
	String initial() {
		for(int i = 0; i < nama.length();i++) {
			if(nama.charAt(i) == ' ') {
				String initial = nama.substring(0,1).toUpperCase()+Character.toUpperCase(nama.charAt(i+1));
				break;
			}
		}
		return nama;
	}
	

		String a = "No. ", b="Name", c="Initial", d="Gender", e="Age",f="Address";
		void view() {
			if(input2.isEmpty()) {
				System.out.println("No data !!!");
			} else {
				System.out.println("========================================================================");
				System.out.printf("|%-3s |%-15s |%-7s |%-9s |%-10s|%-17s|\n",a,b,c,d,e,f);
				System.out.println("========================================================================");
				for(int i=0; i<input2.size();i++) {
					System.out.printf("|%-5d|%-16s|%-8s|%-10s|%-10d|%-17s|\n",i+1,input2.get(i).getName(), input2.get(i).getInitial(), input2.get(i).getGender(), input2.get(i).getAge(), input2.get(i).getAddress());
				}
				System.out.println("========================================================================");
			}
		}
		
		Integer hapus=0;
		void remove() {
			if(input2.isEmpty()) {
				System.out.println("No Data");
			} else {
		
				view();
				System.out.printf("Input index to delete [1 - %d] - 0 to cancel\n", input2.size());
				hapus=scan.nextInt();scan.nextLine();
				if(hapus > input2.size()) {
					do {
						System.out.println("Input cant be more than the list : ");
						hapus=scan.nextInt();scan.nextLine();
					}while(hapus > input2.size());
				
					input2.remove(hapus-1);
				
				} else if (hapus == 0) {
					System.out.println("Back to menu");
					scan.nextLine();
				
				} else {
					input2.remove(hapus-1);
				}
			}
		}
		
		void sort() {
			for(int i=0; i<input2.size(); i++) {
				for(int j=0; j<input2.size()-1; j++) {
					if(input2.get(j).getName().compareToIgnoreCase(input2.get(j+1).getName())>0) {
						input2.toArray();
						String temp = input2.get(j).getName();
						input2.get(j).setName(input2.get(j+1).getName());
						input2.get(j+1).setName(temp);

						//0 - b 1 - a
						
					}
				}
			}
		}
		
		void exit() {
			System.out.println("Bye");
			System.exit(0);
		}
	

	
	Integer choose = 0;
	public View2() {
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
	
	public static void main(String[] args) {
		new View2();
		
		
	}
}