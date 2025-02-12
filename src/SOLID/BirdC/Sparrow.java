package SOLID.BirdB;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making sound");
    }

    @Override
    public void fly() {
        System.out.println("Fly Low");
    }
}
