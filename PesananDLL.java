class PesananDLL {
    Pesanan head, tail;

    public void tambahPesanan(int kode, String nama, int harga) {
        Pesanan baru = new Pesanan(kode, nama, harga);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    // SORTING MANUAL (Bubble Sort by namaPesanan)
    public void sortPesanan() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Pesanan temp = head;

            while (temp.next != null) {
                if (temp.namaPesanan.compareTo(temp.next.namaPesanan) > 0) {
                    // Tukar data
                    String nama = temp.namaPesanan;
                    int kode = temp.kodePesanan;
                    int harga = temp.harga;

                    temp.namaPesanan = temp.next.namaPesanan;
                    temp.kodePesanan = temp.next.kodePesanan;
                    temp.harga = temp.next.harga;

                    temp.next.namaPesanan = nama;
                    temp.next.kodePesanan = kode;
                    temp.next.harga = harga;

                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    public void tampilPesanan() {
        if (head == null) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortPesanan();

        int total = 0;
        Pesanan temp = head;

        System.out.println("=== LAPORAN PESANAN ===");
        while (temp != null) {
            System.out.println(temp.kodePesanan + " | " +
                    temp.namaPesanan + " | " + temp.harga);
            total += temp.harga;
            temp = temp.next;
        }

        System.out.println("Total Pendapatan: " + total);
    }
}