import java.util.Scanner;

public class PemilihanHarianDenganIf07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka :");
        int angka = sc.nextInt();

        if ((angka > 0) && (angka < 6))
        {
            System.out.println("Angka " + angka + " weekday ");
        }
        else if ((angka >= 6) && (angka < 8))
        {
            System.out.println("Angka " + angka + " weekend ");
        }
        else {
            System.out.println("Data tidak invalid");
        }

        sc.close();
    }
}