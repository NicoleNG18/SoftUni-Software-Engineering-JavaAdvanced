package iterators.bookIterator;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    public BookComparator() {
    }

    public int compare(Book o1, Book o2) {
        return o1.compareTo(o2);
    }
}

