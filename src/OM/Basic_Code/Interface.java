package OM.Basic_Code;

interface Animal {
    void sound();
    void type();

    static void info() {
        System.out.println("All animals have unique behaviors.");
    }
}

// Lion implements Animal
class Lion implements Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars!");
    }

    @Override
    public void type() {
        System.out.println("Lion is a wild animal.");
    }
}

// Cow implements Animal
class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos!");
    }

    @Override
    public void type() {
        System.out.println("Cow is a domestic animal.");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal cow = new Cow();

        lion.sound();  // Lion roars!
        lion.type();   // Lion is a wild animal.

        cow.sound();   // Cow moos!
        cow.type();    // Cow is a domestic animal.

        Animal.info(); // Static method from interface
    }
}
