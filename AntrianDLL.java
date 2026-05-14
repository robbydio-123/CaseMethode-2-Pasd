class AntrianDLL {
    Pembeli head, tail;
    int nomor = 1;

    public void tambahAntrian(String nama, String noHp) {
        Pembeli baru = new Pembeli(nomor++, nama, noHp);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Antrian berhasil ditambahkan!");
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pembeli temp = head;
        System.out.println("=== DAFTAR ANTRIAN ===");
        while (temp != null) {
            System.out.println("No: " + temp.noAntrian +
                    " | Nama: " + temp.nama +
                    " | HP: " + temp.noHp);
            temp = temp.next;
        }
    }

    public Pembeli hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli keluar = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Memanggil antrian no: " + keluar.noAntrian);
        return keluar;
    }
}