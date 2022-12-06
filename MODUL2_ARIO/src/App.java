public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiair = new TransportasiAir(4,20000);
        transportasiair.informasi();

        System.out.println("");

        Kapal kapal = new Kapal(50,100000);
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
   
        System.out.println("");

        Sampan sampan = new Sampan(20,50000);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlayar();
        sampan.berlabuh();
    }
}
