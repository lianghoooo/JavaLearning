package designPatterns.Single;

public class SingletonDoubleLock {
    private SingletonDoubleLock(){};
    private volatile static SingletonDoubleLock instance;

    public static SingletonDoubleLock getInstance(){
        if (instance==null)
            synchronized (SingletonDoubleLock.class)
            {
                if (instance==null)
                    instance = new SingletonDoubleLock();
            }
        return instance;
    }
}
