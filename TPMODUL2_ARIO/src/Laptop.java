public class Laptop extends Perangkat{
    protected boolean webcam;
    protected String namaGame,email,email1,email2;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if(webcam == true){
            System.out.println("\n------------------------LAPTOP------------------------");
            System.out.println("Laptop ini memiliki Drive tipe " + drive + " dengan RAM sebesar " + ram + " GB"+" dan processor secepat " + processor + " Ghz");
            System.out.println("*selain itu juga laptop ini memiliki Webcam\n");
        }
        else {
            System.out.println("\n------------------------LAPTOP------------------------");
            System.out.println("Laptop ini memiliki Drive tipe " + drive + " dengan RAM sebesar " + ram + " GB"+" dan processor secepat " + processor + " Ghz");
            System.out.println("*selain itu juga laptop ini tidak memiliki Webcam\n");
        }
    }

    // METHOD SETTER
    public void setNamaGame(String n){
        this.namaGame = n;
    }
    public void setEmail(String n){
        this.email = n;
    }
    public void setEmail1(String n){
        this.email1 = n;
    }
    public void setEmail2(String n){
        this.email2 = n;
    }

    
    //METHOD GETTER
    public String getNamaGame(){
        return namaGame;
    }
    public String getEmail(){
        return email;
    }
    public String getEmail1(){
        return email1;
    }
    public String getEmail2(){
        return email2;
    }


    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }
    public void kirimEmail(String email1,String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }

}