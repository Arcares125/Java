import java.util.*;

public class Mentoll {
    Random r = new Random();
    Scanner scan = new Scanner(System.in);

    List<String> vName = new ArrayList<String>();
    List<String> vCode = new ArrayList<String>();
    List<String> vGender = new ArrayList<String>();

    List<String> vJabatan = new ArrayList<String>();
    List<String> vManager = new ArrayList<String>();
    List<String> vSupervisor = new ArrayList<String>();
    List<String> vAdmin = new ArrayList<String>();

    List<Integer> vGaji = new ArrayList<Integer>();

    void menu() {
        System.out.println("PT. Mentol");
        System.out.println("+=+=+=+=+=+");
        System.out.println("1. Input");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println(">>>");
    }

    String nama;
    String Gender;
    String jabatan;

    void checkGaji(){
        for (int i = 0; i < vJabatan.size(); i++) {
            if (vManager.size() <= 3) {
                if (vJabatan.get(i).equals("Manager")) {
                    vGaji.set(i, 8000000);
                }
            } else if (vManager.size() >= 4) {
                Integer cout = 0;
                for (int j = 0; j < vJabatan.size(); j++) {
                    if (vJabatan.get(j).equals("Manager")) {
                        cout++;
                        vGaji.set(j, 8800000);
                        if (cout == vManager.size()) {
                                vGaji.set(vJabatan.lastIndexOf("Manager"), 8000000);
                            }
                        }
                    }  
                }
            }

            for(int i = 0; i < vJabatan.size(); i++){
                if(vSupervisor.size() <= 3){
                    if(vJabatan.get(i).equals("Supervisor")){
                        vGaji.set(i, 6000000);
                    }
                } else if (vSupervisor.size() >= 4){
                    Integer cout1 = 0;
                    for(int j = 0; j < vJabatan.size(); j++){
                        if(vJabatan.get(j).equals("Supervisor")){
                            cout1++;
                            vGaji.set(j, 6450000);
                            if(cout1 == vSupervisor.size()){
                                vGaji.set(vJabatan.lastIndexOf("Supervisor"), 6000000);
                            }
                        }
                    }  
                }
            }

            for(int i = 0; i < vJabatan.size(); i++){
                if(vAdmin.size() <= 3){
                    if(vJabatan.get(i).equals("Admin")){
                        vGaji.set(i, 4000000);
                    }
                } else if (vAdmin.size() >= 4){
                    Integer cout2 = 0;

                    for(int j = 0; j < vJabatan.size(); j++){
                        if(vJabatan.get(j).equals("Admin")){
                            cout2++;
                            vGaji.set(j, 4200000);
                            if(cout2 == vAdmin.size()){
                                vGaji.set(vJabatan.lastIndexOf("Admin"), 4000000);
                            }
                        }
                    }  
                }
            }
        }

    Integer cek() {
        int flag = 0;
        for (int i = 0; i < nama.length(); i++) {
            char Check = nama.charAt(i);
            if (!(Check >= 'a' && Check <= 'z') && !(Check >= 'A' && Check <= 'Z') && !(Check >= 31 && Check <= 33)) {
                flag++;
            }
        }
        if (flag != 0) {
            System.out.println("Input Harus Alphabet : ");
            nama = scan.nextLine();
            cek();
        }

        if (nama.length() < 3) {
            do {
                System.out.println("Input Harus lebih dari 3 char : ");
                nama = scan.nextLine();
                cek();
            } while (nama.length() < 3);
        }
        return flag;
    }

    // Integer cout=0, cout1=0, cout2=0;
    void input() {
        System.out.println("Input Nama [Minimal 3 Char]:");
        nama = scan.nextLine();
        cek();

        System.out.println("Input Gender [Laki Laki / Perempuan (Case-Sensitive)]: ");
        Gender = scan.nextLine();
        if (!Gender.equals("Laki Laki") && !Gender.equals("Perempuan")) {
            do {
                System.out.println("Harus Laki Laki/Perempuan : ");
                Gender = scan.nextLine();
            } while (!Gender.equals("Laki Laki") && !Gender.equals("Perempuan"));
        }

        System.out.println("Input Jabatan [Manager / Supervisor / Admin] (Case-Sensitive): ");
        jabatan = scan.nextLine();
        if (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin")) {
            do {
                System.out.println("Harus [Manager / Supervisor / Admin] : ");
                jabatan = scan.nextLine();
            } while (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"));
        }

        Integer gaji = 8000000;
        Integer gaji2 = 6000000;
        Integer gaji3 = 4000000;

        if (jabatan.equals("Manager")) {
            vManager.add(jabatan);
            vGaji.add(gaji);
            Integer cout = 0;
            for (int i = 0; i < vJabatan.size(); i++) {
                if (vManager.size() >= 4) {
                    if (vJabatan.get(i).equals("Manager")) {
                        vGaji.set(i, 8800000);
                        cout++;
                        if (cout == vManager.size()) {
                            vGaji.set(i - 1, 8000000);
                        }
                    }
                }
            }
        } else if (jabatan.equals("Supervisor")) {
            vSupervisor.add(jabatan);
            vGaji.add(gaji2);
            Integer cout1 = 0;
            for (int i = 0; i < vJabatan.size(); i++) {
                if (vSupervisor.size() >= 4) {
                    if (vJabatan.get(i).equals("Supervisor")) {
                        vGaji.set(i, 6450000);
                        cout1++;
                        if (cout1 == vSupervisor.size()) {
                            vGaji.set(i - 1, 6000000);
                        }
                    }
                }
            }
        } else if (jabatan.equals("Admin")) {
            vAdmin.add(jabatan);
            vGaji.add(gaji3);
            Integer cout2 = 0;
            for (int i = 0; i < vJabatan.size(); i++) {
                if (vAdmin.size() >= 4) {
                    if (vJabatan.get(i).equals("Admin")) {
                        vGaji.set(i, 4200000);
                        cout2++;
                        if (cout2 == vAdmin.size()) {
                            vGaji.set(i - 1, 4000000);
                        }
                    }
                }
            }
        }

        String kode = ID2() + "-" + ID1();
        System.out.println("Kode Karyawan : " + kode);

        vName.add(nama);
        vCode.add(kode);
        vJabatan.add(jabatan);
        vGender.add(Gender);
        System.out.println("Size Nama : " + vName.size());
    }

    void view() {
        String a = "No", b = "Kode", c = "Nama Karyawan", d = "Gender", e = "Jabatan", f = "Gaji";
        checkGaji();
        sort();

        System.out.println("===============================================================================");
        System.out.printf("|%-3s |%-8s |%-20s |%-10s |%-10s |%-15s |\n", a, b, c, d, e, f);
        System.out.println("===============================================================================");
        for (int i = 0; i < vName.size(); i++) {
            System.out.printf("|%-3d |%-8s |%-20s |%-10s |%-10s |%-15d |\n", (i + 1), vCode.get(i), vName.get(i),
                    vGender.get(i), vJabatan.get(i), vGaji.get(i));
        }
        System.out.println("===============================================================================");
    }

    void sort() {
        for (int i = 0; i < vName.size(); i++) {
            for (int j = 0; j < vName.size() - 1; j++) {
                if (vName.get(j).compareToIgnoreCase(vName.get(j + 1)) > 0) {
                    String temp = vName.get(j);
                    vName.set(j, vName.get(j + 1));
                    vName.set(j + 1, temp);

                    String temp2 = vJabatan.get(j);
                    vJabatan.set(j, vJabatan.get(j + 1));
                    vJabatan.set(j + 1, temp2);

                    Integer temp3 = vGaji.get(j);
                    vGaji.set(j, vGaji.get(j + 1));
                    vGaji.set(j + 1, temp3);

                    String temp6 = vGender.get(j);
                    vGender.set(j, vGender.get(j + 1));
                    vGender.set(j + 1, temp6);

                    String temp7 = vCode.get(j);
                    vCode.set(j, vCode.get(j + 1));
                    vCode.set(j + 1, temp7);
                }
            }
        }
    }

    String ID1() {
        String id1 = "";
        for (int i = 0; i < 4; i++) {
            id1 += (char) (r.nextInt(10) + 48);
        }
        return id1;
    }

    String ID2() {
        String id2 = "";
        for (int i = 0; i < 2; i++) {
            id2 += (char) (r.nextInt(26) + 65);
        }
        return id2;
    }

    Integer update = 0;

    void update() {
        if (vName.isEmpty()) {
            System.out.println("No Data!!!");
        } else {
            view();
            System.out.println("Input index to update : ");
            update = scan.nextInt();

            if(vJabatan.get(update-1).equals("Manager")){
                vManager.remove(vManager.size()-1);
            } else if (vJabatan.get(update-1).equals("Supervisor")){
                vSupervisor.remove(vSupervisor.size()-1);
            } else if (vJabatan.get(update-1).equals("Admin")){
                vAdmin.remove(vAdmin.size()-1);
            }

            System.out.println("Input Nama [Minimal 3 Char]:");
            scan.nextLine();
            nama = scan.nextLine();
            cek();

            System.out.println("Input Gender [Laki Laki / Perempuan (Case-Sensitive)]: ");
            Gender = scan.nextLine();
            if (!Gender.equals("Laki Laki") && !Gender.equals("Perempuan")) {
                do {
                    System.out.println("Harus Laki Laki/Perempuan : ");
                     Gender = scan.nextLine();
                } while (!Gender.equals("Laki Laki") && !Gender.equals("Perempuan"));
            }

            System.out.println("Input Jabatan [Manager / Supervisor / Admin] (Case-Sensitive): ");
            jabatan = scan.nextLine();
            if (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin")) {
                do {
                    System.out.println("Harus [Manager / Supervisor / Admin] : ");
                    jabatan = scan.nextLine();
                } while (!jabatan.equals("Manager") && !jabatan.equals("Supervisor")&& !jabatan.equals("Admin"));
            }

            Integer gaji = 8000000;
            Integer gaji2 = 6000000;
            Integer gaji3 = 4000000;

            if (jabatan.equals("Manager")) {
                vManager.add(jabatan);
                vGaji.add(gaji);
                Integer cout = 0;
                for (int j = 0; j < vJabatan.size(); j++) {
                    if (vManager.size() >= 4) {
                        if (vJabatan.get(j).equals("Manager")) {
                            vGaji.set(j, 8800000);
                            cout++;
                            if (cout == vManager.size()) {
                                vGaji.set(j - 1, 8000000);
                            }
                        }
                    }
                }
            } else if (jabatan.equals("Supervisor")) {
                vSupervisor.add(jabatan);
                vGaji.add(gaji2);
                Integer cout1 = 0;
                for (int j = 0; j < vJabatan.size(); j++) {
                    if (vSupervisor.size() >= 4) {
                        if (vJabatan.get(j).equals("Supervisor")) {
                            vGaji.set(j, 6450000);
                            cout1++;
                            if (cout1 == vSupervisor.size()) {
                                vGaji.set(j - 1, 6000000);
                            }
                        }
                    }
                }
            } else if (jabatan.equals("Admin")) {
                vAdmin.add(jabatan);
                vGaji.add(gaji3);
                Integer cout2 = 0;
                for (int j = 0; j < vJabatan.size(); j++) {
                    if (vAdmin.size() >= 4) {
                        if (vJabatan.get(j).equals("Admin")) {
                            vGaji.set(j, 4200000);
                            cout2++;
                            if (cout2 == vAdmin.size()) {
                                vGaji.set(j - 1, 4000000);
                            }
                        }
                    }
                }
            }

            String kode = ID2() + "-" + ID1();
            System.out.println("Kode Karyawan : " + kode);

            vName.set(update-1, nama);
            vCode.set(update-1, kode);
            vJabatan.set(update-1, jabatan);
            vGender.set(update-1, Gender);
            vGaji.set(update-1, vGaji.get(vGaji.size() - 1));
        }
    }

    Integer delete = 0;

    void delete() {
        if (vName.isEmpty()) {
            System.out.println("No Data!!!");
        } else {
            view();

            System.out.println("Input index to delete : ");
            delete = scan.nextInt();
            scan.nextLine();

            if (vJabatan.get(delete - 1).equals("Manager")) {
                vManager.remove(vManager.size() - 1);
            } else if (vJabatan.get(delete - 1).equals("Supervisor")) {
                vSupervisor.remove(vSupervisor.size() - 1);
            } else if (vJabatan.get(delete - 1).equals("Admin")) {
                vAdmin.remove(vAdmin.size() - 1);
            }
            vName.remove(delete - 1);
            vGender.remove(delete - 1);
            vJabatan.remove(delete - 1);
            vGaji.remove(delete - 1);
            vCode.remove(delete - 1);

                checkGaji();
            }
        }
    void exit(){
        System.out.println("Thanks, bye!!!");
        System.exit(0);
    }

    Integer pilih=0;
    String pilih1="";
    public Mentoll(){
        do{
            menu();
                pilih1=scan.nextLine();
                do{
                    try {
                        pilih = Integer.parseInt(pilih1);
                    } catch (Exception e) {
                        //TODO: handle exception
                        System.out.println("Input Number : ");
                        pilih1=scan.nextLine();
                        pilih=-1;
                    }
                }while(pilih == -1);
            switch(pilih){
                case 1:
                input();
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
        }while(pilih != 5);
    }
    
    public static void main(String[] args){
        new Mentoll();
    }
}