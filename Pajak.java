public class Pajak {
    protected String potonganPajak;
    protected int harga;
    protected double persenPajak;

    // Konstruktor dengan persen pajak custom
    public Pajak(int harga, double persenPajak) {
        this.harga = harga;
        this.persenPajak = persenPajak;
        int nilaiPajak = getNilaiPajak();
        this.potonganPajak = "Pajak " + persenPajak + "% = Rp " + nilaiPajak;
    }

    // Konstruktor default PPN 11% (agar tidak perlu ubah kelas lain)
    public Pajak(int harga) {
        this(harga, 11.0);
    }

    public void setPersenPajak(double persenPajak) {
        this.persenPajak = persenPajak;
        int nilaiPajak = getNilaiPajak();
        this.potonganPajak = "Pajak " + persenPajak + "% = Rp " + nilaiPajak;
    }

    public double getPersenPajak() {
        return persenPajak;
    }

    public void getInfo() {
        System.out.println("Pajak : " + potonganPajak);
    }

    public int getNilaiPajak() {
        return (int) (harga * persenPajak / 100.0);
    }
}