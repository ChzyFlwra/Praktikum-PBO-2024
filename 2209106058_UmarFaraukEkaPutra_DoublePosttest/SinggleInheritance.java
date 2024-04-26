abstract class Animal {
    final String kingdom = "Animalia"; // Final variable
    
    abstract void eat(); // Abstract method
    
    // Final method
    final void breathe() {
        System.out.println("Breathing...");
    }
}

// Concrete class - Dog
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}
