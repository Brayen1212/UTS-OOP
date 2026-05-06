public class SubTotal extends Barang {
    protected int potonganHarga;
    protected int potonganPajak;
    protected int totalBelanja;

    public SubTotal(String nama, int harga, int persenDiskon) {
        super(nama, harga);
        this.potonganHarga = (int) (harga * persenDiskon / 100.0);
        this.potonganPajak = getPajak().getNilaiPajak();
        this.totalBelanja  = harga - potonganHarga + potonganPajak;
    }

    public void getInfo() {
        System.out.println("=== Sub Total ===");
        System.out.println("Harga Barang     : Rp " + harga);
        System.out.println("Potongan Harga   : Rp " + potonganHarga);
        System.out.println("Potongan Pajak   : Rp " + potonganPajak);
        System.out.println("Total Belanja    : Rp " + totalBelanja);
    }
}