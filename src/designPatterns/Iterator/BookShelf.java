package designPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements  Aggregate {
    private List<Book> books;// 面向对象的思想，books适合的数据结构一定是list，但具体是哪一个实现类可以后面考虑

    public BookShelf() {
        this.books = new ArrayList<Book>(); // 构造函数是创建一个图书的数组
    }

    public Book getBookAt(int index)
    {
        return books.get(index);
    }

    public void appendBook(Book book)
    {
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);//不需要写BookShelf bookShelf
    }
}
