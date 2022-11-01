package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
 
        User objekhitung = new User();

        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu and User must be Register First
        System.out.print("Selamat Datang di Restoran EAD ");
        System.out.print("Silahkan Register Terlebih Dahulu");
        System.out.print("=====================");

        // TODO Create User from register in Main Menu
        System.out.print("NamaPendek_Kelas   : ");
        String namanim = userInput.nextLine();
    
        System.out.print("No.Handphone   : ");
        String nohp = userInput.nextLine();

        // TODO Display Menu
        System.out.print("Register Success ");
        System.out.print("Name: "+namanim);
        System.out.print("Phone Number: "+nohp);

       
        }


    }

