public class Calculation implements Runnable {

    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public void setSquare(double side) {
        if(side < 1) {
            throw new IllegalArgumentException();
        }
        else {
            this.side = side;
            this.area = side*side;
        }
    }

    public double getSquare(){
        return area;
    }

    public void setCircle(double radius, double phi) {
        if(radius < 1) {
            throw new IllegalArgumentException();
        }
        else {
            this.radius = radius;
            this.area = phi*radius*radius;
        }
    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        if(a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException();
        }
        else {
            this.area = (a+b) * t / 2;
        }
    }

    public double getTrapezoid(){
        return area;
    }


    @Override
    public void run() {
        System.out.println("Program Will Start In");
        while (true) {
            for (int i = 3; i > 0; i--){
                System.out.println(i);
                try {
                    System.out.println("Starting with thread" + i);
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    
}}


