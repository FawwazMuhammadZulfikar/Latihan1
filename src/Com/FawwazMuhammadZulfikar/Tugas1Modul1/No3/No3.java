package Com.FawwazMuhammadZulfikar.Tugas1Modul1.No3;

public class No3 {
    private static String nama = "Puan Maharani";
    private static int setUmur(){
        int umur = 39;
        return umur;
    }
    private static String alamat = "WKWK Land";
    private static int setGaji(){
        int gaji = 1000000;
        return gaji;
    }
    private static String jabatan ="tukang mute mic";
    private static String kewarganegaraan = "WKWK Land";

    public static void main(String[] args) {
        System.out.println("****Data Karyawan****");
        System.out.println("");
        System.out.println("Nama           \t : " + nama);
        System.out.println("Umur           \t : " + setUmur());
        System.out.println("alamat         \t : " + alamat);
        System.out.println("Gaji           \t : " + setGaji());
        System.out.println("Jabatan        \t : " + jabatan);
        System.out.println("Kewarganegaraan\t : " + kewarganegaraan);
    }
}
