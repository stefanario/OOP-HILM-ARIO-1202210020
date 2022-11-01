package MODUL1;

import java.util.List;
import java.util.ArrayList;


public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    String[] menus = {"Menu", "Pilih Menu", "Keluar"};

    // TODO Create Method to Insert Menu to Database
    public double InsertMenu(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Pilihan   : ");
        Double pilih = userInput.nextDouble();
    }

    // TODO Create Method to Show Menu from Database
    public double ShowMenu(){
        Double ShowMenu;
        System.out.print("Menu");
        System.out.print("====================");
        System.out.print("1. Bakso (Makanan) Rp. 10000");
        System.out.print("2. Es Teh (Minuman) Rp. 5000");
        System.out.print("3. Brownies (Dessert) Rp. 15000");
    }

    // TODO Create Method to Search Menu from Database
    public double SearchMenu(){

    }

}
