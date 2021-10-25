import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	Vector<Artifact> f1 = new Vector<>();
	
	void menu() {
		System.out.println("Key Domain");
		System.out.println("=======================");
		System.out.println("1. Insert Artifacts");
		System.out.println("2. View Obtainable Artifacts");
		System.out.println("3. Grind for artifact");
		System.out.println("4. Exit");
		System.out.print(">> ");
	}
	
	String type;
	int chooseArte, bAtk;
	Double multi;
	String title, aType , bStat;
	void input() {
		System.out.println("Which artifacts you want to add? ");
		System.out.println("1. Purple Artifact");
		System.out.println("2. Golden Artifact");
		System.out.print(">> ");
		chooseArte = scan.nextInt();scan.nextLine();
		if(chooseArte < 1 || chooseArte > 2) {
			do {
				System.out.println("Wrong input . . .");
				chooseArte = scan.nextInt();scan.nextLine();
			}while(chooseArte < 1 || chooseArte > 2);
		}

		
		do {
			System.out.println("Input Artefact Name: ");
			title = scan.nextLine();
		}while(title.length() < 3 || title.length() > 15);
		
		do {
			System.out.println("Artifact Type [Flower | Plume | Sands | Circlet | Goblet]: ");
			aType = scan.nextLine();
		}while(!(aType.equals("Flower") || aType.equals("Plume") || aType.equals("Sands") || aType.equals("Circlet") || aType.equals("Goblet")));
		
		if(aType.equals("Flower") || aType.equals("Plume")) {
			do {
				System.out.println("Base Attack [90 - 100]: ");
				bAtk = scan.nextInt();scan.nextLine();
			}while(bAtk < 90 || bAtk > 100);
		} else {
			do {
				System.out.println("Base Attack [101 - 110]: ");
				bAtk = scan.nextInt();scan.nextLine();
			}while(bAtk < 101 || bAtk > 110);
		}
		
		if(chooseArte == 1) {
			do {
				System.out.println("Bonus Status[Pryo| Cryo | Anemo | Hydro | Electro ]: ");
				bStat = scan.nextLine();
			}while(!(bStat.equals("Pyro") || (bStat.equals("Cryo")) || (bStat.equals("Anemo"))|| (bStat.equals("Hydro")) || (bStat.equals("Electro"))));
			Integer damage = bAtk * 100;
			f1.add(new Purple(title, aType, bAtk, damage, bStat, chooseArte));
			System.out.println("Input Succesfull ");
			System.out.println();
			
		} else {
			do {
				System.out.println("Input multiplier 1.5 - 2.0: ");
				multi = scan.nextDouble();scan.nextLine();
			}while(multi < 1.5 || multi > 2.0);
			Integer damage = (int) ((bAtk * multi) * 100);
			
			f1.add(new Gold(title, aType, bAtk ,damage, multi, chooseArte));
			System.out.println("Input Succesful");
			System.out.println();
		}

	}
	
	void viewAll() {
		if(f1.isEmpty()) {
			System.out.println("No Artifact");
		} else {
			for(Artifact f2 : f1) {
				if(f2 instanceof Purple) {
					f2.view();
					System.out.println();
				} else if(f2 instanceof Gold) {
					f2.view();
					System.out.println();
				}
			}
		}
		System.out.println("press enter to ocntiune. . . ");
		scan.nextLine();
	}

	
	String chara;
	void menu3() {
		if(f1.isEmpty()) {
			System.out.println("No Artifact to grind. . .");
		} else {
			do {
				System.out.println("Input character to grind [Diluc | Xiao | Keqing] insensitive: ");
				chara = scan.nextLine();
				if(!(chara.equalsIgnoreCase("Xiao") || chara.equalsIgnoreCase("Keqing") || chara.equalsIgnoreCase("Diluc"))) {
					do {
						System.out.println("Character Invalid: ");
						chara = scan.nextLine();
					}while(!(chara.equalsIgnoreCase("Xiao") || chara.equalsIgnoreCase("Keqing") || chara.equalsIgnoreCase("Diluc")));
				}
			}while(!(chara.equalsIgnoreCase("Xiao") || chara.equalsIgnoreCase("Keqing") || chara.equalsIgnoreCase("Diluc")));
			int max = f1.size();
			int min = 0;
			int rndmArte = min + r.nextInt(max);
			if(f1.get(rndmArte).getChooseArte() == 1) {
				System.out.println("Name: "+(f1.get(rndmArte).getName()));
				System.out.println("Type: "+(f1.get(rndmArte).getType()));
				System.out.println("Base Attack: "+(f1.get(rndmArte).getBaseAttack()));
				System.out.println("Damage: "+(f1.get(rndmArte).getDamage()));
				System.out.println("Bonus Stat: "+((Purple)f1.get(rndmArte)).getBonus());
				f1.remove(rndmArte);
			} else {
				System.out.println("Name: "+(f1.get(rndmArte).getName()));
				System.out.println("Type: "+(f1.get(rndmArte).getType()));
				System.out.println("Base Attack: "+(f1.get(rndmArte).getBaseAttack()));
				System.out.println("Damage: "+(f1.get(rndmArte).getDamage()));
				f1.remove(rndmArte);
			}
		}
	}
	
	void exit() {
		String a = "Thanks for Playing Miloyo Program!. . . ";
		for(int i = 0; i < a.length(); i++) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception

			}
			System.out.print(a.charAt(i));
		}
		System.exit(0);
	}
	
	int choose=0;
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
				viewAll();
				break;
				
			case 3:
				menu3();
				break;
			case 4:
				exit();
				break;
			}
		}while(choose != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
