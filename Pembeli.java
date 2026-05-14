class Pembeli {
    int noAntrian;
    String nama;
    String noHp;

    Pembeli prev, next;

    public Pembeli(int noAntrian, String nama, String noHp) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.noHp = noHp;
    }
}