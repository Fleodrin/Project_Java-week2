package Seventh;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] myShape = new Shape[3];
        myShape[0] = new Triangle(3, 4);
        myShape[1] = new Rectangle(4, 4);
        myShape[2] = new Circle(5);
        for (int i = 0; i < 3; i++) {
            myShape[i].getArea();
        }
    }
}