package designPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        FruitFactory w = new WalmartFruitStore();
        w.selectFruit("apple");
    }

}
