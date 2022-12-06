public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, String biaya, String mesin) {
        super(mesin,biaya);
        this.jumlahKursi=jumlahKursi;
        
    }

    @Override
    public void informasi() {
        if(mesin == "kapal"){
            System.out.println("\n------------------------KAPAL------------------------");
            System.out.println("Transportasi Air Jenis Kapal dengan kursi berjumlah " + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " + biaya );
        }
        else {
            System.out.println("\n------------------------KAPAL------------------------");
            System.out.println("Transportasi Air Jenis Kapal dengan kursi berjumlah " + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " + biaya );
        }
    }

    public void berlayar(){
        System.out.println("Transportasi Air Jenis Kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air Jenis Kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan stabil di kisaran" + kecepatan);
    }
    public void berlabuh(){
        System.out.println("Transportasi Air Jenis Kapal berlabuh di pantai ");
    }

}