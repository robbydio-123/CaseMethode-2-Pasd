// Kelas Pembeli - Merepresentasikan node dalam doubly linked list antrian pembeli
public class Pembeli {
    // Deklarasi variabel untuk menyimpan nomor antrian pembeli
    int noAntrian;
    // Deklarasi variabel untuk menyimpan nama pembeli
    String nama;
    // Deklarasi variabel untuk menyimpan nomor HP pembeli
    String noHp;

    // Deklarasi pointer prev untuk menunjuk ke node sebelumnya dalam doubly linked list
    Pembeli prev;
    // Deklarasi pointer next untuk menunjuk ke node berikutnya dalam doubly linked list
    Pembeli next;

    // Konstruktor Pembeli - Menginisialisasi objek pembeli dengan tiga parameter
    public Pembeli(int noAntrian, String nama, String noHp) {
        // Mengisi atribut noAntrian dengan nilai parameter noAntrian
        this.noAntrian = noAntrian;
        // Mengisi atribut nama dengan nilai parameter nama
        this.nama = nama;
        // Mengisi atribut noHp dengan nilai parameter noHp
        this.noHp = noHp;
    }
}