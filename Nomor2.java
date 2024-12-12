import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        String buku [] = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int harga [] = {350000, 450000, 500000, 95000};
        ArrayList<Integer> belanja = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        char lagi;

        do {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < buku.length; i++) {
                System.out.println((i + 1) + ". " + buku[i] + " - " + harga[i]);
            }

            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihan = scanner.nextInt();
            belanja.add(harga[pilihan - 1]);

            System.out.print("Input lagi (Y/N)?: ");
            lagi = scanner.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        int[] totalHarga = new int[1];
        int[] voucher = new int[1];

        hitungTotalHarga(belanja, totalHarga);
        hitungVoucher(totalHarga[0], voucher);

        System.out.println("Total voucher belanja = " + voucher[0]);
        System.out.println("Total yang harus dibayar = " + totalHarga[0]);
    }

    public static void hitungTotalHarga(ArrayList<Integer> belanja, int[] totalHarga) {
        totalHarga[0] = 0;
        for (int harga : belanja) {
            totalHarga[0] += harga;
        }
    }

    public static void hitungVoucher(int totalHarga, int[] voucher) {
        if (totalHarga < 200000) {
            voucher[0] = 0;
        } else if (totalHarga <= 500000) {
            voucher[0] = 50000;
        } else if (totalHarga <= 750000) {
            voucher[0] = 100000;
        } else if (totalHarga <= 1000000) {
            voucher[0] = 150000;
        } else {
            voucher[0] = 200000;
        }
    }
}

