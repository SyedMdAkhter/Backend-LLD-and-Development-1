package SOLID.BirdB;

public abstract class Bird {
    String type;
    int noOfWings;

    public void eat(){
        System.out.println("Bird is eating");
    }
    public abstract void  makeSound();
}
