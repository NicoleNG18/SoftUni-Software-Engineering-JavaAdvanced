package iterators.bookIterator;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    public Iterator<Book> iterator() {
        return new Iterator<Book>() {
            private int index = 0;

            public boolean hasNext() {
                return this.index < Library.this.books.length;
            }

            public Book next() {
                return Library.this.books[this.index++];
            }
        };
    }
}

