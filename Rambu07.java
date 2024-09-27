import java.util.Scanner;

public class Rambu07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String warnaLampu, artiLampu;

        System.out.print("Input warna lampu : ");
        warnaLampu = sc.nextLine();


        switch (warnaLampu.toLowerCase()) {
            case "merah":
                artiLampu = "berhenti";               
                break;
            case "kuning":
                artiLampu = "hati-hati";
            case "hijau":
                artiLampu = "jalan";
                break;        
            default:
                artiLampu = "warna tidak valid";
                break;
        }
        System.out.println(warnaLampu + " artinya " + artiLampu);

        sc.close();

    }
}
