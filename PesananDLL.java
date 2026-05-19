// Kelas PesananDLL - Mengelola pesanan menggunakan struktur Doubly Linked List
public class PesananDLL {
    // Deklarasi pointer head untuk menunjuk ke node pesanan pertama
    Pesanan head;
    // Deklarasi pointer tail untuk menunjuk ke node pesanan terakhir
    Pesanan tail;

    // Method tambahPesanan - Menambahkan pesanan baru ke dalam linked list pesanan
    // Parameter kode: kode pesanan yang unik
    // Parameter nama: nama pesanan yang akan ditambahkan
    // Parameter harga: harga pesanan yang akan ditambahkan
    public void tambahPesanan(int kode, String nama, int harga) {
        // Membuat objek Pesanan baru dengan parameter kode, nama, dan harga
        Pesanan baru = new Pesanan(kode, nama, harga);

        // Jika head kosong (belum ada pesanan sama sekali), head dan tail menunjuk ke pesanan baru
        if (head == null) {
            head = tail = baru;
        } 
        // Jika sudah ada pesanan sebelumnya, tambahkan pesanan baru di akhir
        else {
            // Menghubungkan pointer next dari tail lama ke pesanan baru
            tail.next = baru;
            // Menghubungkan pointer prev dari pesanan baru ke tail lama
            baru.prev = tail;
            // Update tail untuk menunjuk ke pesanan baru yang menjadi akhir linked list
            tail = baru;
        }
    }

    // Method sortPesanan - Mengurutkan pesanan berdasarkan nama pesanan secara alfabetis menggunakan Bubble Sort
    public void sortPesanan() {
        // Jika head kosong (tidak ada pesanan), langsung keluar dari method
        if (head == null) return;

        // Deklarasi boolean swapped untuk mengecek apakah ada pertukaran data dalam satu iterasi
        boolean swapped;
        // Loop do-while untuk terus melakukan sorting selama ada pertukaran data
        do {
            // Inisialisasi swapped menjadi false di awal setiap iterasi
            swapped = false;
            // Deklarasi temp untuk melakukan traversal dari head
            Pesanan temp = head;

            // Loop while untuk membandingkan setiap elemen dengan elemen berikutnya
            while (temp.next != null) {
                // Membandingkan nama pesanan node saat ini dengan node berikutnya secara alfabetis
                // Jika lebih besar (urutannya salah), lakukan pertukaran data
                if (temp.namaPesanan.compareTo(temp.next.namaPesanan) > 0) {
                    // Simpan sementara nilai-nilai dari node saat ini ke variabel lokal
                    // Simpan nama pesanan node saat ini ke variabel nama
                    String nama = temp.namaPesanan;
                    // Simpan kode pesanan node saat ini ke variabel kode
                    int kode = temp.kodePesanan;
                    // Simpan harga pesanan node saat ini ke variabel harga
                    int harga = temp.harga;

                    // Tukar data: copy nilai dari node berikutnya ke node saat ini
                    // Copy nama pesanan dari node berikutnya ke node saat ini
                    temp.namaPesanan = temp.next.namaPesanan;
                    // Copy kode pesanan dari node berikutnya ke node saat ini
                    temp.kodePesanan = temp.next.kodePesanan;
                    // Copy harga pesanan dari node berikutnya ke node saat ini
                    temp.harga = temp.next.harga;

                    // Tukar data: copy nilai yang disimpan (dari node saat ini) ke node berikutnya
                    // Copy nama yang disimpan ke node berikutnya
                    temp.next.namaPesanan = nama;
                    // Copy kode yang disimpan ke node berikutnya
                    temp.next.kodePesanan = kode;
                    // Copy harga yang disimpan ke node berikutnya
                    temp.next.harga = harga;

                    // Set swapped menjadi true karena telah terjadi pertukaran data
                    swapped = true;
                }
                // Pindah ke node berikutnya untuk melakukan perbandingan dengan pasangan berikutnya
                temp = temp.next;
            }
        // Lanjutkan loop selama masih ada pertukaran data dalam iterasi sebelumnya
        } while (swapped);
    }

    // Method tampilPesanan - Menampilkan semua pesanan dan menghitung total pendapatan
    public void tampilPesanan() {
        // Jika head kosong (belum ada pesanan sama sekali), tampilkan pesan belum ada pesanan
        if (head == null) {
            System.out.println("Belum ada pesanan!");
            // Keluar dari method tanpa melanjutkan kode berikutnya
            return;
        }

        // Panggil method sortPesanan untuk mengurutkan pesanan berdasarkan nama sebelum ditampilkan
        sortPesanan();

        // Deklarasi variabel total untuk menyimpan total harga semua pesanan, inisialisasi dengan 0
        int total = 0;
        // Deklarasi temp untuk melakukan traversal dari head
        Pesanan temp = head;

        // Tampilkan header laporan pesanan
        System.out.println("=== LAPORAN PESANAN ===");
        // Loop while untuk traversal semua pesanan dari head hingga null
        while (temp != null) {
            // Tampilkan informasi pesanan: kode, nama, dan harga
            System.out.println(temp.kodePesanan + " | " +
                    temp.namaPesanan + " | " + temp.harga);
            // Tambahkan harga pesanan saat ini ke total
            total += temp.harga;
            // Pindah ke pesanan berikutnya dalam linked list
            temp = temp.next;
        }

        // Tampilkan total pendapatan dari semua pesanan
        System.out.println("Total Pendapatan: " + total);
    }
}