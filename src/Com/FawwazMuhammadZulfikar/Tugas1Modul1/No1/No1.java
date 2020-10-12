package Com.FawwazMuhammadZulfikar.Tugas1Modul1.No1;

import java.util.Scanner;

public class No1 {
    static int a, b;
    static double celcius, fahrenheit, kelvin, reamur;

    static class celcius {
        public void konversi() {
            celcius = b;
            fahrenheit = b * 1.8 + 32;
            kelvin = b + 273;
            reamur = b * 0.8;
        }

        public void cetak() {
            System.out.println("Celcius     : " + celcius);
            System.out.println("Fahrenheit  : " + fahrenheit);
            System.out.println("Kelvin      : " + kelvin);
            System.out.println("Reamur      : " + reamur);
        }
    }

    static class fahrenheit {
        public void konversi() {
            celcius = 0.56 * (b - 32);
            fahrenheit = b;
            kelvin = celcius + 273;
            reamur = 0.44 * (b - 32);
        }

        public void cetak() {
            System.out.println("Celcius     : " + celcius);
            System.out.println("Fahrenheit  : " + fahrenheit);
            System.out.println("Kelvin      : " + kelvin);
            System.out.println("Reamur      : " + reamur);
        }
    }

    static class kelvin {
        public void konversi() {
            celcius = b - 273;
            fahrenheit = 1.8 * celcius + 32;
            kelvin = b;
            reamur = 0.8 * celcius;
        }

        public void cetak() {
            System.out.println("Celcius     : " + celcius);
            System.out.println("Fahrenheit  : " + fahrenheit);
            System.out.println("Kelvin      : " + kelvin);
            System.out.println("Reamur      : " + reamur);
        }
    }

    static class reamur {
        public void konversi() {
            celcius = 1.25 * b;
            fahrenheit = 2.25 * b + 32;
            kelvin = celcius + 273;
            reamur = b;
        }

        public void cetak() {
            System.out.println("Celcius     : " + celcius);
            System.out.println("Fareinheit  : " + fahrenheit);
            System.out.println("Kelvin      : " + kelvin);
            System.out.println("Reamur      : " + reamur);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih suhu dari");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
        System.out.print("Masukkan Pilihan : ");
        a = scanner.nextInt();
        System.out.print("Masukkan suhu    : ");
        b = scanner.nextInt();
        switch (a) {
            case 1:
                celcius c = new celcius();
                c.konversi();
                c.cetak();
                break;
            case 2:
                fahrenheit f = new fahrenheit();
                f.konversi();
                f.cetak();
                break;
            case 3:
                kelvin k = new kelvin();
                k.konversi();
                k.cetak();
                break;
            case 4:
                reamur r = new reamur();
                r.konversi();
                r.cetak();
                break;
        }
    }
}
