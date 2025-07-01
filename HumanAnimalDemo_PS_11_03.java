/*
Question:
Create a class Monkey with jump() and bite() methods.
Create a class Human which inherits this Monkey class and implements BasicAnimal interface 
with eat() and sleep() methods.

Also demonstrate usage with appropriate output.

Expected Output:
Monkey is jumping!
Monkey bites!
Human is eating.
Human is sleeping.
*/

// Monkey class
class Monkey {
    void jump() {
        System.out.println("Monkey is jumping!");
    }

    void bite() {
        System.out.println("Monkey bites!");
    }
}

// BasicAnimal interface
interface BasicAnimal {
    void eat();
    void sleep();
}

// Human class that extends Monkey and implements BasicAnimal
class Human extends Monkey implements BasicAnimal {

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

// Main class to test
public class HumanAnimalDemo {
    public static void main(String[] args) {
        Human h = new Human();

        h.jump();     // From Monkey
        h.bite();     // From Monkey
        h.eat();      // From BasicAnimal
        h.sleep();    // From BasicAnimal
    }
}

/*
Output:
Monkey is jumping!
Monkey bites!
Human is eating.
Human is sleeping.
*/
