import java.util.Scanner;

public class Login07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Dandika";
        String password = "0102";
        String usernameUser, passwordUser;

        System.out.print("Masukkan username : ");
        usernameUser = sc.nextLine();
        System.out.print("Masukkan password : ");
        passwordUser = sc.nextLine();

        if (usernameUser.equalsIgnoreCase(username) && passwordUser.equalsIgnoreCase(password)) {
            System.out.println("Login Berhasi;");
        } else {
            System.out.println("Login Gagal;");
        }
        sc.close();

    }
}
