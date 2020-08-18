package designPatterns.Single;

public class HungrySingleton {
    private HungrySingleton(){};
    private static HungrySingleton instance = new HungrySingleton();
    public static HungrySingleton getInstance(){
            return instance;
    }
}
