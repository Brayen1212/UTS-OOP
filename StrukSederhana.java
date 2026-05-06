public class StrukSederhana extends SubTotal {

    public StrukSederhana(String nama, int harga, int persenDiskon) {
        super(nama, harga, persenDiskon);
    }

    @Override
    public void getInfo() {
        System.out.println("========================================");
        System.out.println("         STRUK BELANJA MINIMARKET       ");
        System.out.println("========================================");
        System.out.println("Nama Barang      : " + nama);
        System.out.println("Harga Barang     : Rp " + harga);
        System.out.println("Potongan Harga   : Rp " + potonganHarga);
        System.out.println("Potongan Pajak   : Rp " + potonganPajak);
        System.out.println("----------------------------------------");
        System.out.println("Total Belanja    : Rp " + totalBelanja);
        System.out.println("========================================");
    }
}