package Com.FawwazMuhammadZulfikar.Tugas1Modul1.No2;

import java.io.IOException;
import java.util.Scanner;

public class No2 {
   public static String baca(){
       int karakter;
       String string = "";
       boolean done = false;
       while(!done){
           try{
               karakter = System.in.read();
               if(karakter<0 ||(char)karakter == '\n')
                   done = true;
               else
                   if(karakter != '\r')
                       string = string+(char)karakter;
           }catch (IOException ioe){
               System.err.println("Anda Salah Input Data!");
               done = true;
           }
       }return string;
   }
}

class registrasi{
    String nama,asal,asalskl,prodi;
    int umur;

    registrasi(String a, int b, String c, String d, String e){
        nama = a;
        umur = b;
        asal = c;
        asalskl = d;
        prodi = e;
    }
    void printData(){
        System.out.println("++++KONFIRMASI REGISTRASI++++");
        System.out.println();
        System.out.println("Nama        : " + nama);
        System.out.println("Asal        : " + asal);
        System.out.println("Asal Sekolah: " + asalskl);
        System.out.println("Umur        : " + umur);
        System.out.println("Prodi       : " + prodi);
        System.out.println();
    }

    public static void main(String[] args) {
        char lanjut ='Y';
        String inputnama, inputasal, inputasalskl, inputprodi;
        int inputumur;

        while (lanjut == 'Y') {
            Scanner a = new Scanner(System.in);
            try {
                System.out.println("PENDAFTARAN MAHASISWA BARU IT TELKOM PURWOKERTO");
                System.out.println();
                System.out.println("Silahkan isi data diri anda");
                System.out.print("Nama\t: ");
                inputnama = a.nextLine();
                System.out.print("Asal\t: ");
                inputasal = a.nextLine();
                System.out.print("Asal Sekolah\t: ");
                inputasalskl = a.nextLine();
                System.out.print("Umur\t: ");
                inputumur = a.nextInt();
                System.out.print("Prodi\t: ");
                inputprodi = a.next();

                registrasi demoConstructor = new registrasi (inputnama, inputumur, inputasal, inputasalskl, inputprodi);
                demoConstructor.printData();
            }catch (NumberFormatException nfe){
                System.err.println("Kesalahan Input");
            }
            System.out.println("Anda Ingin Melakukan Pendaftaran Lagi ?(y/t)");
            String string = No2.baca();
            lanjut = string.charAt(0);
            if (lanjut == 'Y') lanjut = 'Y';
            if (lanjut == 'y') continue;
            else{
                System.out.println("Matur Suwun");
                break;
            }

        }
    }
}


