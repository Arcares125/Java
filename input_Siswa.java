import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class input_Siswa {
	
	List<String> vNama = new ArrayList<String>();
	List<String> vJawaban = new ArrayList<String>();
	List<Integer> vNilai = new ArrayList<Integer>();
	List<Integer> vPoint = new ArrayList<Integer>();
	Scanner scan = new Scanner(System.in);
	
	
	
	void exit() {
		System.out.println("Bye");
		System.exit(0);
	}

	public void input() {
		String nama = "";
		String jawab = "";
		int x = 0;
		int y = 0;
		
		System.out.print("Your Name : ");
		nama = scan.nextLine();
		vNama.add(nama);
		do {
			System.out.print("Input your Answer [ A | B | C | D | E ] [ '0' if u finish ] : ");
			jawab = scan.nextLine();
			if (jawab.equals("0")) {
				break;
			} else if (!jawab.equals("A") && !jawab.equals("B") && !jawab.equals("C") && !jawab.equals("D") && !jawab.equals("E")) {
				do {
					System.out.print("Answer must be [ A | B | C | D | E ] : ");
					jawab = scan.nextLine();
				} while (!jawab.equals("A") && !jawab.equals("B") && !jawab.equals("C") && !jawab.equals("D") && !jawab.equals("E"));
			}
				
			vJawaban.add(jawab);
				  x++;
				     if(x == 10){
				      y = 1;
				     }
				     if (y == 1 ) {
						do {
							System.out.print("Already Max 10, Input '0' to Continue...  ");
							jawab = scan.nextLine();
						} while (!jawab.equals("0"));
					}
		} while (!jawab.equals("0") && y != 1);
		
		int poin = 0;
		String [] jawaban = {"A", "A", "C", "B", "E", "A", "D", "B", "A", "E"};
		int poinTemp=0;
		
		for (int j = 0; j < vJawaban.size(); j++) {
			if (vJawaban.get(j).equals(jawaban[j])) {
				poinTemp++;
				poin++;
			} else {
				poinTemp++;
				poin += 0;
			}
			if(poinTemp == vJawaban.size()) {
				vPoint.add(poin);
			}
		}
			System.out.println();
			System.out.println("Your Score : " + poin);
			vNilai.add(poin);
			vJawaban.clear();
			
			scan.nextLine();
			
			String a = "No", c = "Student's Name", e = "Score";
			
			System.out.println("==================================");
			System.out.printf("|%-3s |%-20s |%-8s|\n", a, c, e);
			System.out.println("==================================");
			for (int i = 0; i < vNilai.size(); i++) {
				System.out.printf("|%-3d |%-20s |%-8d|\n", (i+1), vNama.get(i), vPoint.get(i));
			}
			System.out.println("==================================");
		
			for (int i = 0; i < vNilai.size()-1; i++) {
				for (int j = 0; j < vNilai.size()-i-1; j++) {
					if (vPoint.get(j) > vPoint.get(j+1)) {
						
						int temp = vPoint.get(j);
						vPoint.set(j, vPoint.get(j+1));
						vPoint.set(j+1, temp);
						
						String strTemp = vNama.get(j);
						vNama.set(j, vNama.get(j+1));
						vNama.set(j+1, strTemp);
						
					}
				}
			}
			System.out.println("\n");
			System.out.println("Score After Sorting");
				System.out.println("==================================");
				System.out.printf("|%-3s |%-20s |%-5s|\n", a, c, e);
				System.out.println("==================================");
				for (int i = 0; i < vNilai.size(); i++) {
					System.out.printf("|%-3d |%-20s |%-5d|\n", (i+1), vNama.get(i), vPoint.get(i));
				}
				System.out.println("==================================");
	}
	
	void median(){
        int temp1 = vPoint.size();
            if(temp1 % 2 == 0){
                System.out.println("Median : "+(((vPoint.get(temp1/2-1)+vPoint.get(temp1/2)/2.0))));
            } else {
                System.out.println("Median : "+ vPoint.get(temp1/2));
            }
        }

    void mean() {
        int totalNilai = 0;
        for (int i = 0; i < vPoint.size(); i++) {
            totalNilai =+  vPoint.get(i);
        }
        System.out.println();
        System.out.println("Mean : " + ((double)totalNilai / vPoint.size()));
    }

    void modus() {
		int modus = 0;
		int angka = 0;
		
        for ( int i = 0; i < vPoint.size(); i++ ){
        	int x = vPoint.get(i);
        	int tempAngka = 1;
          
       		 for(int j = 0; j < vPoint.size(); j++){

        		int y = vPoint.get(j);
          
        		if(x == y){

        			tempAngka++;
          
    				if(tempAngka > angka){
    				angka = tempAngka;
    				modus = x;
       				}
       			} 
			} 
        }
        if(angka <= 2){
            System.out.println("No modus");
        } else {
        System.out.println(modus);
        }
    }

    void menu(){
        System.out.println("1. Input Jawaban");
        System.out.println("2. Mean");
        System.out.println("3. Median");
        System.out.println("4. Modus");
        System.out.println("5. Exit");
        System.out.print(">>");
    }
    
    public input_Siswa() {
        int pilih = 0;
        String pilih1="";
        
		do {
            menu();
            pilih1=scan.nextLine();
            try {
                pilih = Integer.parseInt(pilih1);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Must be Numeric");
                pilih=-1;
            }
		switch (pilih) {
		case 1:
			input();
			break;

		case 2:
			mean();
			break;
			
		case 3:
			median();
			break;
			
		case 4:
			modus();
			break;
			
		case 5:
			exit();
			break;
	        }
		} while (pilih != 5);
	}

	public static void main(String[] args) {
		new input_Siswa();
	}
}