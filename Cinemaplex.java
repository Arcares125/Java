import java.util.*;

public class Cinemaplex{

    static String ID1() {
        Random r = new Random();
        String id1 = "";
        for (int i = 0; i < 1; i++) {
            id1 += (char) (r.nextInt(10) + 48);
        }
        return id1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<get_Cinemaplex> input = new ArrayList<get_Cinemaplex>();
        String nama;
        Integer choose = 0;
        Integer tiket;
        String tiket1;
        do{

        System.out.println("Welcome, ");
        System.out.println("Input nama : ");
        nama = scan.nextLine();
        if (nama.length() < 5 || nama.length() > 25) {
            do {
                System.out.println("Nama harus diantara 5-25 Char : ");
                nama = scan.nextLine();
            } while (nama.length() < 5 || nama.length() > 25);
        }

        System.out.println("==============");
        System.out.println("| Cinemaplex |");
        System.out.println("==============");
        System.out.println("Welcome, " + nama);
        System.out.println("1. The Hobbit : The Battle of the Five Armies");
        System.out.println("2. Stand by Me Doraemon");
        System.out.println("3. Penguins of Madagascar");
        System.out.println("4. The Hunger Games : Mockingjay part 1");
        System.out.println("5. View");
        System.out.println("6. Exit");
        System.out.print("Choose >>");
        choose = scan.nextInt();
        scan.nextLine();
        if (choose < 1 || choose > 6) {
            do {
                System.out.println("Input harus 1 - 5 : ");
                choose = scan.nextInt();
                scan.nextLine();
            } while (choose < 1 || choose > 6);
        }

        if (choose == 1) {
            String film = "The Hobbit : The Battle of the Five Armies";
            Integer waktu = 144;
            Integer price = 50000;
            System.out.println("Input ticket to be booked : ");
            tiket1 = scan.nextLine();
            do {
                try {
                    tiket = Integer.parseInt(tiket1);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Input Number : ");
                    tiket1 = scan.nextLine();
                    tiket = -1;
                }
            } while (tiket == -1);

            if (tiket < 1) {
                do {
                    System.out.println("Input must be at least 1 & Number: ");
                    tiket1 = scan.nextLine();
                    try {
                        tiket = Integer.parseInt(tiket1);
                    } catch (Exception e) {
                        // TODO: handle exception
                        tiket = -1;
                    }
                } while (tiket < 1);
            }
            int total = tiket*price;
            System.out.printf("%d ticket(s) has been booked for : \n", tiket);
            System.out.printf("Title : %s\n", film);
            System.out.printf("Length : %d\n", waktu);
            System.out.printf("Rating : %s\n", ID1());
            System.out.printf("Price : %d\n", price);
            System.out.println("========================");
            System.out.printf("Total : %d\n", total);
            System.out.println();

            get_Cinemaplex film1 = new get_Cinemaplex(nama, film, tiket, ID1(), total, waktu);
            input.add(film1);
        }

        if (choose == 2) {
            String film = "Stand by Me Doraemon";
            Integer waktu = 99;
            Integer price = 40000;
            System.out.println("Input ticket to be booked : ");
            tiket1 = scan.nextLine();
           do {
                try {
                    tiket = Integer.parseInt(tiket1);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Input Number : ");
                    tiket1 = scan.nextLine();
                    tiket = -1;
                }
            } while (tiket == -1);

            if (tiket < 1) {
                do {
                    System.out.println("Input must be at least 1 & Number: ");
                    tiket1 = scan.nextLine();
                    try {
                        tiket = Integer.parseInt(tiket1);
                    } catch (Exception e) {
                        // TODO: handle exception
                        tiket = -1;
                    }
                } while (tiket < 1);
            }
            int total = tiket*price;
            System.out.printf("%d ticket(s) has been booked for : \n", tiket);
            System.out.printf("Title : %s\n", film);
            System.out.printf("Length : %d\n", waktu);
            System.out.printf("Rating : %s\n", ID1());
            System.out.printf("Price : %d\n", price);
            System.out.println("========================");
            System.out.printf("Total : %d\n", total);
            System.out.println();

            get_Cinemaplex film1 = new get_Cinemaplex(nama, film, tiket, ID1(), total, waktu);
            input.add(film1);
        }

        if (choose == 3) {
            String film = "Penguins of Madagascar";
            Integer waktu = 92;
            Integer price = 35000;
            System.out.println("Input ticket to be booked : ");
            tiket1 = scan.nextLine();
           do {
                try {
                    tiket = Integer.parseInt(tiket1);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Input Number : ");
                    tiket1 = scan.nextLine();
                    tiket = -1;
                }
            } while (tiket == -1);

            if (tiket < 1) {
                do {
                    System.out.println("Input must be at least 1 & Number: ");
                    tiket1 = scan.nextLine();
                    try {
                        tiket = Integer.parseInt(tiket1);
                    } catch (Exception e) {
                        // TODO: handle exception
                        tiket = -1;
                    }
                } while (tiket < 1);
            }
            int total = tiket*price;
            System.out.printf("%d ticket(s) has been booked for : \n", tiket);
            System.out.printf("Title : %s\n", film);
            System.out.printf("Length : %d\n", waktu);
            System.out.printf("Rating : %s\n", ID1());
            System.out.printf("Price : %d\n", price);
            System.out.println("========================");
            System.out.printf("Total : %d\n", total);
            System.out.println();

            get_Cinemaplex film1 = new get_Cinemaplex(nama, film, tiket, ID1(), total, waktu);
            input.add(film1);
        }

        if (choose == 4) {
            String film = "The Hunger Games: Mockingjay part 1";
            Integer waktu = 102;
            Integer price = 35000;
            System.out.println("Input ticket to be booked : ");
            tiket1 = scan.nextLine();
           do {
                try {
                    tiket = Integer.parseInt(tiket1);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Input Number : ");
                    tiket1 = scan.nextLine();
                    tiket = -1;
                }
            } while (tiket == -1);

            if (tiket < 1) {
                do {
                    System.out.println("Input must be at least 1 & Number: ");
                    tiket1 = scan.nextLine();
                    try {
                        tiket = Integer.parseInt(tiket1);
                    } catch (Exception e) {
                        // TODO: handle exception
                        tiket = -1;
                    }
                } while (tiket < 1);
            }
            int total = tiket*price;
            System.out.printf("%d ticket(s) has been booked for : \n", tiket);
            System.out.printf("Title : %s\n", film);
            System.out.printf("Length : %d\n", waktu);
            System.out.printf("Rating : %s\n", ID1());
            System.out.printf("Price : %d\n", price);
            System.out.println("========================");
            System.out.printf("Total : %d\n", total);
            System.out.println();

            get_Cinemaplex film1 = new get_Cinemaplex(nama, film, tiket, ID1(), total, waktu);
            input.add(film1);
        }

        if(choose == 5){
            String a = "No", b = "Title", c = "Length", d = "Rating", e = "Ticket", f = "Total", g = "Name";
    
            System.out.println("================================================================================================================================");
            System.out.printf("|%-3s |%-10s |%-50s |%-10s |%-10s |%-15s |%-15s |\n",a , g, b, c, d, e, f);
            System.out.println("================================================================================================================================");
            for (int i = 0; i < input.size(); i++) {
                System.out.printf("|%-3d |%-10s |%-50s |%-10d |%-10s |%-15d |%-15d |\n", (i + 1), input.get(i).getName(), input.get(i).getMovie(), input.get(i).getWaktu(),
                        input.get(i).getRating(), input.get(i).getTicket(), input.get(i).getTotal());
            }
            System.out.println("================================================================================================================================");
        }

        if (choose == 6) {
            System.out.println("Thanks, Bye!!!");
            System.exit(0);
        }
    }while(true);
    }
}
