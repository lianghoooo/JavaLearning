package designPatterns.Factory;

import java.util.Scanner;

public class WalmartFruitStore implements FruitFactory{
    public WalmartFruitStore(){
        System.out.println("welcome to walmart! please select your ideal items");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        selectFruit(name).getName();
    }
    @Override
    public Fruit selectFruit(String name) {
        if (name=="apple")
            return new Apple();
        if (name=="pearl")
            return new Pearl();
        if (name=="banana")
            return new Banana();

        return null;
    }
}
