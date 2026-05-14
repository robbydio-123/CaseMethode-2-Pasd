import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianDLL antrian = new AntrianDLL();
        PesananDLL pesanan = new PesananDLL();

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian + Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String hp = sc.nextLine();
                    antrian.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    Pembeli p = antrian.hapusAntrian();
                    if (p != null) {
                        System.out.println("Input Pesanan untuk " + p.nama);
                        System.out.print("Kode: ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String np = sc.nextLine();
                        System.out.print("Harga: ");
                        int harga = sc.nextInt();

                        pesanan.tambahPesanan(kode, np, harga);
                    }
                    break;

                case 4:
                    pesanan.tampilPesanan();
                    break;
            }

        } while (pilih != 0);
    }
}