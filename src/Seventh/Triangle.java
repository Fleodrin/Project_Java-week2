package Seventh;

public class Triangle implements Shape {
    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void getArea() {
        System.out.println("The area of the Triangle is " + 0.5 * base * height);
    }
}
