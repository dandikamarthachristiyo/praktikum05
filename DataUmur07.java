import java.util.Scanner;

public class DataUmur07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usia;

        System.out.print("Masukkan usia : ");
        usia = sc.nextInt();

        if ((usia > 0) && (usia <= 12)) {
            System.out.println("Kategori usia Anak-anak");
        } else if ((usia > 12 ) && (usia <= 19)) {
            System.out.println("Kategori usia Remaja");
        } else if ((usia > 19 ) && (usia <= 64)) {
            System.out.println("Kategori usia Dewasa");
        } else if (usia > 64 ) {
            System.out.println("Kategori usia Lansia");
        } else {
            System.out.println("Data tidak valid");
        }
        sc.close();

    }
}
