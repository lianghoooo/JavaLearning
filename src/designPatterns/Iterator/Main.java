package designPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("life code"));
        bookShelf.appendBook(new Book("meet miracle"));
        bookShelf.appendBook(new Book("spring alive"));
        bookShelf.appendBook(new Book("kiss bill"));

        Iterator it = bookShelf.iterator(); // 迭代器部分并没有使用Bookshelf的方法，实现了在main上的有效分离，不用多层改代码
        while(it.hasNext())
        {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
