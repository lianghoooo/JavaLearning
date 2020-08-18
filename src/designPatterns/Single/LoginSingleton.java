package designPatterns.Single;

public class LoginSingleton {//懒汉+安全的双重要求下可以使用这种方式
    private LoginSingleton(){};
    private static class SingletonHandler{
        private static final LoginSingleton instance = new LoginSingleton();
    }

    public static final LoginSingleton getInstance(){
        return SingletonHandler.instance;
    }

}


