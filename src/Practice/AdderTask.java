package Practice;

public class Adder implements Runnable{
    public int num1;
    public int num2;

    public Adder(int number1,int number2){
        this.num1 =number1;
        this.num2 = number2;
    }

    public void run() {
        Add(this.num1, this.num2);
        System.out.println("run() method executed in : "+Thread.currentThread().getName());
    }
    public int Add(int x, int y) {
        return x+y;
    }
}
