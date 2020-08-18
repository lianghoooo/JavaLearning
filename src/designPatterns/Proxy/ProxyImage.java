package designPatterns.Proxy;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;
    public ProxyImage(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null)
            realImage = new RealImage(fileName);
        realImage.display();// 如果代理中存在该图片则不需要新建RealImage而是直接调用该类中的方法
    }
}
