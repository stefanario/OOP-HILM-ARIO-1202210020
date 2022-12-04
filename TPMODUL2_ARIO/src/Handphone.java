public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        if(fingerprint == true){
            System.out.println("\n------------------------HANDPHONE------------------------");
            System.out.println("Handphone ini memiliki Drive tipe " + drive + " dengan RAM sebesar " + ram + " GB" + " dan processor " + "secepat " + processor + " Ghz");
            System.out.println("*selain itu juga laptop ini memiliki Fingerprint\n");
        }
        else {
            System.out.println("\n------------------------HANDPHONE------------------------");
            System.out.println("Handphone ini  memiliki Drive tipe " + drive + " dengan RAM sebesar " + ram + " GB" + " dan processor " + "secepat " + processor + " Ghz");
            System.out.println("*selain itu juga laptop ini tidak memiliki Fingerprint\n");
        }
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan Telfon ke Nomer " + no_hp );
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke Nomer " + no_hp );
    }
    public void kirimSMS(int no_hp1,int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke Nomer " + no_hp1 + " dan ke Nomer " + no_hp2 + "\n");
    }

}