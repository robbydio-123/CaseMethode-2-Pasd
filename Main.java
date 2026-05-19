// Import library Scanner untuk membaca input dari user
import java.util.Scanner;

// Kelas Main - Kelas utama yang menjalankan program sistem antrian pesanan
public class Main {
    // Method main - Titik awal program yang akan dijalankan pertama kali
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);

        // Membuat objek AntrianDLL untuk mengelola antrian pembeli
        AntrianDLL antrian = new AntrianDLL();
        // Membuat objek PesananDLL untuk mengelola pesanan
        PesananDLL pesanan = new PesananDLL();

        // Deklarasi variabel pilih untuk menyimpan pilihan menu dari user
        int pilih;

        // Loop do-while untuk menampilkan menu berulang kali hingga user memilih 0 (Keluar)
        do {
            // Tampilkan header menu
            System.out.println("\n=== MENU ===");
            // Tampilkan pilihan menu 1 untuk menambah antrian
            System.out.println("1. Tambah Antrian");
            // Tampilkan pilihan menu 2 untuk mencetak/menampilkan antrian
            System.out.println("2. Cetak Antrian");
            // Tampilkan pilihan menu 3 untuk mencetak antrean terbalik
            System.out.println("3. Cetak Antrean Terbalik");
            // Tampilkan pilihan menu 4 untuk hapus antrian dan tambah pesanan
            System.out.println("4. Hapus Antrian + Pesan");
            // Tampilkan pilihan menu 5 untuk menampilkan laporan pesanan
            System.out.println("5. Laporan Pesanan");
            // Tampilkan pilihan menu 0 untuk keluar dari program
            System.out.println("0. Keluar");
            // Tampilkan prompt untuk user memilih menu
            System.out.print("Pilih: ");
            // Membaca input integer dari user dan simpan ke variabel pilih
            pilih = sc.nextInt();
            // Membaca karakter newline yang tertinggal setelah nextInt() untuk mencegah masalah input berikutnya
            sc.nextLine();

            // Struktur switch-case untuk menangani pilihan menu dari user
            switch (pilih) {
                // Jika user memilih 1 (Tambah Antrian)
                case 1:
                    // Tampilkan prompt untuk input nama pembeli
                    System.out.print("Nama: ");
                    // Membaca nama pembeli dari input user
                    String nama = sc.nextLine();
                    // Tampilkan prompt untuk input nomor HP pembeli
                    System.out.print("No HP: ");
                    // Membaca nomor HP pembeli dari input user
                    String hp = sc.nextLine();
                    // Panggil method tambahAntrian untuk menambah pembeli baru ke antrian
                    antrian.tambahAntrian(nama, hp);
                    // Keluar dari case ini dan lanjut ke loop berikutnya
                    break;

                // Jika user memilih 2 (Cetak Antrian)
                case 2:
                    // Panggil method cetakAntrian untuk menampilkan semua pembeli dalam antrian
                    antrian.cetakAntrian();
                    // Keluar dari case ini dan lanjut ke loop berikutnya
                    break;

                // Jika user memilih 3 (Cetak Antrean Terbalik)
                case 3:
                    // Panggil method cetakTerbalik untuk menampilkan daftar pembeli dari tail ke head
                    antrian.cetakTerbalik();
                    // Keluar dari case ini dan lanjut ke loop berikutnya
                    break;

                // Jika user memilih 4 (Hapus Antrian + Pesan)
                case 4:
                    // Panggil method hapusAntrian untuk menghapus pembeli pertama dan simpan ke variabel p
                    Pembeli p = antrian.hapusAntrian();
                    // Jika p tidak null (ada pembeli yang dihapus), lanjutkan untuk input pesanan
                    if (p != null) {
                        // Tampilkan pesan untuk input pesanan pembeli yang baru saja dihapus dari antrian
                        System.out.println("Input Pesanan untuk " + p.nama);
                        // Tampilkan prompt untuk input kode pesanan
                        System.out.print("Kode: ");
                        // Membaca kode pesanan dari input user sebagai integer
                        int kode = sc.nextInt();
                        // Membaca karakter newline yang tertinggal setelah nextInt()
                        sc.nextLine();
                        // Tampilkan prompt untuk input nama pesanan
                        System.out.print("Nama Pesanan: ");
                        // Membaca nama pesanan dari input user
                        String np = sc.nextLine();
                        // Tampilkan prompt untuk input harga pesanan
                        System.out.print("Harga: ");
                        // Membaca harga pesanan dari input user sebagai integer
                        int harga = sc.nextInt();

                        // Panggil method tambahPesanan untuk menambahkan pesanan baru ke dalam list pesanan
                        pesanan.tambahPesanan(kode, np, harga);
                    }
                    // Keluar dari case ini dan lanjut ke loop berikutnya
                    break;

                // Jika user memilih 5 (Laporan Pesanan)
                case 5:
                    // Panggil method tampilPesanan untuk menampilkan semua pesanan dan total pendapatan
                    pesanan.tampilPesanan();
                    // Keluar dari case ini dan lanjut ke loop berikutnya
                    break;
            }

        // Kondisi do-while: loop akan terus berjalan selama pilih tidak sama dengan 0
        } while (pilih != 0);
    }
}