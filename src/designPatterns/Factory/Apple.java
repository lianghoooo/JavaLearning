package designPatterns.Factory;

public class Apple implements Fruit{
    private String name="apple";
    public Apple()
    {
        System.out.println("you got one"+this.name);
    }
    @Override
    public void getName() {
        System.out.println(this.name);
    }
}
