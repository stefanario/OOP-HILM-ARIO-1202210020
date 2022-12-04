public class App {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Samsung",2,1.80f);
        perangkat.informasi();

        System.out.println("");

        Laptop lap = new Laptop("Seagate",8,2.40f,true);

        lap.informasi();
        lap.setNamaGame("Dota 2");
        lap.bukaGame(lap.getNamaGame());

        lap.setEmail("stefanario@gmail.com");
        lap.kirimEmail(lap.getEmail());

        lap.setEmail1("stefanusario@gmail.com");
        lap.setEmail2("stefario@yahoo.com");
        lap.kirimEmail(lap.getEmail1(),lap.getEmail2());

        System.out.println("");

        Handphone hand = new Handphone("Sandisk",3,2.0f, false);
        hand.informasi();
        hand.telfon(628122122);
        hand.kirimSMS(62852112);
        hand.kirimSMS(628121212, 629292211);
    }
}