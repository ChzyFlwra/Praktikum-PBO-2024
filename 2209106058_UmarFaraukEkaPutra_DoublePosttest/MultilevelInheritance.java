// Abstract class 3 - Shape
abstract class Shape {
    final String color = "Red"; // Final variable
    
    abstract void draw(); // Abstract method
    
    // Final method
    final void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Concrete class 3a - Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Concrete class 3b - Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}
