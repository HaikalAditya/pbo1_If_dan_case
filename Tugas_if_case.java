import java.util.Scanner;

public class Tugas_if_case{
    public static void main(String[] args){
        String username, password, inputPassword, inputUsername, lanjut;
        username = "admin";
        password = "admin";

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        inputUsername = sc.nextLine();

        System.out.print("Masukkan password: ");
        inputPassword = sc.nextLine();

         if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password salah !!!");
            return;
        }

        int pilihan, saldo, tarik;
        saldo = 100000;
        do{
        Scanner next = new Scanner(System.in);
        
        System.out.println("\n");
        System.out.println("ATM CBA");
        System.out.println("-------");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu (1/2/3): ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\n");
                System.out.println("Menu 1");
                System.out.println("Saldo Anda : " + saldo);
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                System.out.print("Input Tarik Tunai : ");
                tarik = sc.nextInt();
                saldo = saldo-tarik;
                System.out.println("Saldo Anda Sekarang : " + saldo);
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                System.out.println("Terimakasih Menggunakan ATM CBA");
                System.out.println("\n");
                System.exit(0);
            default:
                System.out.println("\n");
                System.out.println("Menu tidak valid.");
                System.out.println("\n");
        }
        System.out.print("Lanjut Transaksi Y/T : ");
        lanjut = next.nextLine().toUpperCase();
        } while (lanjut.equals("Y"));
    }
}