import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
        public static void main(String[] args) throws Exception {
            Calculation calc = new Calculation();
            Scanner scanner = new Scanner(System.in);
            boolean repeat = true;
            do {
                try {
                    System.out.println("Menu Program");
                    System.out.println("1. Square");
                    System.out.println("2. Circle");
                    System.out.println("3. Trapezoid");
                    
                    System.out.println("Select Menu :");
                    int pilih = scanner.nextInt();
                    switch(pilih) {
                        case 1:
                        System.out.println("Enter the length: ");
                        double side = scanner.nextDouble();

                        calc.setSquare(side);
                        System.out.println("The calculation result: " + calc.getSquare());
                        break;

                        case 2:
                        System.out.println("Enter the length: ");
                        double radius = scanner.nextDouble();

                        calc.setCircle(radius,side);
                        System.out.println("The calculation result: " + calc.getCircle());
                        break;

                        case 3:
                        System.out.println("Enter the length: ");
                        double a = scanner.nextDouble();

                        System.out.println("Enter the length: ");
                        double b = scanner.nextDouble();

                        System.out.println("Enter the length: ");
                        double t = scanner.nextDouble();
                        
                        calc.setTrapezoid(a,b,t);
                        System.out.println("The calculation result: " + calc.getTrapezoid());
                        break;

                        case 0:
                        System.out.println("Program End");
                        default:
                        System.out.println("Option not Available");
                        continue;
                    }
                    repeat = false;
                    }
                    catch(InputMismatchException e){
                        System.out.println("Must be number");
                    }
                    catch(IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    
                }while(repeat);
                }
            }
    

