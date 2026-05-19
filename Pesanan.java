
// Kelas Pesanan - Merepresentasikan node dalam doubly linked list pesanan
public class Pesanan {
    // Deklarasi variabel untuk menyimpan kode pesanan
    int kodePesanan;
    // Deklarasi variabel untuk menyimpan nama pesanan
    String namaPesanan;
    // Deklarasi variabel untuk menyimpan harga pesanan
    int harga;

    // Deklarasi pointer prev untuk menunjuk ke node pesanan sebelumnya dalam doubly linked list
    Pesanan prev;
    // Deklarasi pointer next untuk menunjuk ke node pesanan berikutnya dalam doubly linked list
    Pesanan next;

    // Konstruktor Pesanan - Menginisialisasi objek pesanan dengan tiga parameter
    public Pesanan(int kode, String nama, int harga) {
        // Mengisi atribut kodePesanan dengan nilai parameter kode
        this.kodePesanan = kode;
        // Mengisi atribut namaPesanan dengan nilai parameter nama
        this.namaPesanan = nama;
        // Mengisi atribut harga dengan nilai parameter harga
        this.harga = harga;
    }
}