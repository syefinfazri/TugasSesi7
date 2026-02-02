import java.util.ArrayDeque;
import java.util.Scanner;

public class AntrianBank {
    static ArrayDeque<String> antrian = new ArrayDeque<>();
    static Scanner sc = new Scanner(System.in);
    static int nomor = 1;
    static int totalDilayani = 0;

    static String generateTiket() {
        return String.format("A%03d", nomor++);
    }

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== ANTRIAN LOKET BANK ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Nasabah");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Total Dilayani");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    String tiket = generateTiket();
                    antrian.add(tiket);
                    System.out.println("Nomor tiket: " + tiket);
                    break;

                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada antrian");
                    } else {
                        System.out.println("Dilayani: " + antrian.poll());
                        totalDilayani++;
                    }
                    break;

                case 3:
                    System.out.println("Antrian saat ini: " + antrian);
                    break;

                case 4:
                    System.out.println("Total nasabah dilayani: " + totalDilayani);
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan salah");
            }
        } while (pilih != 5);
    }
}
