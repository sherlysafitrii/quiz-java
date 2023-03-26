import java.util.ArrayList;
public class Main {
    private ArrayList <Mahasiwa> dataMasiswa;
    public static void main(String[] args) throws Exception {
        Main Screen = new Main();
        Screen.inputData();
        Screen.cetakData();
    }
    public void inputData() {
        dataMasiswa = new ArrayList<Mahasiwa>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("________________________________");
            System.out.println("Data Mahasiswa ke "+number);
            System.out.print("NIM : ");
            String nim = System.console().readLine();
            System.out.print("Nama : ");
            String name = System.console().readLine();
            System.out.print("Jurusan : ");
            String jurusan = System.console().readLine();
            System.out.print("tahun lahir:");
            int tahun_lahir = Integer.parseInt(System.console().readLine());
            System.out.print("jenis kelamin :");
            String jenis_kelamin = System.console().readLine();
            Mahasiwa mahasiswa = new Mahasiwa(name, nim, jurusan, tahun_lahir,jenis_kelamin);
            dataMasiswa.add(mahasiswa);
            System.out.print("Apakah Anda Ingin Menambahkan Nama Lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equals("Y") || jawaban.equals("y"));
    }
    public void cetakData() {
        System.out.println("\n\n======================================================================================");
        System.out.println("DAFTAR KELULUSAN MAHASISWA");
        System.out.println("======================================================================================");
        System.out.println("No\tNIM\t\tNama\t\tJurusan\t\t\tUmur\t Jenis Kelamin");
        System.out.println("======================================================================================");
        int n_per = 0;
        int n_lak = 0;

        for (int i = 0; i < dataMasiswa.size(); i++) {
            System.out.println((i+1)+"\t"+dataMasiswa.get(i).nim+"\t"+dataMasiswa.get(i).name+"\t"+dataMasiswa.get(i).jurusan+"\t"+dataMasiswa.get(i).Umur()+"\t"+dataMasiswa.get(i).jenis_kelamin);

            if (dataMasiswa.get(i).jenis_kelamin.equals("perempuan")) {
                n_per++;
            } else if (dataMasiswa.get(i).jenis_kelamin.equals("laki-laki")) {
                n_lak++;
            }
           
        }

        System.out.println("======================================================================================");
        System.out.println("Jumlah Mahasiswa perempuan : "+n_per);
        System.out.println("Jumlah Mahasiswa laki-laki : "+n_lak);
        

    }
}