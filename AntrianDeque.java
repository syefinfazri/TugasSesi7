import java.util.ArrayDeque;
import java.util.Scanner;

public class AntrianDeque {
    static ArrayDeque<String> queue = new ArrayDeque<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    queue.add(nama);
                    System.out.println("Antrian ditambahkan");
                    break;

                case 2:
                    if (queue.isEmpty())
                        System.out.println("Antrian kosong");
                    else
                        System.out.println("Dilayani: " + queue.poll());
                    break;

                case 3:
                    System.out.println("Daftar Antrian: " + queue);
                    break;

                case 4:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 4);
    }
}
