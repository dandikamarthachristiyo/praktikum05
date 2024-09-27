import java.util.Scanner;

public class TukangParkir07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String jenisKendaraan;
        double jam;
        double biayaParkirMobil = 5000;
        double biayaParkirMotor = 3000;
        double totalBiayaParkir = 0;

        System.out.print("Masukkan jenis kendaraan : ");
        jenisKendaraan = sc.nextLine();
        System.out.print("Masukkan berapa lama waktu parkir(jam) : ");
        jam = sc.nextDouble();

        switch (jenisKendaraan.toLowerCase()) {
            case "motor":
                totalBiayaParkir = (biayaParkirMotor * jam);
                break;
            case "mobil":
                totalBiayaParkir = (biayaParkirMobil * jam);
                break;
            default:
                System.out.println("Jenis Kendaraan tidak valid");
                break;
        }
        System.out.println("Total biaya parkir yang harus di bayar : " + totalBiayaParkir);
        sc.close();

    }
}
