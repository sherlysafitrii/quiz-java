public class Mahasiwa {
    public String name;
    public String nim;
    public String jurusan;
    public int tahun_lahir;
    public String jenis_kelamin;

    public Mahasiwa(String name, String nim, String jurusan, int tahun_lahir, String jenis_kelamin) {
        this.name = name.length() < 8 ? name+"\t" : name;
        this.nim = nim.length() < 8 ? nim+"\t" : nim;
        this.jurusan = jurusan.length() < 8 ? jurusan+"\t\t" : (jurusan.length() < 16 ? jurusan+"\t" : jurusan);
        this.tahun_lahir = tahun_lahir;
        this.jenis_kelamin = jenis_kelamin;
    }
    public int Umur(){
        return 2023 - Integer.valueOf(tahun_lahir);
    }
}