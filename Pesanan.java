public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    Pesanan prev, next;

    public Pesanan(int kode, String nama, int harga) {
        this.kodePesanan = kode;
        this.namaPesanan = nama;
        this.harga = harga;
    }
} 