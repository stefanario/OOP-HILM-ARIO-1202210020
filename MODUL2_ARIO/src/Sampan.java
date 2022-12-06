public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, String biaya, int layar) {
        super(jumlahKursi,layar);
        this.biaya=biaya;
    }

    @Override
    public void informasi() {
        if(layar == 2){
            System.out.println("\n------------------------SAMPAN------------------------");
            System.out.println("Transportasi Air Jenis Sampan dengan kursi berjumlah " + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " + biaya );}
        else {
            System.out.println("\n------------------------SAMPAN------------------------");
            System.out.println("Transportasi Air Jenis Sampan dengan kursi berjumlah " + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " + biaya );}
    }
    public void berlayar(){
        System.out.println("Transportasi Air Jenis Sampan sedang berlayar menggunakan " + layar + "layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air Jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air Jenis Sampan berlabuh di pantai menggunakan 2 jangkar"+"\n");
    }

}