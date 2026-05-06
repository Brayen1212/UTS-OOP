public class Diskon {
    private int harga;
    private String potonganHarga; // Asosiasi ke Barang (menerima harga dari Barang)

    public Diskon(Barang barang, int persenDiskon) {
        this.harga = barang.harga;
        int nilaiDiskon = (int) (this.harga * persenDiskon / 100.0);
        this.potonganHarga = "Diskon " + persenDiskon + "% = Rp " + nilaiDiskon;
    }

    public void getHarga() {
        System.out.println("Harga Asli : Rp " + harga);
    }

    public void getInfo() {
        System.out.println("Diskon : " + potonganHarga);
    }

    public int getNilaiDiskon(int persenDiskon) {
        return (int) (harga * persenDiskon / 100.0);
    }
}