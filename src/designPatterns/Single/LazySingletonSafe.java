package designPatterns.Single;

public class LazySingletonSafe { //不推荐
    private static LazySingletonSafe instance;
    private LazySingletonSafe(){};

    public synchronized static LazySingletonSafe getInstance(){ //多了一个synchronized，但是由于大部分情况下instance都是确定的不需要初始化，因此这种加锁会带来严重的性能影响
        if (instance==null)
            instance = new LazySingletonSafe();
        return instance;
    }
}
