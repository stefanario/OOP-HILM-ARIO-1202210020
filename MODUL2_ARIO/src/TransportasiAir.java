public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;


    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("\n\n------------------------Transportasi Air------------------------");
        System.out.println("Transportasi Air tidak diketahui dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp." + biaya);
    }
}