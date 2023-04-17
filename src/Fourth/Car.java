package Fourth;

public class Car {
    int year;
    String maker;
    double speed;

    public Car(int year, String maker, double speed) {
        this.year = year;
        this.maker = maker;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public String getMaker() {
        return maker;
    }

    public double getSpeed() {
        return speed;
    }
}

class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car(2015, "Honda", 85.0);

        System.out.println("Car details:");
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Maker: " + myCar.getMaker());
        System.out.println("Maximum Speed: " + myCar.getSpeed() + " mph");
    }
}
