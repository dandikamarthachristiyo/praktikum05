package praktikum05;
import java.util.Scanner;

public class PemilihanBilangan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hasil;
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        
        System.out.println(hasil);

        sc.close();
    }
}
