package SOLID.BirdB;

public class Pigeon extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Pigeon is making sound");
    }
    public void fly() {
        //code duplication
        System.out.println("Fly Low");
    }

}
