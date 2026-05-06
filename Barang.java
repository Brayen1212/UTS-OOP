public class Barang {
    protected int harga;
    protected String nama;
    private Pajak pajak; // Agregasi ke Pajak

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        this.pajak = new Pajak(harga);
    }

    public void getNama() {
        System.out.println("Nama Barang : " + nama);
    }

    public void getInfo() {
        System.out.println("=== Info Barang ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp " + harga);
        pajak.getInfo();
    }

    public Pajak getPajak() {
        return pajak;
    }
}