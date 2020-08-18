package designPatterns.Factory;

public class Banana implements Fruit{
    private String name = "banana";
    public Banana()
    {
        System.out.println("you got one"+this.name);
    }
    @Override
    public void getName() {
        System.out.println(this.name);
    }
}
