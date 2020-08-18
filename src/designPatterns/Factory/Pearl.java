package designPatterns.Factory;

public class Pearl implements Fruit {
    private String name="pearl";
    public Pearl()
    {
        System.out.println("you got one"+this.name);
    }
    @Override
    public void getName() {

    }
}
