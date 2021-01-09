import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class tanggal_Lahir {
    Scanner scan = new Scanner(System.in);
    List<String> vTanggal = new ArrayList<String>();
    List<Integer>vUmur = new ArrayList<Integer>();
    String input;
    Integer tanggal, bulan, tahun;

    void input(){
        do{
          System.out.print("Input your birthday : ");
            input = scan.nextLine();

            if(input.equals("0")){
                break;
            } else if (input.length() !=8){
                do{
                    System.out.println("Must be 8 long :");
                   input=scan.nextLine();
                }while(input.length() != 8);
            } else {
                tanggal = Integer.parseInt(input.substring(0, 2));
                bulan = Integer.parseInt(input.substring(2, 4));
                tahun = Integer.parseInt(input.substring(4, 8));

                if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12){
                    if(tanggal > 31){
                        do{
                            System.out.println("Cannot more than 31 : ");
                            input=scan.nextLine();
                            tanggal = Integer.parseInt(input.substring(0, 2));
                            bulan = Integer.parseInt(input.substring(2, 4));
                            
                        }while(tanggal > 31);
                    }
                } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11){
                    if(tanggal > 30){
                        do{
                            System.out.println("Cannot more than 30 : ");
                            input=scan.nextLine();
                            tanggal = Integer.parseInt(input.substring(0, 2));
                            bulan = Integer.parseInt(input.substring(2, 4));
              
                        }while(tanggal > 30);
                    }
                } else if (bulan == 2 && tahun % 4 == 0){
                    if(tanggal > 29 && bulan == 2 && tahun % 4 == 0){
                        do{
                            System.out.println("Cannot more than 29 : ");
                            input=scan.nextLine();
                            tanggal = Integer.parseInt(input.substring(0, 2));
                            bulan = Integer.parseInt(input.substring(2, 4));
                        }while(tanggal > 29 && bulan == 2 && tahun % 4 == 0);
                    }
                } else if (bulan == 2 && tahun %4 != 0){
                    if(tanggal > 28 && bulan == 2 && tahun %4 != 0){
                        do{
                            System.out.println("Cannot more than 28 : ");
                            input=scan.nextLine();
                            tanggal = Integer.parseInt(input.substring(0, 2));
                            bulan = Integer.parseInt(input.substring(2, 4));
                        }while(tanggal > 28 && bulan == 2 && tahun %4 != 0);
                    }
                }
            }
        Integer temp5=Integer.parseInt(input.substring(4, 8));
        Integer umur = 2021 - temp5;
            vTanggal.add(input);
            vUmur.add(umur);

        }while(!input.equals("0"));
    }

    void view(){
        sort();
        for(int i = 0; i < vTanggal.size(); i++){
            System.out.println("Tanggal lahir : "+vTanggal.get(i));
            System.out.println();
        }
    }

    void sort(){
        for(int i = 0; i < vTanggal.size(); i++){
            for(int j = 0; j < vTanggal.size(); j ++){
                if(vUmur.get(i)<vUmur.get(j)){
                    String temp = vTanggal.get(i);
                    vTanggal.set(i, vTanggal.get(j));
                    vTanggal.set(j, temp);

                    Integer temp2 = vUmur.get(i);
                    vUmur.set(i, vUmur.get(j));
                    vUmur.set(j, temp2);
                }
            }
        }
    }

    void menu(){
        System.out.println("Choose 1");
        System.out.println("1. Input");
        System.out.println("2. View");
        System.out.println("3. Mean");
        System.out.println("4. Median");
        System.out.println("5. Modus");
        System.out.println("6. Exit");
    }

    void exit(){
        System.exit(0);
        System.out.println("Bye");
    }

    private void modus() {
		int modus = 0;
		int angka = 0;
		
        for ( int i = 0; i < vUmur.size(); i++ ){
        	int x = vUmur.get(i);
        	int tempAngka = 1;
          
       		 for(int j = 0; j < vUmur.size(); j++){

        		int y = vUmur.get(j);
          
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

	public void median() {
		int angka = vUmur.size();
		if (angka % 2 == 0) {
			System.out.println("Median : " + ( ((vUmur.get(angka/2 - 1) + vUmur.get(angka/2)) / 2.0) ) );
		} else {
			System.out.println("Median : " + vUmur.get(angka/2));
		}
	}

	public void mean() {
		int totalUmur = 0;
		
		for (int i = 0; i < vUmur.size(); i++) {
			totalUmur = totalUmur + vUmur.get(i);
		}
		System.out.println();
		System.out.println("Mean : " + ((double)totalUmur / vUmur.size()));
		
	}

    Integer pilih = 0;
    public tanggal_Lahir(){
        do{
            menu();
            pilih=scan.nextInt();scan.nextLine();
            switch(pilih){
                case 1:
                input();
                    break;
                case 2:
                view();
                    break;
                case 3:
                mean();
                    break;
                case 4:
                median();
                    break;
                case 5:
                modus();
                    break;
                case 6:
                exit();
                    break;
            }
        }while(pilih != 6);
    }

    public static void main (String[] args){
        new tanggal_Lahir();
    }
    
}
