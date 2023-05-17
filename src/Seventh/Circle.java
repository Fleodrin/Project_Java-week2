package Seventh;

public class Circle implements Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("The area of the Circle is " + Math.PI * Math.pow(radius, 2));
    }
}
