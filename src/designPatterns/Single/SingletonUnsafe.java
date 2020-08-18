package designPatterns.Single;

public class SingletonUnsafe {//懒汉式，线程不安全，不推荐

    private SingletonUnsafe(){}; //构造函数私有，因此无法new对象
    private static SingletonUnsafe single; //静态变量才能在静态方法中被调用
    public static SingletonUnsafe getSingle() {
        if (single==null)
            single = new SingletonUnsafe();//构造方法是private，只能内部调用
        return single;
    }
}
