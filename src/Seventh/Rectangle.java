package Seventh;

public class Rectangle implements Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        System.out.println("The area of the Rectangle is " + 0.5 * width * height);
    }
}
