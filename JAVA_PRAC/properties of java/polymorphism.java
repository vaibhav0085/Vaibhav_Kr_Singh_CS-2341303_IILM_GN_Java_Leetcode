class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a cirle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();

        for (Shape s : shapes) {
            s.draw();   
        }
    }
}