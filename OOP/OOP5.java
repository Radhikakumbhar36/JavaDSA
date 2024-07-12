package OOP;
public class OOP5 {
    public static void main(String[] args) {
        
        Son son = new Son(24);
        son.career("Doctor");
        son.Partner("Alice", 22);

        Daughter daughter = new Daughter(23);
        daughter.career("Coder");
        daughter.Partner("Bob", 25);

        Parent.print();
        son.normal();

       Engine car= new Car();

        car.acc();
        car.stop();
        car.start();

        Media car2=new Car();
        car2.stop();

    }
}

abstract class Parent {
    abstract void career(String name);
    abstract void Partner(String name, int age);
    
    int age;
    final int value;

    static void print() {
        System.out.println("Hello");
    }

    void normal() {
        System.out.println("This is the normal method");
    }

    public Parent(int age) {
        this.age = age;
        this.value = 345678;
    }
}

class Son extends Parent {
    public Son(int age) {
        super(age);
    }
    
    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void Partner(String name, int age) {
        System.out.println("I love " + name + ", they are " + age + " years old");
    }
} 

class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }
    
    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void Partner(String name, int age) {
        System.out.println("I love " + name + ", they are " + age + " years old");
    }
}

// For abstract classes, you cannot create objects and constructors.
// Abstract constructors are not allowed.
// Abstract methods need to be overridden.
// You can create static methods in abstract classes.
// We cannot have final abstract classes because final classes cannot be inherited.

// Interface contains abstract functions, it is like a class but not completely.
// By default, functions are public and abstract in interfaces, and variables are static.
// Variables declared in the interfaces are by default final; in abstract classes, they might be final and non-final.
// Using interfaces, you can achieve multiple inheritance.

interface Engine {
    static final int price = 7800;
    
    void start();
    void stop();
    void acc();
}

interface Brake {
    void brake();
}

interface Media {
    void start();
    void stop();    
}


class Car implements Brake, Engine,Media {
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }
    
    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }
    
    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }
    
    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }
}

// brake     Engine      media
//     \       / 
//         Car