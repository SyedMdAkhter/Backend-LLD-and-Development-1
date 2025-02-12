package SOLID.BirdB;

public class Vulture extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Vulture is Making Sound");
    }

    @Override
    public void fly() {
        System.out.println("Fly High");
    }
}
