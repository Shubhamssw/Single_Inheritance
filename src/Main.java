class Animal {

    String name;


    public Animal(String name) {
        this.name = name;
    }


    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    @Override
    void sound() {
        System.out.println(getName() + " barks.");
    }


    public String getName() {
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Buddy");

        myAnimal.sound();
        myDog.sound();
    }
}
