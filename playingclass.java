package pemlan2;

import java.util.*;

public class playingclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pantheratigris tiger1 = new pantheratigris();
        System.out.println("======================" + "\nVet v2.0" + "\nby Samuel Nathanael Sitompul"
                + "\n======================");
        System.out.print("\nApakah ID harimau anda? ");
        tiger1.id = input.nextLine();
        System.out.print("Siapakah nama harimau anda? ");
        tiger1.name = input.nextLine();
        System.out.print("Tahun berapa ia dilahirkan? ");
        tiger1.yearOfBirth = input.nextInt();

        System.out.println("Selamat datang " + tiger1.name + " di Vet v2.0." + "\nTahun ini " + tiger1.name
                + " telah berumur " + tiger1.age() + " tahun.");
        System.out.print("Ingin mengaum (Ya/Tidak)? ");
        input.nextLine();
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("Ya")) {
            tiger1.roar();
        } else {
            System.out.println("Baik, tidak apa. Mungkin lain kali.");
        }
        System.out.println("\nTerima kasih telah menggunakan sistem ini. ");

    }
}
