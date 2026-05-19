
// Kelas AntrianDLL - Mengelola antrian pembeli menggunakan struktur Doubly Linked List
public class AntrianDLL {
    // Deklarasi pointer head untuk menunjuk ke node pertama dalam antrian
    Pembeli head;
    // Deklarasi pointer tail untuk menunjuk ke node terakhir dalam antrian
    Pembeli tail;
    // Deklarasi variabel nomor untuk menghitung dan menyimpan nomor antrian yang akan diberikan
    int nomor = 1;

    // Method tambahAntrian - Menambahkan pembeli baru ke dalam antrian
    // Parameter nama: nama pembeli yang akan ditambahkan
    // Parameter noHp: nomor HP pembeli yang akan ditambahkan
    public void tambahAntrian(String nama, String noHp) {
        // Membuat objek Pembeli baru dengan nomor otomatis (nomor++), nama, dan noHp
        Pembeli baru = new Pembeli(nomor++, nama, noHp);

        // Jika head kosong (antrian belum ada pembeli), maka head dan tail menunjuk ke pembeli baru
        if (head == null) {
            head = tail = baru;
        } 
        // Jika head tidak kosong, tambahkan pembeli baru di akhir antrian
        else {
            // Menghubungkan pointer next dari tail lama ke pembeli baru
            tail.next = baru;
            // Menghubungkan pointer prev dari pembeli baru ke tail lama
            baru.prev = tail;
            // Update tail untuk menunjuk ke pembeli baru yang menjadi akhir antrian
            tail = baru;
        }

        // Tampilkan pesan bahwa pembeli berhasil ditambahkan ke antrian
        System.out.println("Antrian berhasil ditambahkan!");
    }

    // Method cetakAntrian - Menampilkan semua pembeli yang ada dalam antrian
    public void cetakAntrian() {
        // Jika head kosong, berarti antrian tidak ada pembeli, tampilkan pesan antrian kosong
        if (head == null) {
            System.out.println("Antrian kosong!");
            // Keluar dari method tanpa melanjutkan kode berikutnya
            return;
        }

        // Deklarasi variabel temp untuk menyimpan referensi node saat ini saat traversal
        Pembeli temp = head;
        // Tampilkan header daftar antrian
        System.out.println("=== DAFTAR ANTRIAN ===");
        // Loop untuk traversal seluruh isi antrian dari head hingga tail
        while (temp != null) {
            // Tampilkan informasi pembeli: nomor antrian, nama, dan nomor HP
            System.out.println("No: " + temp.noAntrian +
                    " | Nama: " + temp.nama +
                    " | HP: " + temp.noHp);
            // Pindah ke node berikutnya dalam antrian
            temp = temp.next;
        }
    }

    // Method cetakTerbalik - Menampilkan daftar pembeli dari tail ke head menggunakan pointer prev
    public void cetakTerbalik() {
        // Jika tail kosong, berarti antrian tidak ada pembeli, tampilkan pesan antrian kosong
        if (tail == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        // Deklarasi variabel temp untuk menyimpan referensi node saat ini saat traversal terbalik
        Pembeli temp = tail;
        // Tampilkan header daftar antrian terbalik
        System.out.println("=== DAFTAR ANTRIAN TERBALIK ===");
        // Loop untuk traversal seluruh isi antrian dari tail hingga head
        while (temp != null) {
            // Tampilkan informasi pembeli: nomor antrian, nama, dan nomor HP
            System.out.println("No: " + temp.noAntrian +
                    " | Nama: " + temp.nama +
                    " | HP: " + temp.noHp);
            // Pindah ke node sebelumnya dalam antrian
            temp = temp.prev;
        }
    }

    // Method hapusAntrian - Menghapus pembeli pertama (head) dari antrian dan return objeknya
    public Pembeli hapusAntrian() {
        // Jika head kosong, berarti tidak ada pembeli di antrian yang bisa dihapus
        if (head == null) {
            System.out.println("Antrian kosong!");
            // Return null karena tidak ada pembeli yang dihapus
            return null;
        }

        // Simpan referensi head saat ini ke variabel keluar untuk dikembalikan
        Pembeli keluar = head;

        // Jika head dan tail menunjuk ke node yang sama (hanya ada 1 pembeli di antrian)
        if (head == tail) {
            // Set head dan tail menjadi null karena antrian menjadi kosong
            head = tail = null;
        } 
        // Jika ada lebih dari 1 pembeli di antrian
        else {
            // Update head untuk menunjuk ke node berikutnya (node kedua menjadi head baru)
            head = head.next;
            // Update pointer prev dari head baru menjadi null (head tidak memiliki node sebelumnya)
            head.prev = null;
        }

        // Tampilkan pesan pembeli yang dipanggil dengan nomor antriannya
        System.out.println("Memanggil antrian no: " + keluar.noAntrian);
        // Return objek pembeli yang dihapus dari antrian
        return keluar;
    }
}